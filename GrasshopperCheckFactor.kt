fun main(){
    println(true == checkForFactor(10, 2))
    println(true == checkForFactor(63, 7))
    println(true == checkForFactor(2450, 5))
    println(true == checkForFactor(24612, 3))
    println(false == checkForFactor(9, 2))
    println(false == checkForFactor(653, 7))
    println(false == checkForFactor(2453, 5))
    println(false == checkForFactor(24617, 3))
}

// fun checkForFactor(base: Int, factor: Int) = if ( base % factor == 0 ) true else false

fun checkForFactor(base: Int, factor: Int) = base % factor == 0