package sheet

object oop {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class Teacher private (val name : String, val age : Int){
   println("This is the primary constructor!!!")
   var gender : String = _
   println(gender)
   def this(name : String, age : Int, gender : String){
    this(name, age)
    this.gender = gender
  }
  }
}