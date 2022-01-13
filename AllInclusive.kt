fun main(){
    var a = arrayListOf("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
    println(containAllRots2("XjYABhR", a))

    a = arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
    println(containAllRots2("bsjq", a))

    containAllRots3("bsjq", a)
}

fun containAllRots(strng:String, arr:ArrayList<String>):Boolean {
    var rotate = strng
    (1..strng.length).forEach {
        rotate = rotate.slice(1 until rotate.length) + rotate.slice(0..0)
        if (!arr.contains(rotate)) return false
    }
    return true
}

fun containAllRots2(strng:String, arr:ArrayList<String>) =
        arr.containsAll(List(strng.length){  strng.drop(it) + strng.take(it) })


fun containAllRots3(strng:String, arr:ArrayList<String>): Boolean {
    var aa = List(strng.length) { strng + it.toString() }

    println(aa)
    return true
}