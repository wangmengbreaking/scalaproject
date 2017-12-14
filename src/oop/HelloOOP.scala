package oop

object HelloOOP {
  def main(args:Array[String]) : Unit ={
    val person = new Person()
    person.increment()
    person.increment()
    println(person.current)   // 2

    val student = new Student
    student.age = 10  
    println(student.age)    //10

    println(student.name)      //Scala

//    println(student.gender)  //报错

  }
}

class Person {
  private var age = 0
  def increment(){age += 1}
  def current = age

  def act(person: Person){
    person.age
  }
}

class Student{
  private var privateAge = 0    //指定私有，则生成私有getter setter
  private[this] val gender = "male"   //更强的约束，只能类内访问，外部无法访问
  val name = "Scala"
//  def age = privateAge  
  var age = 0      //必须初始化，默认为私有字段，生成公有setter getter

  def isYounger(other: Student) = privateAge < other.privateAge

  def sayHello(){
    println(this.name + ":" + this.age + " : " + this.gender)
  }
}
