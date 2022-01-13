fun main(){
    println(calculateYears(10).forEach { println(it) })
}

fun calculateYears(years: Int): Array<Int> = when ( years ) {
        1 -> arrayOf(years, 15, 15 )
        2 -> arrayOf(years, 24, 24 )
        else -> arrayOf(years, 24 + 4 * ( years - 2 ), 24 + 5 * (years - 2 ))
    }
