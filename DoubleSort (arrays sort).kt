import java.util.*

fun main(){
    var output = dbSort2(arrayOf<Any>("Banana", "Orange", "Apple", "Mango", 0, 2, 2))

    output.forEach { println(it) }
}

fun dbSort(a:Array<Any>):Array<Any> {
    var b: Array<String> = emptyArray()
    var c: Array<Int> = emptyArray()
    var d: Array<Any> = emptyArray()
    a.forEach {
        if (it is String) b += it
        else if (it is Int) c += it
    }
    b.sort()
    c.sort()
    for ( i in c ) d += i
    for ( i in b ) d += i
    return d
}

fun data():Iterable<Array<Any>> {
    return Arrays.asList<Array<Any>>(*arrayOf<Array<Any>>(arrayOf<Any>(arrayOf<Int>(6, 2, 3, 4, 5), arrayOf<Int>(2, 3, 4, 5, 6)), arrayOf<Any>(arrayOf<Int>(14, 32, 3, 5, 5), arrayOf<Int>(3, 5, 5, 14, 32)), arrayOf<Any>(arrayOf<Int>(1, 2, 3, 4, 5), arrayOf<Int>(1, 2, 3, 4, 5)), arrayOf<Any>(arrayOf<Any>("Banana", "Orange", "Apple", "Mango", 0, 2, 2), arrayOf<Any>(0, 2, 2, "Apple", "Banana", "Mango", "Orange")), arrayOf<Any>(arrayOf<Any>("C", "W", "W", "W", 1, 2, 0), arrayOf<Any>(0, 1, 2, "C", "W", "W", "W"))))
}

fun dbSort2(a:Array<Any>) :Array<Any>
        = ( a.filterIsInstance<Int>().sorted() + a.filterIsInstance<String>().sorted() ).toTypedArray()

fun dbSort3(a:Array<Any>): Array<Any> = (a.filterIsInstance<String>().sorted() + a.filterIsInstance<Int>().sorted()).toTypedArray()