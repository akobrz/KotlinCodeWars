fun main(){
    println(true == smallEnough(intArrayOf(66, 101), 200))
    println(false == smallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100))
    println(true == smallEnough(intArrayOf(101, 45, 75, 105, 99, 107), 107))
    println(true == smallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120))
}

// fun smallEnough(a : IntArray, limit : Int) = a.filter { it <= limit }.count() == a.size
// fun smallEnough(a : IntArray, limit : Int) = a.count { it <= limit } == a.size
// fun smallEnough(a: IntArray, limit: Int) = a.all { it <= limit }
fun smallEnough(a: IntArray, limit: Int) = a.none { it > limit }