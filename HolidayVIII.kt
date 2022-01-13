import kotlin.math.floor

fun main(){
    println(166 == dutyFree(12, 50, 1000))
    println(294 == dutyFree(17, 10, 500))
    println(357 == dutyFree(24, 35, 3000))
    println(60 == dutyFree(377, 40, 9048))
    println(10 == dutyFree(2479, 51, 13390))

    println(9048/(377*40/100))
}

fun dutyFree(normPrice: Int, discount:Int, hol:Int) = (100 * hol / (normPrice * discount))