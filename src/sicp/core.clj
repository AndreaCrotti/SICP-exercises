(ns sicp.core)

(defn square
  [n]
  (* n n))

(defn- n-largest
  "N largest elements in a list"
  [xs n]
  (->> xs sort reverse (take n)))

(defn one-three
  [x y z]
  (apply + (map square (n-largest [x y z] 2))))
