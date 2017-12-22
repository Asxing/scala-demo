package com.zzy.study.scala

/**
 * tuple 学习
 */
object TupleOps {
  def main(args: Array[String]) {
    /** 一般tuple定义 */
    val tuple  = (1,2.5,3,"spark","scala")
    println("tuple 4  ",tuple._4)
    /** tuple和参数映射 */
    val (usn:String,age,_) = ("Tom",25,"333221")
    println(usn +" age is "+age)
    /** 作为字符串筛选的返回值 */
    val resTuple = "Hello Scala".partition(_.isUpper)
    println(resTuple)

  }
}
