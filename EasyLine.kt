import java.math.BigInteger;

fun main(){
//    easyLine(13)
    println(easyLine(50))
//    println(easyLine(7))
//    println(easyLine(13))
//    println(easyLine(50))
}

fun easyLine(n:Int):BigInteger {
    var arr = Array<BigInteger>(n+1){BigInteger.ONE}
    var w = BigInteger.ZERO
    (1..n).forEach {
        (it-1 downTo 1).forEach{ if(it>0) arr[it] = arr[it] + arr[it-1] }
    }
    arr.forEach {w+=it*it}
    return w
}