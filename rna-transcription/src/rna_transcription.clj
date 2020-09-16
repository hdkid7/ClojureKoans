(ns rna-transcription
  (:require [clojure.string :as str])
  )


(defn transcribe [character]
(cond
  (= character "G") "C" 
  (= character "C") "G"
  (= character "T") "A"
  (= character "A") "T"
  (= character "U") "A"

  :else (throw (Exception. "Invalid Value")))
  )


(defn splitter
  [string] 
  (str/split string #"")
)


(defn to-rna [dna] ;; <- arglist goes here
  (apply str (map transcribe (splitter dna))
))


