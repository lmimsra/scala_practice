object method {
  def main(args: Array[String]): Unit = {
    val a = 5
    val b = 7
    println("a+b= "+ my_sum(a,b))
    method.call_hello
  }

  def my_sum(x : Int, y : Int): Int = {
    x+y
  }

  def call_hello() = println("Hello!!!!!!!")

}
