

(def transacoes
  [
   {:id "T001" :cliente "Ana"   :valor 45.90 :status :aprovada}
   {:id "T002" :cliente "Bruno" :valor 120.00 :status :recusada}
   {:id "T003" :cliente "Caio"  :valor 32.50 :status :aprovada}
   {:id "T004" :cliente "Dani"  :valor 80.00 :status :em-analise}
   {:id "T005" :cliente "Eva"   :valor 19.90 :status :aprovada}
   (:id "T006" :cliente "Fábio" :valor 150.00 :status :recusada)
   {:id "T007" :cliente "Gabi"  :valor 75.00 :status :aprovada}
   {:id "T008" :cliente "Hugo"  :valor 60.00 :status :em-analise}
   {:id "T009" :cliente "Iris"  :valor 25.00 :status :aprovada}
   {:id "T010" :cliente "João"  :valor 90.00 :status :recusada}
   {:id "T011" :cliente "Lara"  :valor 55.00 :status :aprovada}
   {:id "T012" :cliente "Mário" :valor 40.00 :status :em-analise}
   ])

 (def aprovados
  (filter #(= :aprovada (:status %)) transacoes))
  
 (reduce + 0 (map :valor aprovados))

 (count (filter #(= :aprovada (:status %)) transacoes))

 (defn contar-por-status [transacoes status]
  (count
    (filter #(= status (:status %)) transacoes)))

 (contar-por-status transacoes :aprovada)
(contar-por-status transacoes :recusada)
(contar-por-status transacoes :em-analise)

 (defn resumo-do-dia [transacoes]
  (map (fn [status]
         {:status status
          :quantidade (contar-por-status transacoes status)})
       [:aprovada :recusada :em-analise]))
(resumo-do-dia transacoes)

 

 