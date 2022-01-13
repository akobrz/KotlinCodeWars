fun main(){
    println(true == feast("great blue heron", "garlic naan"))
    println(true == feast("chickadee", "chocolate cake"))
    println(false == feast("brown bear", "bear claw"))
    println(true == feast("marmot", "mulberry tart"))
    println(true == feast("porcupine", "pie"))
    println(false == feast("electric eel", "lasagna"))
    println(true == feast("slow loris", "salsas"))
    println(true == feast("ox", "orange lox"))
    println(true == feast("blue-footed booby", "blueberry"))
}

fun feast(beast: String, dish: String): Boolean {
//    return beast[0] == dish[0] && beast[beast.length-1] == dish[dish.length-1]
    return beast.first() == dish.first() && beast.last() == dish.last()
}