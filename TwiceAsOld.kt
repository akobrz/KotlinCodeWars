fun main(){
    println(twiceAsOld(36,7))
}

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    for ( i in sonYearsOld downTo 0 ) {
        if ( 2 * (sonYearsOld - i) == dadYearsOld - i ) return i
    }
    for ( i in 0 .. dadYearsOld ) {
        if ( 2 * ( sonYearsOld + i ) == dadYearsOld + i ) return i
    }
    return 0
}