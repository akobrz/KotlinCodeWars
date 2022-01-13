import java.lang.IllegalArgumentException
import kotlin.math.ceil
import kotlin.test.assertEquals

fun main(){

    println("Fixed Tests newAvg")
    var a = doubleArrayOf(14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0)
    testing(newAvg(a, 90.0), 628)
    a = doubleArrayOf(14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0)
    testing(newAvg(a, 92.0), 645)
}


private fun testing(actual:Long, expected:Long) {
    assertEquals(expected, actual)
}

//@Test(expected = IllegalArgumentException::class)
fun testIllegalArgumentException1() {
    println("--- Exception 1 ---")
    val a = doubleArrayOf(14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0)
    newAvg(a, 2.0)
}

//fun newAvg(a:DoubleArray, navg:Double):Long {
//    var don = ceil(navg * (a.size + 1) - a.sum())
//    if ( don >= 0 ) return don.roundToLong()
//    else throw IllegalArgumentException()
//}

fun newAvg(a:DoubleArray, navg:Double) = ceil(navg * (a.size + 1) - a.sum()).toLong().takeIf { it > 0 } ?: throw IllegalArgumentException()


