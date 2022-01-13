fun main(){
    println(nbDig(25, 1))
    println(nbDig(5750, 0))
    println(nbDig(11011, 2))
}

//fun nbDig(n:Int, d:Int):Int {
//    var w: Int = 0
//    for ( i in 0..n) {
//        w += (i*i).toString().count { it in d.toString()}
//    }
//    return w
//}

fun nbDig(n:Int, d:Int):Int = (0..n).map{it*it}.sumBy{ it.toString().count{it == d.toString()[0]} }