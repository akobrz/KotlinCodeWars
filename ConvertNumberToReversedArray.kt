
fun main(){
    println(digitize(35231))

}

fun digitize(n:Long):IntArray {
    println(n.toString().map { "${it}".toInt() }.reversed())


    return n.toString().map { "${it}".toInt() }.reversed().toIntArray()
}