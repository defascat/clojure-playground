(ns clojureinaction.demo.string)

(println "String functions work" (.startsWith "abc" "a"))
(println "Class for 22 is" (.getClass 22))
(println "Class for 22.22 is" (.getClass 22.22))
(println "Class for 4/9 is" (.getClass (/ 4 9)) " Value: " (/ 4 9))
(println "Test value. INT" (* (/ 4 9) (/ 9 4)))
(println "Class for 4.0/9 is" (.getClass (/ 4.0 9)) " Value: " (/ 4. 9))

(println (.getClass java.lang.Integer/MAX_VALUE))
(println (.getClass (+ 1 java.lang.Integer/MAX_VALUE)))
; DON'T BELIEVE EVERYTHING YOU READ
(println (.getClass (+ java.lang.Long/MAX_VALUE) 1))