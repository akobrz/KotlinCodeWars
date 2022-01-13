fun main(){
    println(evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3))
    println(evenNumbers(listOf(-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26), 2))
    println(evenNumbers(listOf(6, -25, 3, 7, 5, 5, 7, -3, 23), 1))

}

//fun evenNumbers(array: List<Int>, number: Int): List<Int> = array.toList().filter { it % 2 == 0 }.takeLast(number)

fun evenNumbers(array: List<Int>, number: Int): List<Int> = array.filter { it % 2 == 0 }.takeLast(number)
