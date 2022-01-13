fun main(){
    println(rowSumOddNumbers((101)))
}

fun rowSumOddNumbers(n: Int): Int {
    var rowSuma: Int = 0
    var allSuma: Int = 0
    for ( i in 1..n ) allSuma += i
    for ( i in (allSuma - n ) * 2 + 1 .. allSuma * 2 - 1 step 2) rowSuma += i
    return rowSuma
}