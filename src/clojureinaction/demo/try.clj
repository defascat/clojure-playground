(ns clojureinaction.demo.try)

(defn try-demo[a b]
  (try
    (/ a b)
    (catch Exception e (println (.getMessage e)))
    (finally (println "Finally")))  
  )

(do
  (try-demo 5 0)
  (try-demo 5 1)
  )