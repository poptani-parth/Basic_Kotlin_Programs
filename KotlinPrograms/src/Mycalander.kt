//Create two Base classes ‘Mydate’ and ‘Mytime’ having properties ‘date1’ and ‘time1’
//respectively,
//Derive a class ‘Mycalendar’ which contains display() method to print date1 and time1.
//(Use Multiple Inheritance, Interface, Override Keyword)

interface Displayable{
    fun display()
}
open class Mydate(val date: String){}
open class Mytime(val time : String){}

class Mycalander(date: String,time: String):Mydate(date),Displayable{
    private val time = Mytime(time)
    override fun display() {
        println("Date : $date")
        println("Time : ${time.time}")
    }
}
fun main() {
    val calander = Mycalander("30-12-2025","8:30")
    calander.display()
}