import  java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    print("Enter Number :  ")
    var num = sc.nextInt()
    if ( num > 0) {
        print("$num is Positive Number")
    }else if (num < 0) {
        print("$num is Negative Number")
    }else{
        print("$num is Zero")
    }
}