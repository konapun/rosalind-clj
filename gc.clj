(use 'clojure.java.io)

;; read in a fasta file, mapping identifier lines to sequence for that identifier
(defn map-fasta [path]
	(with-open [rdr (reader path)]
		(doseq [line (line-seq rdr)]
			(if (= \> (first line)) ; identifier for new sequence
				(println line))))) ;TODO

(defn gc-content [nucs]
	(let [freqs (frequencies nucs)]
		(/ (+ (get freqs \G) (get freqs \C)) (count nucs))))

		
