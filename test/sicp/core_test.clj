(ns sicp.core-test
  (:require [clojure.test :refer :all]
            [sicp.core :refer :all]))

(deftest chapter2
  (testing "Square"
    (is (= 4 (square 2))))
  (testing "One Three"
    (is (= (one-three 1 3 4) 25))
    (is (= (one-three 3 2 1) 13))))

;TODO: why the loop would not work?
;maybe it needs doseq instead?
;; (let [input-output {[1 3 4] 25, [3 2 1] 13}]
;;   (for [io input-output]
;;     (is (= (one-three (key io)) (val io)))))))
