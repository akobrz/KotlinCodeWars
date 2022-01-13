fun main(){
    println(findShort("turns out random test cases are easier than writing out basic ones"))
}

fun findShort(s: String) = s.split(" ").minBy { it.length }!!.length
