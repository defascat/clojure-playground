(ns clojureinaction.demo.functions)

(require '(clojure [xml :as xml-core]))

; ALARM! . is important, without it it's static!
(let [d (xml-core/parse (java.io.ByteArrayInputStream. (.getBytes "<root a=\"10\">Hello</root>")))] (println d))

;;;;;;;;; Function definition

(defn item-total [price quantity]
  {
   :pre [(> price 0) (> quantity 0)] ; SO FRIENDLY!
   :post [(> % 0)]
   }
  (* price quantity)
  )

(println (item-total 1 2))
; (println (item-total -1 2))

(defn item-total-1 
  ([price quantity]
    (* price quantity))
  ([price]
    (item-total-1 price 1))
  )

(println (item-total-1 1))
(println (item-total-1 1 2))

(defn item-total-2 
  [x & more]
    (apply + more)
  )

(println (item-total-2 1 2 3))

;;; RECURSIVE
(defn count-down [n]
  (when (> n 0)
    (if (= (mod n 10000) 0) 
      (println "R:" n)
      )
    ;(count-down (- n 1))
    (recur (dec n))
    )
)

(count-down 10000)

(println "EVERY TRUE" (every? true? [true]))
(println "EVERY TRUE" (every? true? [true false true]))
(println "SOME" (some true? [true true true]))
(println "SOME" (some? 5)) ; WTF! 


;;;; MEMOIZE !

(defn slow-calc [n m]
  (java.lang.Thread/sleep 200)
  (* n m))

(def fast-calc (memoize slow-calc))

(println (time (slow-calc 1 1)))
(println (time (slow-calc 1 1)))
(println (time (fast-calc 2 2)))
(println (time (fast-calc 2 2)))
(println (time (fast-calc 2 3)))
(println (time (fast-calc 2 2)))

