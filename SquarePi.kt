import java.lang.Math.pow
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.sqrt

val PI = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"

fun main(){
    println(squarePi(10))
    println(squarePi(5))
}

fun squarePi(digits: Int)= ceil(sqrt(PI.split("").subList(1,digits+1).map{ it.toDouble().pow(2) }.sum())).toInt()

//fun squarePi(digits: Int) = ceil(sqrt(PI.split("").subList(1, digits + 1).map{ it.toDouble().pow(2) }.sum())).toInt()
