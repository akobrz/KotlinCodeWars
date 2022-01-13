fun main(){
    println(1 == argsCount(100))
    println(3 == argsCount(100, 2, 3))
    println(2 == argsCount(32, 12))
    println(0 == argsCount())
    println(1 == argsCount("a string!"))
}

fun argsCount(vararg args: Any) = args.size
