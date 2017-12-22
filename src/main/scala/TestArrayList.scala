import java.util

object TestArrayList {

  def main(args: Array[String]): Unit = {
    var arr =new util.ArrayList[Any];
    arr.add(123)
    arr.add("gaga");
    println(arr)
    println(arr.get(0))
    val it = arr.iterator();
    while (it.hasNext()){
      println(it.next());
    }
  }
}
