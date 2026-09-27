

(defn calcular-reposicao [produto estoque-ideal]
  (let [faltam (- estoque-ideal (:quantidade produto))]
    (if (pos? faltam)
      (* faltam (:preco produto))
      0)))

 (calcular-reposicao
  {:nome "Café" :preco 12 :quantidade 301}
  500)