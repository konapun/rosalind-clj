(defn print-freqs [nucs]
    (let [freqs (frequencies nucs)]
            (println (get freqs \A) (get freqs \C) (get freqs \G) (get freqs \T))))
