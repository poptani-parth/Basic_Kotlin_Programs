import  java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    print("Enter the Day (1-7): ")
    var day = sc.nextInt()
    when(day){
        1 -> println("monday")
        2 -> println("tuesday")
        3 -> println("wednesday")
        4 -> println("thursday")
        5 -> println("friday")
        6 -> println("saturday")
        7 -> println("sunday")
        else -> println("Invalid Input ! Please enter a valid Day Number (1-7)")
    }
}