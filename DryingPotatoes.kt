fun main(){
    dotest(99, 100, 98, 50)
    dotest(82, 127, 80, 114)
    dotest(93, 129, 91, 100)
    dotest(82, 134, 77, 104)
    dotest(84, 65, 80, 52)
    dotest(96, 180, 91, 80)
}

fun potatoes(p1:Int, w1:Int, p2:Int): Int {
    println((w1 - w1 * p1 / 100.0) * 100 / (100 - p2))
    return ((w1 - w1 * p1 / 100.0) * 100 / (100 - p2) * 1.00002).toInt()
}

    private fun dotest(p0:Int, w0:Int, p1:Int, expected:Int) {
        println(expected, potatoes(p0, w0, p1))
    }
