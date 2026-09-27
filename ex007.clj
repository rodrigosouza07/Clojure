

(def transacoes
  [
   {:id "T001" :cliente "Ana"   :valor 45.90 :status :aprovada}
   {:id "T002" :cliente "Bruno" :valor 120.00 :status :recusada}
   {:id "T003" :cliente "Caio"  :valor 32.50 :status :aprovada}
   {:id "T004" :cliente "Dani"  :valor 80.00 :status :em-analise}
   {:id "T005" :cliente "Eva"   :valor 19.90 :status :aprovada}
   ])
  

 (def aprovados
  (filter #(= :aprovada (:status %)) transacoes))
  
 (reduce + 0 (map :valor aprovados))

 