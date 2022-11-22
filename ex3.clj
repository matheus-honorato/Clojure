(defn Ex3 []
   (def x (atom 1))
   (while ( < @x 10 )
      (do
         (println @x)
         (swap! x inc))))
(Ex3)