(ns clojureinaction.demo.typing)

(defn time-check-reflection [a]
  (.hashCode a))

(defn time-check-direct [^Long a]
  (.hashCode a))

(defn benchmark [func num]
  (time (dorun 
          (for [x (range 0 num)]
            (func x)
            )
          )
        )
  )

(let [num 100000]
  (println (benchmark time-check-direct num))
  (println (benchmark time-check-reflection num))
  )
