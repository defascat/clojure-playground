(ns clojureinaction.demo.var)

(def ^:dynamic TEST)

(println TEST)
(binding [TEST 20](println TEST))
(binding [TEST 30](println TEST))
(println TEST)

;;; ALARM. REPL can fuck your mind
(def ^:dynamic TEST2)
; (def ^:dynamic TEST2)
(println "TEST2" TEST2)


(defn ^:dynamic do-smth [x]
  (+ 2 x))

(defn with-log [f]
  (fn [& args]
    (println "Invoking" f args)
    (apply f args))
  )

; ThreadLocal AOP!
(println (binding [do-smth (with-log do-smth)]
  (do-smth 10)))
(println (do-smth 10))

;;;; GRABLI!!!

(def ^:dynamic *f* 10)

(defn mult [a] (* a *f*))

(binding [*f* 20]
  (println *f*)
  (doall (map mult [1 2 3 4 5])))

(let [*f* 20]
  (println *f*)
  (doall (map mult [1 2 3 4 5])))


