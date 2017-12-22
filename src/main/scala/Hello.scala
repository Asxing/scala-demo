import com.sun.glass.ui.MenuItem.Callback

object Hello {
  /*println("Hello, world!")
  val a = 12;

  def max(x: Int, y: Int) = if (x > y) x else y

  println(max(5, 4))*/

  //  def sayMyName(name: String = "Jack") = println(name)
  //
  //  sayMyName("123")

  def sumMoreParameters(elem: Int*) = {
    var sum = 0;
    for (e <- elem) {
      sum += e
    }
    sum
  }

  def add(a: Int, b: Int) = a + b

  def add2 = add(_: Int, 2)

  def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

  /**
    * function def kelihua
    *
    * @param x
    * @param y
    * @return
    */
  def mulitply(x: Int)(y: Int) = x * y

  def mulitply2 = mulitply(2) _

  /**
    * 匿名函数
    */
  var t = () => {
    33
  }

  /**
    * : 后面是数据类型，c代表前面传进来的参数
    *
    * @param c
    * @return
    */
  def anonymityfunc(c: () => Int): Int = {
    c()
  }

  /**
    * 匿名函数
    *
    * @return
    */
  def d2 = (a: Int) => a + 100

  /**
    * 匿名函数作为参数，其实就是参数名，后面跟个参数类型，然后是表达式
    *
    * @param callback
    */
  def anonymityfnc2(callback: (Int, Int) => Int) = {
    println(callback(132, 123))
  }

  def add3(x: Int, y: Int, z: Int) = {
    def add2(x: Int, y: Int) = {
      x + y
    }

    add2(add2(x, y), z)
  }

  /**
    * 比较综合的函数式写法
    *
    * @param f
    * @return
    */
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)

    sumF
  }

  def test1() = {
    for (i <- 1.to(100)) {
      println(i)
    }
  }

  def test2() = {
    for (i <- 1.to(100); if (i % 2) == 1; if (i % 5) > 3) {
      println("I: " + i)
    }
  }

  def testmatch(n: Any) = {
    n match {
      case x: Int => {
        println("111");
        n
      }
      case s: String => println("222"); n
      case _ => println("other"); "test"
    }
  }

  def main(args: Array[String]) {
    //    println(sumMoreParameters(1, 2, 3, 4, 5))
    //    println(add(1, 2))
    //    println(add2(3))
    //    println(fac(3))

    //    println(mulitply(2)(3))
    //    print(mulitply2(2))
    //    println(t())
    //    println(anonymityfunc(t))
    //    println(d2(123))
    //    def sumInts = sum(x => x)
    //    println(sumInts(1,2))
    //    test2()
    //    println(testmatch(12))

    println(sumMoreParameters(1 to 5: _*))
  }
}
