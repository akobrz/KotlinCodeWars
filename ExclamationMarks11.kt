fun main(){
    println(replace("AEIOU"))
}

//fun replace(s: String): String = s.toLowerCase().forEach { when(it){
//    'a','e','i','o','u' -> '!'
//    else -> it } }.toString()

//fun replace(s: String): String = s.replace("a","!").replace("e","!").replace("u","!").replace("o","!").replace("i","!")
fun replace(s: String): String = s.replace(Regex("a|e|i|o|u", RegexOption.IGNORE_CASE),"!")


