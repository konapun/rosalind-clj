(defn hamming [seq1 seq2]	
	(defn hamming-rec [seq1 seq2 diff]
		(cond
			(empty? seq1) diff
			(empty? seq2) diff
			:else (if (not= (first seq1) (first seq2))
				(hamming-rec (rest seq1) (rest seq2) (inc diff))
				(hamming-rec (rest seq1) (rest seq2) diff))))
	(hamming-rec seq1 seq2 0))
