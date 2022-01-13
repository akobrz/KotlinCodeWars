
fun main(){

    var stanMagazynu = arrayOfNulls<Int>(365)

    var nazwy = arrayOf<String>("sdfsf","sdfsfds","sdfsdfsf")

    for ( s in nazwy) {
        println("${s}, len: ${s.length}")
        println("${s.reversed()}, len: ${s.length}")

        if ( s.length > 7 ) {
            for (w in s) {
                print("${w} ")
            }
        }
    }
}