fun main(args: Array<String>) {
    println(countPositivesSumNegatives2(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15))?.size)
    println(countPositivesSumNegatives2(arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14))?.size)
    println(countPositivesSumNegatives2(arrayOf())?.size)
    println(countPositivesSumNegatives2(null)?.size)

}

fun countPositivesSumNegatives(input : Array<Int>?) = if ( input?.size == 0) arrayOf() else arrayOf(input?.filter{it>0}?.count()?:0, input?.filter{it<0}?.sum()?:0)

fun countPositivesSumNegatives2(input : Array<Int>?) : Array<Int>? {
//    return if ( input == null || input.size == 0 ) arrayOf() else arrayOf(input?.filter{it>0}?.count()?:0, input?.filter{it<0}?.sum()?:0)
    return if ( input.isNullOrEmpty() ) arrayOf() else arrayOf(input.filter{it>0}.count(), input.filter{it<0}.sum())
}