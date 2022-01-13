fun main(){
    println(0 == countRedBeads(0));
    println(0 == countRedBeads(1));
    println(4 == countRedBeads(3));
    println(8 == countRedBeads(5));

}

fun countRedBeads(nBlue: Int): Int = if (nBlue < 2 ) 0 else (nBlue-1)*2


// 1 -> 0
// 2 -> 2
// 3 -> 4
// 4 -> 6
// 5 -> 8
// 6 -> 10
// (nBlue - 1) * 2
