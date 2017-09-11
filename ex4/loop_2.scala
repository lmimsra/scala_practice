object loop_2 {
def main(args: Array[String]): Unit = {
  for {
     i <- 0 to 10
  } yield println(i)
}
}
