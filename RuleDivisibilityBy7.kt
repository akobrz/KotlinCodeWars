fun main(){
//    var aa = longArrayOf(0L, 0L)
    var aa = seven(234002979)

    for ( i in aa ) println(i)
}

fun seven(n:Long, s:Long = 1):LongArray {
    if ( n == 0L ) return longArrayOf(0L,0L)
    else if ( ((n / 10).toLong() - 2 * (n % 10)) / 100 < 1 ) return longArrayOf((n / 10).toLong() - 2 * (n % 10), s)
    else return seven((n / 10).toLong() - 2 * (n % 10), s + 1)
}


//fun seven(n: Long, i: Long = 0): LongArray =
//    if (n > 99) seven(n / 10 - n % 10 * 2, i + 1)
//    else longArrayOf(n, i)