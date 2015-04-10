(ns clojureinaction.demo.wtf)

; final-amount = principle * (1 + rate/100) ^ time-periods

(defn final-amount [principle rate time-periods]
  (* principle (Math/pow (+ 1 (/ rate 100)) time-periods))
  )  

(defn final-amount-still-shit [principle rate time-periods]
  (-> rate (/ 100)(+ 1) (Math/pow time-periods)(* principle))
  )  

(println (final-amount 100 20 1))
(println (final-amount 100 20 2))

(println (final-amount-still-shit 100 20 1))
(println (final-amount-still-shit 100 20 2))

; Too much functions!

; mod % 2 - Hello, Java

(println(filter #(= (mod % 2) 0) (range 1 10)))