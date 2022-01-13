import kotlin.math.floor

fun main() {
    var x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
    println(gps2(20, x) == 41)
}

fun gps(s:Int, x:DoubleArray):Int {
    var w = 0
    for ( i in 1..(x.size-1)) if ( 3600*(x[i] - x[i-1])/s > w ) w = floor(3600*(x[i] - x[i-1])/s).toInt()
    return w
}

fun gps2(s:Int, x:DoubleArray)= x.toList().windowed(2){ (it[1] - it[0]) * 3600 / s }.max()?.toInt() ?: 0


//fun gps(s: Int, x: DoubleArray) = x.toList()
//    .windowed(2) { it[1] - it[0] }
//    .map { 3600 * it / s }
//    .max()
//    ?.toInt() ?: 0