(ns clojureinaction.demo.prime)

(defn prime? [x]
  (let [divs (range 2 (inc (int (Math/sqrt x))))
        rems (map #(rem x %) divs)]
                  (not (some zero? rems))))

(println "13" (prime? 13))

(println
  (let [x (range 2 1024)]
    (filter prime? x)
   ))
      
(println
  (let [x (range 2 1024)]
    (for [a x b x :when (and (prime? (+ a b)) (prime? b) (prime? a))]
      (list a b))
   ))


