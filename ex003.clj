
; Calcula o total de um produto
(def preco 12)
(def quantidade 3)
(* preco quantidade)
 ; Calcula o total de uma lista de produtos
(def preco [12 8 5])
(reduce + preco)

 ; calcular valor e valor total de frete
(defn calcular-frete [total]
  (if (>= total 100)
    0
    10))
(defn total-com-frete [total]
  (+ total (calcular-frete total))) (calcular-frete 16)(total-com-frete 16) (defn somar-precos [precos]
  (reduce + 0 precos))(defn calcular-frente [total]
  (if (>= total 100)
    0
    10))

(defn total-compra [precos]
  (let [subtotal (somar-precos precos)
        frete (calcular-frente subtotal)]
    (+ subtotal frete))

(somar-precos [12 8 5])
(total-compra [12 8 5])

(defn calcular-desconto [subtotal quantidade]
  (if (>= quantidade 5)
    (* subtotal 0.10)
    0))

(calcular-desconto 200 5)

 (defn total-com-desconto [precos quantidade]
  (let [subtotal (somar-precos precos)
        desconto (calcular-desconto subtotal quantidade)]
    (- subtotal desconto)))

(total-com-desconto [100] 6)