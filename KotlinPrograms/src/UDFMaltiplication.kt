//Create UDF in Kotlin to perform Multiplication of 2 number. (Use With Argument With Return)

import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    print("Enter first number: ")
    var num1 = sc.nextInt()
    print("Enter second number: ")
    var num2 = sc.nextInt()
    val result = maltiplication(num1,num2)
    println("The Multiplication of $num1 and $num2 is $result")
}
fun maltiplication(num1:Int, num2:Int):Int{
    return num1*num2
}