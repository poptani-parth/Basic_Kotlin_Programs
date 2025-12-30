//Create a Base class ‘Person’ with a properties ‘name’ and ‘age’,
//Derive a class ‘Student’ with a properties ‘rollno’ also add display() method in Student
//class which displays rollno, name and age.  (Use Single Inheritance)

open class Person {
     var name : String = "Poptani Parth"
    var age : Int =21
}
class Student : Person() {
    var rollno : Int = 101
    fun display(){
        println("Name  : "+name)
        println("Age  : "+age)
        println("Roll Number : "+rollno)
    }
}
fun main(){
    var Student = Student()
    Student.display()
}