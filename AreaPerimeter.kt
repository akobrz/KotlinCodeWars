fun main(){

        println(areaOrPerimeter(6, 10))
}

fun areaOrPerimeter(l:Int, w:Int) = if ( l == w ) l * w else 2 * ( l + w )