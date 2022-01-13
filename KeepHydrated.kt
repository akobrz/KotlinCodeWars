fun main(args: Array<String>) {
    println(1, litres(2.0))
    println(0, litres(1.4))
    println(6, litres(12.3))
    println(0, litres(0.82))
    println(5, litres(11.8))
    println(893, litres(1787.0))
    println(0, litres(0.0))
}

fun assertEquals3(n1: Int, n2: Int) {
    println(n1.equals(n2))
}

fun litres(time: Double) = Math.floor(time*0.5).toInt()
