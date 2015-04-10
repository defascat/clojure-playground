(ns clojureinaction.demo.flow)

(defn check-data [a]
  (println a)

  ; if
  (if (= a 2)
    (println "= true")
    (println "= false")
    )
  ; if !
  (if-not (= a 2)
    (println "!= true")
    (println "!= false")
    )
  ; Cool if-switch
  (cond
    (< a 1) (println "Zero")
    (> a 1) (println "Ту ті ту ту")
    :default (println "Noooo! ONE" a)
    )
  
  ; WAT!
  (for [x (range 0 10)] (println "it" x))
  
  ; DORUN!!!
  (comment 
   "Please uncomment me!"
   (dorun (for [x (range 0 10)] (println "it" x)))
   )

  (doseq [u (range 10)] (println "doseq" u))
  
  ; Again DORUN
  (dorun (dotimes [x 10] (println "dotimes" x)))
  
  ; Multiple for
  (dorun (for [x (range 0 3) y (range 3)] (println [x y])))
  
  
  ; Tail recursion limitation overcoming!
  (dorun (loop [cur 10]
           (when (> cur 1)
             (println cur)
             (recur (- cur 2)
             )
             )
    ))
   
  
  (println "DONE")
  )

(check-data (rand-int 3))