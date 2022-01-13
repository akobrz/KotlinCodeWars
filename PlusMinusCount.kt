import kotlin.math.sign

fun main(){
//    println(catchSignChange(arrayOf(-47,84,-30,-11,-5,74,77)))
    println(catchSignChange(arrayOf(1, -2, -7, -4, 4, -2, 0, -3, 3)))
}

//fun catchSignChange(arr: Array<Int>): Int {
//    if ( arr.size == 0) return 0
//
//    var t = 0
//    var s = arr.first().sign
//
//    arr.forEach {
//        if ( s < 0 && ( s * it < 0 || s * it == 0 )) {
//            s = 1
//            t++
//        } else if ( s > 0 && ( s * it < 0 )) {
//            s = -1
//            t++
//        }
//
//    }
//    return t
//}

fun catchSignChange(arr: Array<Int>): Int = arr.asSequence().windowed(2).count { (x, y) -> x.sign != y.sign }