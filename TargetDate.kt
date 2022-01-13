import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main(){
    println(dateNbDays(100.0, 150.0, 2.0))
//    dateNbDays(4281.0, 5087.0, 2.0)
//    dateNbDays(4620.0, 5188.0, 2.0)
}

fun dateNbDays(a0:Double, a:Double, p:Double):String {
    var cash = a0
    var d = LocalDate.parse("2016-01-01")
    while (cash < a ) {
        cash += cash * p / 36000
        d = d.plusDays(1)
    }
    return "${d}"
}

//fun dateNbDays(a0:Double, a:Double, p:Double) = LocalDate.parse("2016-01-01").plusDays(1).toString()

fun dateNbDays3(a0:Double, a:Double, p:Double):String {
    return LocalDate.of(2016, 1, 1).plusDays(Math.ceil(Math.log(a / a0) / Math.log(1 + p / 36000)).toLong()).toString()
}