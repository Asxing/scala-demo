class User (x:Int,y:Int) {
  val t =x;
  val t1 = y;

  val isOriginal: Boolean = {
    x == 0 && y==0;
  }
  def this(xArg: Int){
    this(xArg, 12345)
    println("hello, I'm this constructor")
  }
}

object Point{
  def main(args: Array[String]): Unit = {
    val p1 = new User(123);
    va
  }
}
