//Create UDF in Kotlin to perform Addition of 2 number. (Use No Argument No Return)
import java.util.Scanner
fun main(){
    sum()
}
fun sum(){
    var sc = Scanner(System.`in`)
    print("Enrer First Number : ")
    var num1 = sc.nextInt()
    print("Enrer Second Number : ")
    var num2 = sc.nextInt()
    print("Sum :"+(num1+num2))
}