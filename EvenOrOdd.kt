fun main(args: Array<String>) {
    println(evenOrOdd(2))
    println(evenOrOdd(0))
    println(evenOrOdd(7))
    println(evenOrOdd(1))
}

fun evenOrOdd(number: Int) = if ( number.rem(2) == 0 ) "Even" else "Odd"