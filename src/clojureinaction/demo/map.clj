(ns clojureinaction.demo.map)

(println (map inc [1 2 3 4]))

(println (map list [1 2 3 4] [2 3 4 5]))

(let [m {:a "b" :c "d"}] 
  (println (keys m))
  (println (map second m))
  )

(defn square [x]
  (* x x))

(println (map square [1 2 3 4]))

(defn to-str [x]
  (.length (str x)))

(println (map to-str [11 2222 3333 111]))


;;;;;;;;;;;;;;;;;;  FILTER

(defn even [x]
  (= (mod x 2) 0))

(let [a (range 10)]
  (println "EXTERNAL FUNC: " (filter even a
         ))
  )

(println "INLINE FUNC: " (filter #(= (mod % 2) 0) (range 10)))

;;;;;;;;;;;;;;;;;;  REDUCE

(println "SUM" (reduce + (range 1 10)))
(println "SUM INLINE" (reduce #(+ %1 %2) (range 1 10)))

(println "FACTORIAL" (reduce * (range 1 10)))

