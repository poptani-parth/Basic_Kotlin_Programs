import  java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    print("Enter Year :  ")
    var year = sc.nextInt()
    if ( year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
        print("$year is Leap Year")
    }else{
        print("$year is not Leap Year")
    }
}