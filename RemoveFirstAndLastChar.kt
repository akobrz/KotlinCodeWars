fun main(args: Array<String>){
    assertEquals4("loquen", removeChar("eloquent"))
    assertEquals4("ountr", removeChar("country"))
    assertEquals4("erso", removeChar("person"))
    assertEquals4("lac", removeChar("place"))
}

fun removeChar(str: String) = str.substring(1,str.length-1)

fun assertEquals4(w1: String, w2: String){
    if ( w1.equals(w2)) {
        println("ok")
    } else {
        println(w2)
        println("wrong")
    }
}