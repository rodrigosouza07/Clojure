

(def produto
  {:nome "Café"
   :preco 12
   :quantidade 301})

 (defn valor-em-estoque [produto]
  (* (:preco produto)
     (:quantidade produto)))

 (valor-em-estoque produto)

 (def outro-produto
  {:nome "Cha-matte"
   :preco 14
   :quantidade 500})

 (defn valores-em-estoque [outro-produto]
  (* (:preco outro-produto)
     (:quantidade outro-produto)))

 (valores-em-estoque outro-produto)