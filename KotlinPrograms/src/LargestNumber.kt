import  java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)
    print("Enter First number : ")
    var first = sc.nextInt()
    print("Enter second : ")
    var second = sc.nextInt()
    print("Enter third : ")
    var third = sc.nextInt()
    if (first > second && first  > third) {
        print("$first is largest number ")
    }
    else{
        if(second > first && second > third){
            print("$second is largest number ")
        }
        else
            print("$third is largest number ")
    }
}