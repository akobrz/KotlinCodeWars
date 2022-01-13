fun main(){
    println(past(1, 0, 1))

}

fun past(h: Int, m: Int, s: Int) = (s + 60 * ( m + 60 * h))*1000