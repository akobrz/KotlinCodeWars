fun main(){
    println(alphaSeq("MjtkuBovqrU"))
    println(alphaSeq("NyffsGeyylB"))
}

//fun alphaSeq(str: String)= str.toUpperCase().split("").toMutableList().sorted().filter { it.length > 0 }.map{it + it.toLowerCase().repeat(it.toCharArray()[0].toInt()-65)}.joinToString(",")

fun alphaSeq2(str: String)= str.toUpperCase()
    .split("")
    .toMutableList()
    .sorted()
    .filter { it.length > 0 }
    .map{it + it.toLowerCase().repeat(it.toCharArray()[0].toInt()-65)}
    .joinToString(",")


fun alphaSeq(str: String)= str.toUpperCase()
    .toList()
    .sorted()
    .map { "$it" + "$it".toLowerCase().repeat(it.toInt()-65) }
    .joinToString(",")

