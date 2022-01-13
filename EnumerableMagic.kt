fun main(){
    println(include(intArrayOf(1,2,3,4), 2))
}

fun include2(arr: IntArray, item : Int) = arr.any { it == item }

fun include3(arr: IntArray, item : Int) = arr.any { it == item }

fun include(arr: IntArray, item : Int) = item in arr