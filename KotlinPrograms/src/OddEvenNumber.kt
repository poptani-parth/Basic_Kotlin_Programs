import  java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    print("Enter Number :  ")
    var num = sc.nextInt()
    if ( num % 2 == 0 ) {
        print("$num is Even Number")
    }else{
        print("$num is Odd Number")
    }
}