(ns clojureinaction.demo.sequences)

;;;;;;;;;;;;;;; SEQUENCE = Array

(def test_seq [1 2 3 4 5 6])

(println (first test_seq))
(println (rest test_seq))
(println (conj test_seq 2))
(println (nth test_seq 2))

;;;;;;;;;;;;;;; LIST = LinkedList

; ALERT! ALERT! WTF!
; (def test_list (1 2 3 4 5 6))
(def test_list '(1 2 3 4 5 6))

(println (first test_list))
(println (rest test_list))
(println (conj test_list 2))
(println (nth test_list 2))

;;;;;;;;;;;;;;; Vector = ArrayList
(def test_vector (vector 1 2 3 4 5 6))

(println (first test_vector))
(println (rest test_vector))
(println (conj test_vector 2))
(println (nth test_vector 2))

; OUT_OF_BOUND
; (println (nth test_vector 20)) - die, die, die
(println (get test_vector 20))

(println (assoc test_vector 3 20))
(println (test_vector 4))


;;; HASHMAP
(def test-map {:a 1 :b 2 :c 3}) 

(println test-map)
(println (test-map :a))
(println (:a test-map))
(println (assoc test-map :a 78))
(println (dissoc test-map :a :b))