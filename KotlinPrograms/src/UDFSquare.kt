//Create UDF in Kotlin to take a number and print square of that number. (Use With Argument No Return)
import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    print("Enter Number : ")
    var num = sc.nextInt()
    square(num)
}
fun square(num:Int){
    println("Square is "+(num*num))
}