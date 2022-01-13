fun main(){
    println(6 == maxMultiple(2, 7))
    println(9 == maxMultiple(3, 10))
    println(14 == maxMultiple(7, 17))
    println(50 == maxMultiple(10, 50))
    println(185 == maxMultiple(37, 200))
    println(98 == maxMultiple(7, 100))
}

fun maxMultiple(d: Int, b: Int) = (1..b).filter { it % d == 0 }.last()


//fun maxMultiple2(d: Int, b: Int): Int {
//    var max = 1
//    for (n in 1..b) {
//        if ( n % d == 0 ) {
//            if ( max < n ) max = n
//        }
//    }
//    return max
//}

// fun maxMultiple(d: Int, b: Int) = (1..b).filter({it % d == 0}).last()