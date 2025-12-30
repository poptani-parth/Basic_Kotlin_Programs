//Create a Base class ‘Person’ with a properties ‘name’ and ‘age’,
//Intermediate base class ‘Student’ with a properties ‘rollno’,
//Derive a class ‘Result’ with a properties ‘percentage’ also add display() method in Result
//class which displays rollno, name, age and percentage.  (Use Multilevel Inheritance)

open class Person1(val name: String, val age: Int)

open class Student1(name: String, age: Int, val rollno: Int) : Person1(name, age)

class Result(name: String, age: Int, rollno: Int, val percentage: Double) : Student1(name, age, rollno) {
    fun display() {
        println("-- Student Details : ")
        println("Name: $name")
        println("Age: $age")
        println("Roll No: $rollno")
        println("Percentage: $percentage")
    }
}

fun main() {
    val studentResult = Result("Parth", 21, 101, 98.33)
    studentResult.display()
}
