package com.zzy.study.scala

/**
 * zip 学习
 */
object ZipOps {
  def main(args: Array[String]) {
    val x = Array(2,5,3)
    val y = Array("[","-","]")
    /** 相同类型才可以进行zip操作 */
    val z = y.zip(x)
    z.foreach(println)
    for((a,b)<-z) print(a*b)
    println("#")
  }
}
