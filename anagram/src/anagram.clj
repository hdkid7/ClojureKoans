(ns anagram)
((:require [namespace :as []
            ]
           
           
           
           ))


(defn anagram? [word word2]
  (cond (= word word2) false 
        (= (frequencies word) (frequencies word2)) true
        :else false
        )
  )
 
(defn anagrams-for [word prospect-list] ;; <- arglist goes here
    (into [] (filter #(anagram? (clojure.string/lower-case word) %) (map clojure.string/lower-case prospect-list ) ))
)
  
  
  
  
  
  
  
  
  
  



