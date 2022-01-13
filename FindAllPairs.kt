import kotlin.math.floor

fun main(){
    println(2 == duplicates(intArrayOf(1, 2, 5, 6, 5, 2)))
    println(4 == duplicates(intArrayOf(1, 2, 2, 20, 6, 20, 2, 6, 2)))
    println(3 == duplicates(intArrayOf(0, 0, 0, 0, 0, 0, 0)))
    println(1 == duplicates(intArrayOf(1000, 1000)))
    println(0 == duplicates(intArrayOf()))
    println(0 == duplicates(intArrayOf(54)))
}

//fun duplicates(array: IntArray, pairs: Int = 0 ) = array.toList().groupingBy { it }.eachCount().filter{it.value > 1}.values.sum()/2
// fun duplicates(array: IntArray) = array.toList().groupingBy { it }.eachCount().filter{it.value > 1}.values.map {it / 2 }.sum()
fun duplicates(array: IntArray) = array.groupBy { it }.map {it.value.size / 2 }.sum()
