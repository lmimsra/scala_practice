object type_string_list {
  def main(args: Array[String]): Unit = {
    println("おはよう")               //おはよう
    println("おはよう\nこんばんは")    //おはよう(改行)こんばんは
    println("""'さようなら'
    "おやすみ"""")                  //'さようなら'(改行)"おやすみ"
  }

}
