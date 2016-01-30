;; Clojure Algorithm Fundamentals: Power of Four
;; Objective: 	Write a method that returns true if a given parameter 
;;				is a power of 4, and false if it's not. If parameter 
;;				is not an Integer (eg String, Array) method should 
;;				return false as well.
;;	
;; Examples:	(isPowerOf4? 3) ; returns false
;;				(isPowerOf4? 4) ; returns true
;;

(ns power-of-four)

(defn isPowerOf4? [x]
 	(def y (/ x 4))
  (if (= y 1) 
   	true
   	(if (> y 3) 
     	(isPowerOf4? y) 
       false)))