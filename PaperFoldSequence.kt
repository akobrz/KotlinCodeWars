// The PaperFold sequence


fun main(){

    println(paperFold().next())
    println(paperFold().next())
    println(paperFold().next())
    println(paperFold().next())
    println(listOf(1,1,0,1,1,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1))

    println(fibonacci().take(15).toList()) // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

}

fun paperFold(): Iterator<Int> {
    return iterator {
        yieldAll(1..30)
    }
}

fun fibonacci() = sequence {
    var terms = Pair(0, 1)

    // this sequence is infinite
    while (true) {
        yield(terms.first)
        terms = Pair(terms.second, terms.first + terms.second)
    }
}

fun paperFold2(): Iterator<Int> {
    var terms = 1
    var temp = ""

    return iterator {
        while (true) {
            yield(terms)
            temp = terms.toString()
            for (c in temp) {
                when (c) {
                    '1' -> temp += "101"
                    '0' -> temp += "111"
                }
            }
            terms = temp.toInt()
        }
    }

}

// 1 1
// 0

// 110 1 100 1
// 110 0 100

// 1101100 1 1100100 1
// 1101100 0 1100100

// 110110011100100 1 110110001100100 1
// 110110011100100 0 110110001100100
