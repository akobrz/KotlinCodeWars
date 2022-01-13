import java.util.Arrays
import kotlin.test.assertEquals

fun main(){
    println("Fixed Tests partlist")
    var s1 = arrayOf<String>("cdIw", "tzIy", "xDu", "rThG")
    var a = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]"
    testing2(Arrays.deepToString(partlist(s1)), a)
    s1 = arrayOf<String>("I", "wish", "I", "hadn't", "come")
    a = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]"
    testing2(Arrays.deepToString(partlist(s1)), a)

}

fun testing2(actual:String, expected:String) {
    assertEquals(expected, actual)
}

//fun partlist(arr:Array<String>):Array<Array<String>> {
//    var wyn = arrayOf<Array<String>>()
//    for ( i in 0..(arr.size-2)) {
//        var array = arrayOf("","")
//        for ( j in 0..i) {
//            if ( j > 0 ) array[0] += " "
//            array[0] += arr[j]
//        }
//        for ( j in (i+1)..(arr.size-1)) {
//            array[1] += arr[j]
//            if ( j < arr.size-1 ) array[1] += " "
//        }
//        wyn += array
//    }
//    return wyn
//}


fun partlist(arr: Array<String>): Array<Array<String>> {
    return (1 until arr.size).map {
        arrayOf(arr.take(it).joinToString(" "), arr.drop(it).joinToString(" "))
    }.toTypedArray()
}