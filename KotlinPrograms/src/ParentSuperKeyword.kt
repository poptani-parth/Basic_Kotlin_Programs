//Create a class ‘Parent’ with a method display(), a class ‘Child’ that overrides display()
//and calls the parent’s method using ‘super’ keyword.

open class Parent{
    open fun display(){
        println("This is a parent class method")
    }
}
class child : Parent(){
    override fun display() {
        super.display()
    }
}
fun main(){
    var child = child()
    child.display()
}