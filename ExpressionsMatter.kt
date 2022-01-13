fun main(args: Array<String>) {

    println(6, expressionsMatter(2, 1, 2))
    println(3, expressionsMatter(1, 1, 1))
    println(4, expressionsMatter(2, 1, 1))
    println(9, expressionsMatter(1, 2, 3))
    println(5, expressionsMatter(1, 3, 1))
    println(8, expressionsMatter(2, 2, 2))
    println( 20, expressionsMatter(5, 1, 3))
    println(105, expressionsMatter(3, 5, 7))
    println( 35, expressionsMatter(5, 6, 1))
    println(  8, expressionsMatter(1, 6, 1))
    println( 14, expressionsMatter(2, 6, 1))
    println( 48, expressionsMatter(6, 7, 1))
    println( 60, expressionsMatter( 2, 10,  3))
    println( 27, expressionsMatter( 1,  8,  3))
    println(126, expressionsMatter( 9,  7,  2))
    println( 20, expressionsMatter( 1,  1, 10))
    println( 18, expressionsMatter( 9,  1,  1))
    println(300, expressionsMatter(10,  5,  6))
    println( 12, expressionsMatter( 1, 10,  1))

}



fun expressionsMatter_old(a : Int, b : Int, c : Int) : Int {
    var wynik: Int = a + b + c

    if ( a * b * c > wynik ) wynik = a * b * c
    if ( ( a + b ) * c > wynik ) wynik = (a + b ) * c
    if ( a + b * c > wynik ) wynik = a + b * c
    if ( a * ( b + c ) > wynik ) wynik = a * ( b + c )
    if ( a * b + c > wynik ) wynik = a * b + c

    return wynik
}

fun expressionsMatter(a : Int, b : Int, c : Int) = intArrayOf(a+b+c,a*b*c,(a+b)*c,a+b*c,a*(b+c),a*b+c).max() ?:0

fun println(w1: Int, w2: Int) {
    if ( w1 == w2 ) {
        println("ok")
    } else {
        println("wrong: ${w1} != ${w2}")
    }
}