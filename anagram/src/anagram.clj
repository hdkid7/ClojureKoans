(ns anagram
  (:require [clojure.string :as str]
      )
  )

(defn anagram? [word word2]
  (cond (= word word2) false 
        (= (frequencies word) (frequencies word2)) true
        :else false
        )
  )
 
(defn anagrams-for [word prospect-list] ;; <- arglist goes here
    (into [] (filter #(anagram? (str/lower-case word) %) (map str/lower-case prospect-list ) ))
)
  
  
  
  
  
  
  
  
  
  



