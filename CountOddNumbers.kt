fun main(){
    println(oddCount(15023))
}

// fun oddCount(n: Int)= (0..(n-1)).filter { it % 2 == 1 && it > 0}.count()
// fun oddCount(n: Int)= (0..(n-1)).count{ it % 2 == 1 && it > 0}

fun oddCount(n: Int)= if (n % 2 == 0 ) n / 2 else (n-1) / 2