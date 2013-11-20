(defn dna-to-rna [nucs]
    (clojure.string/replace nucs #"T" "U"))

