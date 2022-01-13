fun main(){
    println("Right side wins!".equals(alphabetWar("z")))
}

//fun alphabetWar(fight: String): String {
//    if ( calculateWar(fight) == 0 ) return "Let's fight again!"
//    else if ( calculateWar(fight) > 0 ) return "Left side wins!"
//    else return "Right side wins!"
//}
//
//fun calculateWar(fight: String): Int {
//    return fight.map { when (it){
//        'w' -> 4
//        'p' -> 3
//        'b' -> 2
//        's' -> 1
//        'm' -> -4
//        'q' -> -3
//        'd' -> -2
//        'z' -> -1
//        else -> 0
//    } }.sum()
//}

fun alphabetWar(fight: String): String {
    var forces = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1, 'm' to -4, 'q' to -3, 'd' to -2, 'z' to -1)
    var result = fight.sumBy { forces.getOrDefault(it,0) }
    return when {
        result < 0 -> "Right side wins!"
        result > 0 -> "Left side wins!"
        else -> "Let's fight again!"
    }
}

fun alphabetWar2(fight: String) =
    with (fight.map { when (it) { 'w' -> 4; 'p' -> 3; 'b' -> 2; 's' -> 1; 'm' -> -4; 'q' -> -3; 'd' -> -2; 'z' -> -1; else -> 0 }}.sum())
    {if (this == 0) "Let's fight again!" else if (this < 0) "Right side wins!" else "Left side wins!" }