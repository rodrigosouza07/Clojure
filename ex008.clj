

(def transacoes 
  (:id "T006" :cliente "Fábio" 
   :valor 150.00 
   :status :recusada)

 (defn validar-transacao [transacao]
  (cond-> []
    (nil? (:id transacao))
    (conj "A transação precisa de um ID.")

    (not (number? (:valor transacao)))
    (conj "O valor precisa ser um número.")

    (and (number? (:valor transacao))
         (not (pos? (:valor transacao))))
    (conj "O valor precisa ser maior que zero.")))

 (validar-transacao transacao)
;; []

 (validar-transacao {:id nil :valor -10})
;; ["A transação precisa de um ID."
;;  "O valor precisa ser maior que zero."]