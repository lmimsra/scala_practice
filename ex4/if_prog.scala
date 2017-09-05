object if_prog {
  def main(args: Array[String]): Unit = {
    val x = 5

    //if 文
    if (x>3) {
      println("5は３より大きい")   //ここが表示
    }

    if (x<3) {
      println("5は３より小さい")
    }

    //if else 文
    if (x<3) {
      println("5は３より小さい")
    }
    else if (x>6) {
      println("5は３より小さくはないが、６より大きい")
    }
    else {
      println("5は３より小さくなく、６より大きくない")  //ここが表示
    }

  }
}
