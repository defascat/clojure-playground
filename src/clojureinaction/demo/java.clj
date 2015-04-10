(ns clojureinaction.demo.java)

(import java.util.Random)

(defn check-data "I'm going to do nothing! HA-HA!" [a]
  (println a)
  )

(let [a (.nextInt (Random.) 3)] ; <-- Beautiful scope!
  (check-data a)
  )

(let [a (rand-int 3)]
  (check-data a)
  )