fun main(args: Array<String>){
    println(seatsInTheater(16, 11, 5, 3))
}

fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int) = (nCols - col + 1) *( nRows - row)