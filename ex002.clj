(def preco [12 5 8])
(reduce + preco)
(def total (reduce + preco))

(println total)
;;=> nil
;;=> nil
;;=> nil


(defn somar [a b]
  (+ a b))
(println (somar 3 5))
;;=> nil
;;=> nil

(defn multiplicar [a b]
  (* a b))
(println (multiplicar 3 6))
;;=> nil
;;=> nil

(defn dividir [a b]
  (/ a b))
(println (dividir 10 2))
;;=> nil
;;=> nil
;;=> nil

(defn subtrair [a b]
    (- a b))
(println (subtrair 10 2))
;;=> nil
;;=> nil
