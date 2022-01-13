import kotlin.test.assertEquals

fun main(){
    assertEquals("nahsirk", reverseLetter("krishan"))
    assertEquals("nortlu", reverseLetter("ultr53o?n"))
    assertEquals("cba", reverseLetter("ab23c"))
    assertEquals("nahsirk", reverseLetter("krish21an"))
}


fun reverseLetter(str: String)= str.filter { it in 'a'..'z' }.reversed()
