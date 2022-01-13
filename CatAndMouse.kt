fun main(){
    println(catMouse("C.....m"))
    println(catMouse("C....m"))
    println(catMouse("C..m"))
}

fun catMouse(s: String) = if ( s.indexOf('m') - s.indexOf('C') <= 3 ) "Caught!" else "Escaped!"
