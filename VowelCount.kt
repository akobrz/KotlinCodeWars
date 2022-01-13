fun main(){
    println(getCount("abracadabra"))
}

//fun getCount(str : String) : Int = str.filter { when (it) {
//    'a' -> true
//    else -> false
//} }.count { when (it) {
//    'a' -> true
//    else -> false }}

//fun getCount(str : String) : Int = str.count { when (it) {
//    'a','e','i','o','u' -> true
//    else -> false }}

fun getCount(str: String): Int = str.count{it in "aeiou"}