(defn hamming [seq1 seq2]	
	(letfn [
		(hamming-rec [seq1 seq2 diff]
			(if (or (empty? seq1) (empty? seq2))
				diff
				(if (not= (first seq1) (first seq2))
					(hamming-rec (rest seq1) (rest seq2) (inc diff))
					(hamming-rec (rest seq1) (rest seq2) diff))))]
			(hamming-rec seq1 seq2 0)))
