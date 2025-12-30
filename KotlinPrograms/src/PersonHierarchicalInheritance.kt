//Create a Base class ‘Person’ with a properties ‘name’ and ‘age’,
//Derive 1 a class ‘Student’ with a properties ‘percentage’ also add display1() method in
//Student class which displays name, age and percentage,
//Derive 2 a class ‘Employee’ with a properties ‘salary’ also add display2() method in
//Employee class which displays name, age and salary. (Use Hierarchical Inheritance)

open class Person2(val name : String, var age : Int){}
class Student2(name: String, age: Int, val percentage : Double): Person2(name, age){
    fun display1(){
        println("--Student Details : ")
        println("Name: $name")
        println("Age: $age")
        println("Percentage: $percentage")
    }
}
class Employee(name : String, age : Int, var salary : Double): Person2(name,age){
    fun display2(){
        println("--Employee Details : ")
        println("Name: $name")
        println("Age: $age")
        println("Salary: $salary")
    }
}
fun main(){
    val s =Student2("Parth",21,98.33)
    s.display1()
    val e = Employee("Jigar",24,45000.00)
    e.display2()
}