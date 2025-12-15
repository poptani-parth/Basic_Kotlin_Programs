import  java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    print("Enter the Month (1-12): ")
    var month = sc.nextInt()
    when(month){
        1 -> println("january")
        2 -> println("february")
        3 -> println("march")
        4 -> println("april")
        5 -> println("may")
        6 -> println("june")
        7 -> println("july")
        8 -> println("august")
        9 -> println("september")
        10 -> println("october")
        11 -> println("november")
        12 -> println("december")
        else -> println("Invalid Input ! Please enter a valid month Number (1-12)")
    }
}