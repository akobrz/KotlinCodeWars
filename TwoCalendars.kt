val a1: Array<Array<String>> = arrayOf(arrayOf("9:00","10:30"),arrayOf("12:00","13:00"),arrayOf("16:00","18:00"))
val a2: Array<Array<String>> = arrayOf(arrayOf("9:00","20:00"))

val b1: Array<Array<String>> = arrayOf(arrayOf("10:00","11:30"),arrayOf("12:30","14:30"),arrayOf("16:00","17:00"))
val b2: Array<Array<String>> = arrayOf(arrayOf("10:00","18:30"))

var w0: Array<Double> = Array(48){0.0}
var w1: Array<Double> = Array(48){0.0}
var w2: Array<Double> = Array(48){0.0}
var w3: Array<Int> = Array(48){0}


fun main(){

    // initialize w0
    for (i in 0..47) w0[i] = i / 2.0

    // set availability for 1 calendar
    for (j in 0..(a2.size-1)) {
        for (i in 0..47) if ( w0[i] >= s2d(a2[j][0]) && w0[i] <= s2d(a2[j][1]) ) w1[i] = 1.0
    }

    // set meeting time for 1 calendar
    for (j in 0..(a1.size-1)) {
        for (i in 0..47) if ( w0[i] >= s2d(a1[j][0]) && w0[i] <= s2d(a1[j][1]) ) w1[i] = 2.0
    }

    // set availability for 2 calendar
    for (j in 0..(b2.size-1)) {
        for (i in 0..47) if ( w0[i] >= s2d(b2[j][0]) && w0[i] <= s2d(b2[j][1]) ) w2[i] = 1.0
    }

    // set meeting time for 2 calendar
    for (j in 0..(b1.size-1)) {
        for (i in 0..47) if ( w0[i] >= s2d(b1[j][0]) && w0[i] <= s2d(b1[j][1]) ) w2[i] = 2.0
    }

    // set free time for both calendar
    for (j in 0..47) if ( w1[j] == 1.0 && w2[j] == 1.0 ) w3[j] = 1

    var isMeeting: Boolean = false
    var lenMeeting: Int = 0
    var maxLen: Int = 0

    // find longest available time for meeting
    for (j in 0..47) {
        if ( w3[j] == 1 && isMeeting == false ) {
            isMeeting = true
            lenMeeting += 1
        } else if ( w3[j] == 1 && isMeeting == true ) {
            lenMeeting += 1
        } else {
            isMeeting = false
            lenMeeting = 0
        }
        if ( maxLen < lenMeeting ) maxLen = lenMeeting
    }

    println("Max meeting time: $maxLen")

}

fun s2d(s: String): Double {
    var a: List<String> = s.split(":")
    var w: Double = a[0].toDouble()
    if ( a[1].toDouble() == 30.0 ) w += 0.5
    return w
}