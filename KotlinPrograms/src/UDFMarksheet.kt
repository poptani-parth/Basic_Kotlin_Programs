//Create UDF in Kotlin to perform take mark of 3 subject, calculate total and percentage. (Use No Argument No Return)
import java.util.Scanner
fun main(){
    marksheet()
}
fun marksheet(){
    val sc = Scanner(System.`in`)
    println("Enter Subject mark out of 100 : ")
    print("Enter First Subject mark  : ")
    var sub1 = sc.nextDouble()
    print("Enter Second Subject mark  : ")
    var sub2 = sc.nextDouble()
    print("Enter Third Subject mark  : ")
    var sub3 = sc.nextDouble()
    val total = sub1+sub2+sub3
    val percent = (total)/3
    if (sub1>33 && sub2>33 && sub3>33){
        println("Total Mark : $total")
        println("Percent  : $percent")
    }
    else{
        println("you need to improvement in study because you are fail.")
    }
}