import kotlin.test.assertEquals

fun main(){
    println("Fixed Tests vertMirror")
    var s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"
    var r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw"
    testing(Opstrings.oper(Opstrings::vertMirror, s), r)
    s = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx"
    r = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP"
    testing(Opstrings.oper(Opstrings::vertMirror, s), r)

    println("Fixed Tests horMirror")
    s = "lVHt\nJVhv\nCSbg\nyeCt"
    r = "yeCt\nCSbg\nJVhv\nlVHt"
    testing(Opstrings.oper(Opstrings::horMirror, s), r)
    s = "njMK\ndbrZ\nLPKo\ncEYz"
    r = "cEYz\nLPKo\ndbrZ\nnjMK"
    testing(Opstrings.oper(Opstrings::horMirror, s), r)
}

private fun testing(actual: String, expected: String) {
    assertEquals(expected, actual)
}
//object Opstrings {
//    fun vertMirror(strng: String): String = strng.split("\n").map { it -> it.split("").reversed().joinToString("") }.joinToString("\n")
//    fun horMirror(strng: String): String = strng.split("\n").reversed().joinToString("\n")
//    fun oper(f: (String) -> String, s: String): String = f(s)
//}

object Opstrings {
    fun vertMirror(strng: String): String = strng.split("\n").map { it -> it.reversed() }.joinToString("\n")
    fun horMirror(strng: String): String = strng.split("\n").reversed().joinToString("\n")
    fun oper(f: (String) -> String, s: String): String = f(s)
}