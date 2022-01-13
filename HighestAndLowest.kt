fun main() {
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
}

//fun highAndLow(numbers: String): String = numbers.split(" ").maxBy{it.toInt()} + " " + numbers.split(" ").minBy{it.toInt()}

//fun highAndLow(numbers: String): String = "${numbers.split(" ").maxBy{it.toInt()}} ${numbers.split(" ").minBy{it.toInt()}}"

fun highAndLow(numbers: String): String = numbers.split(" ").map { it.toInt() }.let{"${it.max()} ${it.min()}"}

