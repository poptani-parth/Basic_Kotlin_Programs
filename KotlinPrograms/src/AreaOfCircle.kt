import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter Radius of the circle : ")
    var radius = sc.nextInt()
    var areaOfCircle = radius*radius*(Math.PI)
    print(" Area Of Circle : ${areaOfCircle}")
}