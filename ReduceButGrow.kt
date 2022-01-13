fun main(){
    println(grow(intArrayOf(2, 2, 2, 2, 2, 2)))
}

//fun grow(arr: IntArray): Int {
//    var w = 1
//    arr.forEach { w *= it }
//    return w
//}

fun grow(arr: IntArray): Int {
    return arr.reduce { a, b -> a * b }
}