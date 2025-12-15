//Create UDF in Kotlin to take a number and print Cube of that number. (Use No Argument With Return)

import java.util.Scanner
fun main(){
    val result = cube()
    println("Cube : $result")
}
fun cube(): Int{
    val num = 4
    return num*num*num
}