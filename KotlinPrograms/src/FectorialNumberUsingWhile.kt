//Write a Kotlin program to find the Factorial of a number using a ‘while’ loop.

import  java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    print("Enter number : ")
    var num = sc.nextInt()
    var fectorial = 1
    while(num>0){
        fectorial *=num
        num--
    }
    print(fectorial)
}