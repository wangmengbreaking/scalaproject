package sheet


object basicarray {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //不可变list
  val array = Array(1,2,3,4,5)                    //> array  : Array[Int] = Array(1, 2, 3, 4, 5)
  for(element <- array) println(element)          //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
  val num = new Array[Int](10)                    //> num  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  val a = new Array[String](10)                   //> a  : Array[String] = Array(null, null, null, null, null, null, null, null, n
                                                  //| ull, null)
  val s1 = Array("Hello","World")                 //> s1  : Array[String] = Array(Hello, World)
  s1(0)="Good"
  println(s1(0)+","+s1(1))                        //> Good,World
  
  //可变mutable
  import scala.collection.mutable.ArrayBuffer
  val b = ArrayBuffer[Int]()                      //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  b += 1                                          //> res0: sheet.basicarray.b.type = ArrayBuffer(1)
  b += (1,2,3,4)                                  //> res1: sheet.basicarray.b.type = ArrayBuffer(1, 1, 2, 3, 4)
  b ++= Array(8,13,21)                            //> res2: sheet.basicarray.b.type = ArrayBuffer(1, 1, 2, 3, 4, 8, 13, 21)
  //移除后面5个元素
  b.trimEnd(5)
  for(i <- b) println(i)                          //> 1
                                                  //| 1
                                                  //| 2
  b.insert(2, 6)
  for(i <- b) println(i)                          //> 1
                                                  //| 1
                                                  //| 6
                                                  //| 2
  
  b.insert(2, 7,8,9)
  for(i <- b) println(i)                          //> 1
                                                  //| 1
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 6
                                                  //| 2
  b.remove(2)                                     //> res3: Int = 7
  for(i <- b) println(i)                          //> 1
                                                  //| 1
                                                  //| 8
                                                  //| 9
                                                  //| 6
                                                  //| 2
  //移除从索引2（包含）的位置开始，后面的3个
  b.remove(2,3)
  for(i <- b) println(i)                          //> 1
                                                  //| 1
                                                  //| 2
  b.toArray                                       //> res4: Array[Int] = Array(1, 1, 2)
  
  val c = Array(2,3,5,7,10)                       //> c  : Array[Int] = Array(2, 3, 5, 7, 10)
  val result = for(ele <- c) yield ele * 2        //> result  : Array[Int] = Array(4, 6, 10, 14, 20)
  
  for(element<-c if element%2==0) yield element*2 //> res5: Array[Int] = Array(4, 20)
  
  c.filter(_ %2 ==0).map(_ * 2)                   //> res6: Array[Int] = Array(4, 20)
  Array(1,2,3,4).sum                              //> res7: Int = 10
  
  ArrayBuffer("Mary", "had", "a", "little", "lamb").max
                                                  //> res8: String = little
  
  val re = ArrayBuffer(1,7,2,9)                   //> re  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 7, 2, 9)
  re.sorted                                       //> res9: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 7, 9)
  
  val e = Array(1, 7, 2, 9)                       //> e  : Array[Int] = Array(1, 7, 2, 9)
  scala.util.Sorting.quickSort(e)
  for(i <- e) println(i)                          //> 1
                                                  //| 2
                                                  //| 7
                                                  //| 9
  e.mkString(" and ")                             //> res10: String = 1 and 2 and 7 and 9
  a.mkString("<", ",", ">")                       //> res11: String = <null,null,null,null,null,null,null,null,null,null>
   //多维数组
  var matrix = Array.ofDim[Double](3,4)           //> matrix  : Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0
                                                  //| , 0.0, 0.0, 0.0), Array(0.0, 0.0, 0.0, 0.0))
  matrix(2)(1)= 42
  
  val triangle = new Array[Array[Int]](10)        //> triangle  : Array[Array[Int]] = Array(null, null, null, null, null, null, n
                                                  //| ull, null, null, null)
  for (i <- 0 until triangle.length)
  triangle(i) = new Array[Int](i + 1)
  
  val triple = (100, "Scala", "Spark")            //> triple  : (Int, String, String) = (100,Scala,Spark)
  println(triple._1)                              //> 100
  println(triple._2)                              //> Scala
  val tuple =(1,2,3.14,"Rocky","Spark","Flink")   //> tuple  : (Int, Int, Double, String, String, String) = (1,2,3.14,Rocky,Spark
                                                  //| ,Flink)
  val third = tuple._3                            //> third  : Double = 3.14
  val (first,second,thirda,fourth,fifth,sixth) = tuple
                                                  //> first  : Int = 1
                                                  //| second  : Int = 2
                                                  //| thirda  : Double = 3.14
                                                  //| fourth  : String = Rocky
                                                  //| fifth  : String = Spark
                                                  //| sixth  : String = Flink
  val (f, s, _, _, _,_) = tuple                   //> f  : Int = 1
                                                  //| s  : Int = 2
  "Rocky Spark".partition(_.isUpper)              //> res12: (String, String) = (RS,ocky park)
}