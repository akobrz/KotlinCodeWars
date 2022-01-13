import kotlin.math.ceil

val values = listOf("zero", "one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty")

fun main(){
    println(wallpaper(4.0, 3.5, 3.0))
    println(wallpaper(6.3, 4.5, 3.29))
    println(wallpaper(0.0, 3.5, 3.0))
}

fun wallpaper(l:Double, w:Double, h:Double) = if ( l == 0.0 || w == 0.0 || h == 0.0 ) values[0]
    else values[ceil(2 * ( l + w ) * h * 1.15 / (5.2)).toInt()]
