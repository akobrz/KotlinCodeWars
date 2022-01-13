package com.codewars.apartridge
import kotlin.test.assertEquals

fun main(){
    assertEquals("To beat g964's score, I must complete 5365 Beta kata and 2 8kyu kata. Dammit!", leaderBoard("g964", 36097, 20000))
    assertEquals("To beat GiacomoSorbi's score, I must complete 15 Beta kata and 2 8kyu kata.", leaderBoard("GiacomoSorbi", 23914, 23867))
    assertEquals("To beat ZozoFouchtra's score, I must complete 1330 Beta kata and 1 8kyu kata. Dammit!", leaderBoard("ZozoFouchtra", 15991, 12000))
}

fun leaderBoard(user:String, userScore:Int, yourScore:Int):String {
    var diff = userScore - yourScore
    if ( diff < 0 ) return "Winning!"
    else if ( diff == 0 ) return "Only need one!"
    else {
        var x = ( diff ) / 3
        var y = ( diff ) % 3
        return "To beat ${user}'s score, I must complete ${x} Beta kata and ${y} 8kyu kata." + if ( x + y > 1000 ) " Dammit!" else ""
    }
}