import java.util.*

fun main(){
    println(Arrays.toString(makeValley(intArrayOf(17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1))))
}

fun makeValley(arr:IntArray):IntArray {
    var r = IntArray(arr.size)
    var left = 0
    var right = arr.size - 1
    var tick = false
    arr.sortedDescending().forEach {
        if ( tick ) {
            r[right] = it
            right--
            tick = false
        } else {
            r[left] = it
            left++
            tick = true
        }
    }
    return r
}

fun makeValley2(arr:IntArray) = with (arr.sortedDescending().withIndex().partition { it.index % 2 == 0 } ) { first.plus(second.reversed()).map { it.value }.toIntArray() }

//   1 -> arr
//  else -> arr.sortedArrayDescending().withIndex().groupBy { it.index % 2 }.map { it.value.map { it.value } }.windowed(2) { it[0] + it[1].sorted() }.flatten().toIntArray()