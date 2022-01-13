fun main(){

    println(loveFun(0,0))

}

fun loveFun(flowerA: Int, flowerB: Int): Boolean = (flowerA.rem(2) == 0 && flowerB.rem(2) == 1 ) || (flowerB.rem(2) == 0 && flowerA.rem(2) == 1 )