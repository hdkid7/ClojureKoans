(ns armstrong-numbers
  (:require [clojure.string :as str]))


(defn amountOfDigits [num]
  (count (str num))
  )

(defn exp [x n]
  (reduce * (repeat n x)))


(defn digitArray [num]
  (map #(Integer/parseInt %) (str/split (str num) #""))
  )


(defn armstrong? [num] ;; <- arglist goes here
 (= (reduce + (map #(exp % (amountOfDigits num)) (digitArray num))) num)
)
