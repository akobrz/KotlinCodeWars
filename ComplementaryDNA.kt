fun main() {
    println(makeComplement2("ATTGC"))
}



fun makeComplement(dna : String) : String {
    var w: String = ""
    for ( s in dna ) {
        when(s) {
            'T' -> w += 'A'
            'A' -> w += 'T'
            'C' -> w += 'G'
            'G' -> w += 'C'
        }
    }
    return w
}

fun makeComplement2(dna : String) = dna.map {
        when(it) {
            'T' -> 'A'
            'A' -> 'T'
            'C' -> 'G'
            'G' -> 'C'
            else -> it
        }
    }.joinToString("")