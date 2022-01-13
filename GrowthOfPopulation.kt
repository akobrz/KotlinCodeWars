fun main(){
    println(nbYear(1500, 5.0, 100, 5000))
    println(nbYear(1500000, 2.5, 10000, 2000000))

}

//fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
//    var years: Int = 0
//    var pop: Int = pp0
//    while( pop < p ) {
//        pop += (pop*percent/100 + aug).toInt()
//        years += 1
//    }
//    return years
//}

fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int = generateSequence(pp0.toDouble()){it * ( 1 + percent / 100 ) + aug}.takeWhile { it < p }.count()