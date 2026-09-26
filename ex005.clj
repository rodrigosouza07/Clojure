(def produtos
  [
   {:nome "Café"
    :preco 12
    :quantidade 301}

   {:nome "Cha-matte"
    :preco 14
    :quantidade 500}

   {:nome "Açucar"
    :preco 5
    :quantidade 1000}

   {:nome "Leite"
    :preco 6
    :quantidade 400}

   {:nome "Cerveja"
    :preco 8
    :quantidade 200}

   {:nome "Refrigerante"
    :preco 7
    :quantidade 300}

   {:nome "Agua"
    :preco 3
    :quantidade 1000}

   {:nome "Suco"
    :preco 10
    :quantidade 150}

   {:nome "Pao"
    :preco 4
    :quantidade 500}

   {:nome "Queijo"
    :preco 15
    :quantidade 200}
   ])(defn valores-em-estoque [produtos]
  (* (:preco produtos)
     (:quantidade produtos)))(map valores-em-estoque produtos)(reduce + (map valores-em-estoque produtos))(map :nome produtos)(map :nome (filter #(<= (:quantidade %) 200) produtos))(defn precisa-repor? [produtos]
  (<= (:quantidade produtos) 500))(precisa-repor? (first produtos))(filter #(<= (:quantidade %) 500) produtos) (map :nome (filter precisa-repor? produtos))