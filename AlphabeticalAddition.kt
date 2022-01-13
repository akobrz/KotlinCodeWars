import kotlin.test.assertEquals

fun main(){
    basicTests()
}

//fun addLetters(arr: List<Char>): Char {
//    var wynik = if ( arr.size > 0 ) arr.map { it -> it.toInt() % 96 }.sum() % 26 + 96 else 122
//    return if ( wynik == 96 ) ( 122 ).toChar() else wynik.toChar()
//}

fun addLetters(arr: List<Char>) = 'z' - arr.map { 'z' - it }.sum() % 26

fun basicTests() {
    assertEquals('f', addLetters(listOf('a', 'b', 'c')))
    assertEquals('z', addLetters(listOf('z')))
    assertEquals('c', addLetters(listOf('a', 'b')))
    assertEquals('c', addLetters(listOf('c')))
    assertEquals('a', addLetters(listOf('z', 'a')))
    assertEquals('d', addLetters(listOf('y', 'c', 'b')))
    assertEquals('z', addLetters(listOf()))
    assertEquals('j', addLetters(listOf('u', 'v', 'p','c')))
    assertEquals('w', addLetters(listOf('q', 'r', 'p','k','e','h')))
}