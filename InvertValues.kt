fun main(){
    invert(intArrayOf(1,2,3,4,5))

}

fun invert(arr: IntArray): IntArray {
    println(arr.toList().map { it * (-1) }.toIntArray())

    //return arr.toList().map { it * (-1) }.toIntArray()
    return arr.map { -it }.toIntArray()
}