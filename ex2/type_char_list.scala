object type_lang_list{
  def main(args: Array[String]): Unit = {
    println("整数")
    println(123)
    println(0x7B) //<-123
    // println(3000000000)　コンパイルエラー
    println(3000000000L) //<-Long型
    println("浮動小数点数")
    println(3.14)       //3.14
    println(1.2E2)      //120.0
    println(1.2E-2)     //0.012
    println(4.5)        //4.5
    println(5.6D)       //5.6
    println(7.8E3F)     //7800.0
    println(7.8E-3D)    //0.0089
    println("真偽")
    println(true)       //true
    println(false)      //false
    println("文字")
    println('A')        //A
    println('あ')       //あ
    println('亜')       //亜
    println('\'')       //'
    println('\\')       //￥
    println('\u0041')   //A(Unicode)
    // println('ABC')   //エラー
  }
}
