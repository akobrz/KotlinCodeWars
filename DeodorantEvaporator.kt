import kotlin.test.assertEquals

fun main(){
    assertEquals(22, evaporator(10.0,10.0,10.0))
    assertEquals(29, evaporator(10.0,10.0,5.0))
    assertEquals(59, evaporator(100.0,5.0,5.0))
}

//fun evaporator(content: Double, evap_per_day: Double, threshold: Double) = evaporatorDay(content, evap_per_day, content * threshold / 100, 0)
//fun evaporatorDay(content: Double, evap_per_day: Double, threshold: Double, days: Int): Int {
//    if (content < threshold) return days
//    else return evaporatorDay(content - content * evap_per_day / 100,evap_per_day,threshold,days + 1)
//}

fun evaporator(c: Double, e: Double, t: Double, p: Double = 100.0): Int =
    if (p < t) 0 else evaporator(c, e, t, p*(1-(e/100))) + 1
