fun main(){
    //reverseSeq(5).forEach { println(it) }
    println(reverseSeq(5))
}

//fun reverseSeq(n: Int): List<Int> {
//    var lista = mutableListOf<Int>()
//    for ( i in n downTo 1  ) {
//        lista.add(i)
//
//    }
//    return lista
//}

fun reverseSeq(n: Int): List<Int> = (n downTo 1 ).map { it }