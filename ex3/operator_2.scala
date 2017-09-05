object operator_2 {
  def main(args: Array[String]): Unit = {
    val x = 7
    val y = 3

    //関係演算子
    println(x+"=="+y+":"+(x==y))  //false
    println(x+"!="+y+":"+(x!=y))  //true
    println(x+">"+y+":"+(x>y))    //true
    println(x+"<"+y+":"+(x<y))    //false

    //論理演算子
    println(x+">5 && "+y+">5:"+(x>5 && y>5))  //false
    println(x+">5 || "+y+">5:"+(x>5 || y>5))  //true
    println("!("+x+">5):"+(!(x>5)))  //false

    //算術代入演算子
    var a = 7

    println("x="+a)   //7
    a+=3
    println("x="+a)   //10
    a-=2
    println("x="+a)   //8
    a*=3
    println("x="+a)   //24
    a/=2
    println("x="+a)   //12
    a%=5
    println("x="+a)   //2
  }
}
