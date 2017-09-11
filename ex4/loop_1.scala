object loop_1 {
  def main(args: Array[String]){
    println("while loop")
    var i = 0
    while(i<5){
      println(i)
      i+=1
    }
    println("do-while loop")
    var j = 10
    do{
      println(j)
    }while(i<5)

  }
}
