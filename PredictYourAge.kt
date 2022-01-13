import kotlin.math.sqrt

fun main(){
    println(86 == predictAge(65, 60, 75, 55, 60, 63, 64, 45))
}

//fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int)= floor(sqrt((age1*age1+age2*age2+age3*age3+age4*age4+age5*age5+age6*age6+age7*age7+age8*age8)/4.0)).toInt()

fun predictAge(vararg age: Int)= sqrt(age.map { it->it*it }.sum()/4.0).toInt()