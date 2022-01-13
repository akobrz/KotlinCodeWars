fun main(){
    println(longest("aretheyhere", "yestheyarehere"))
    println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
    println(longest("inmanylanguages", "theresapairoffunctions"))

}

//fun longest(s1:String, s2:String):String = (s1+s2).toList().sorted().distinct().joinToString("")

fun longest(s1:String, s2:String):String = (s1+s2).toSortedSet().joinToString("")
