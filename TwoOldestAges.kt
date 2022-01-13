fun main() {
    println(twoOldestAges(listOf(1,5,87,45,8,8)))
    println(listOf(45, 87))

    println(twoOldestAges(listOf(6,5,83,5,3,18)))
    println(listOf(18, 83))

    println(twoOldestAges(listOf(6,5,83,5,83,18)))
    println(listOf(83, 83))

}

//fun twoOldestAges(ages: List<Int>): List<Int> = listOf(ages.sorted().slice(0 until ages.size-1).max()!!.toInt(),ages.max()!!.toInt())

fun twoOldestAges(ages: List<Int>): List<Int> = ages.sorted().takeLast(2)