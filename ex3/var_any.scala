object var_any {
  def main(args: Array[String]): Unit = {
    val x1:Int = 10
    //x1 = 20 ← エラー
    var x2:Int = 30
    x2 = 40

    val x3:Double = x2
    // val x4:Int = "Hello"

    println(x1)
    println(x2)
    println(x3)

    // 型推論

    var x5 = 10
    // x5 = "こんにちは"
    x5 = 20

    var x6 = "こんばんは"
    // x6 = 100
    x6 = "さようなら"

    println(x5)
    println(x6)
  }

}
