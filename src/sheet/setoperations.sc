package sheet

object setoperations {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val numbers = Seq(11.02, 2.4555, 5.33, 1.3, 64.33, 3.0, 9.233)
                                                  //> numbers  : Seq[Double] = List(11.02, 2.4555, 5.33, 1.3, 64.33, 3.0, 9.233)
  numbers.max                                     //> res0: Double = 64.33
  numbers.min                                     //> res1: Double = 1.3
  numbers.sum                                     //> res2: Double = 96.66850000000001
  numbers.size                                    //> res3: Int = 7
  val mean = numbers.sum / numbers.size           //> mean  : Double = 13.809785714285715
  
  case class Book(title: String, pages: Int)
  val books = Seq( Book("Future of Scala developers", 85),
                  Book("Parallel algorithms", 240),
                  Book("Object Oriented Programming", 130),
                  Book("Mobile Development", 495) )
                                                  //> books  : Seq[sheet.setoperations.Book] = List(Book(Future of Scala developer
                                                  //| s,85), Book(Parallel algorithms,240), Book(Object Oriented Programming,130),
                                                  //|  Book(Mobile Development,495))
                  
  books.maxBy(book => book.pages)                 //> res4: sheet.setoperations.Book = Book(Mobile Development,495)
  books.minBy(book => book.pages)                 //> res5: sheet.setoperations.Book = Book(Future of Scala developers,85)
  
  val abcd = Seq('a', 'b', 'c', 'd')              //> abcd  : Seq[Char] = List(a, b, c, d)
  val efgj = Seq('e', 'f', 'g', 'h')              //> efgj  : Seq[Char] = List(e, f, g, h)
  val ijkl = Seq('i', 'j', 'k', 'l')              //> ijkl  : Seq[Char] = List(i, j, k, l)
  val mnop = Seq('m', 'n', 'o', 'p')              //> mnop  : Seq[Char] = List(m, n, o, p)
  val qrst = Seq('q', 'r', 's', 't')              //> qrst  : Seq[Char] = List(q, r, s, t)
  val uvwx = Seq('u', 'v', 'w', 'x')              //> uvwx  : Seq[Char] = List(u, v, w, x)
  val yz = Seq('y', 'z')                          //> yz  : Seq[Char] = List(y, z)
  val alphabet = Seq(abcd, efgj, ijkl, mnop, qrst, uvwx, yz)
                                                  //> alphabet  : Seq[Seq[Char]] = List(List(a, b, c, d), List(e, f, g, h), List(i
                                                  //| , j, k, l), List(m, n, o, p), List(q, r, s, t), List(u, v, w, x), List(y, z)
                                                  //| )
  alphabet.flatten                                //> res6: Seq[Char] = List(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r,
                                                  //|  s, t, u, v, w, x, y, z)
}