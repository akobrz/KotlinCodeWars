import kotlin.math.max

fun main(){
    println("Fixed Tests maxRot")
    testing(maxRot(38458215), 85821534)
    testing(maxRot(195881031), 988103115)
    testing(maxRot(896219342), 962193428)
}

fun maxRot(n:Long):Long = rotate(n, 0, n)

fun rotate(n:Long,d:Int,m:Long):Long {
    var s1 = n.toString().substring(0..(d-1))
    var s2 = n.toString().substring((d)..(n.toString().length-1))
    var s3 = s2.substring(1..(s2.length-1)) + s2[0]

    if ( d >= n.toString().length - 1 ) return max(m, (s1+s3).toLong() )
    else return rotate((s1+s3).toLong(), d + 1, max(m, (s1+s3).toLong() ))
}

private fun testing(actual:Long, expected:Long) {
    println(actual==expected)
}


fun test() {
    println("Fixed Tests maxRot")
    testing(maxRot(38458215), 85821534)
    testing(maxRot(195881031), 988103115)
    testing(maxRot(896219342), 962193428)

}

//fun maxRot(n:Long):Long = generateSequence("" to n.toString()) {
//    it.takeIf{ it.second.length >= 2}
//        ?.let{ (a, b) -> (a + b[1]) to (b.drop(2) + b[0]) }
//}.map { (a, b) -> (a + b).toLong() }
//    .max() ?: n