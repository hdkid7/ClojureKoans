(ns rotational-cipher
(:require [clojure.string :as str])
  )
;; 65 - 90 -> (A-Z)
;; 97 - 122 
(defn rotate [shiftInterger, string] ;; <- arglist goes here

  ;; your code goes here

  (apply str (interpose " " (map #(transform shiftInterger %) (str/split string #" "))))
  




  (defn transform [shiftInterger,word]
    (apply str (map #(char (+ shiftInterger %1)) (map int word)))
    ))
