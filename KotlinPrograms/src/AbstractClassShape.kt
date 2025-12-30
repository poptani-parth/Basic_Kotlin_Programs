//Create an Abstract class ‘Shape’ with an abstract method area()
//Derive a class ‘Rectangle’ that implements area() method to compute the area of a
//rectangle. (Area = l × w)

abstract class Shape{
    abstract fun area(): Double
}
class Rectangle(val length: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return length * height
    }
}
fun main(){
    val rectangle = Rectangle(10.0,5.0)
    var area= rectangle.area()
    println("Area of Rectangle : $area")
}