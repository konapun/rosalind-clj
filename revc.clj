(defn revcomp [nucs]
	(clojure.string/join "" (map (fn [nuc]
		(cond
			(= nuc \A) \T
			(= nuc \T) \A
			(= nuc \C) \G
			(= nuc \G) \C)) (seq (clojure.string/reverse nucs)))))
