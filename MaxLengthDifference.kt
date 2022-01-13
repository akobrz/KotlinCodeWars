import kotlin.math.abs
import kotlin.math.max

fun main(){
    println("mxdiflg Fixed Tests")
    var s1 = arrayOf<String>("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
    var s2 = arrayOf<String>("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
    println(13,mxdiflg(s1, s2))
    s1 = arrayOf<String>("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
    s2 = arrayOf<String>("bbbaaayddqbbrrrv")
    println(10,mxdiflg(s1, s2))
}

//fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
//    var w: Int = -1
//    for ( i in 0..(a1.size-1)) {
//        for ( j in 0..(a2.size-1)) {
//            if ( (a1[i].length - a2[j].length).absoluteValue > w )
//                w = (a1[i].length - a2[j].length).absoluteValue
//        }
//    }
//    return w
//}

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
    var w: Int = -1
    for ( i in a1) {
        for ( j in a2) {
            w = max(w, abs(i.length - j.length))
        }
    }
    return w
}

//fun mxdiflg(a1:Array<String>, a2:Array<String>)
//        = a1.flatMap { s1 -> a2.map { kotlin.math.abs(s1.length - it.length) } }.max() ?: -1