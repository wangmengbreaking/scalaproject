package sheet

object file {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val s = io.Source.fromString("foo\nbar\n")      //> s  : scala.io.Source = non-empty iterator
  println(s)                                      //> non-empty iterator
}