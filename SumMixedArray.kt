fun main(args: Array<String>){
    assertEquals2(10, sum(listOf(5,"5")));
    assertEquals2(22, sum(listOf(9, 3, "7", "3")));
    assertEquals2(42, sum(listOf("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    assertEquals2(41, sum(listOf("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    assertEquals2(45, sum(listOf("1", "5", "8", 8, 9, 9, 2, "3")));
    assertEquals2(41, sum(listOf("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    assertEquals2(61, sum(listOf(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
}

fun assertEquals2(w1: Int, w2: Int) = println(w1 == w2 )

fun sum(lista: List<Any>) = lista.sumBy { it.toString().toInt() }


