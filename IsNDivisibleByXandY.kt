fun main(args: Array<String>) {
    print("Hello World")

    isDivisible(3, 3, 4)
    isDivisible(3, 3, 4)
    isDivisible(12, 3, 4)
    isDivisible(8, 3, 4)
    isDivisible(48, 3, 4)
    isDivisible(100, 5, 10)
    isDivisible(100, 5, 3)
    isDivisible(4, 4, 2)
    isDivisible(5, 2, 3)
    isDivisible(17, 17, 17)
    isDivisible(17, 1, 17)

}

fun isDivisible3(n: Int, x: Int, y: Int): Boolean {
    if ( n.rem(x) == 0 && n.rem(y) == 0 ) {
        return true
    }
    return true
}

fun isDivisible(n: Int, x: Int, y: Int) = ( n%x == 0 ) && ( n%y == 0 )