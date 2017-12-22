package com.zzy.study.scala

import scala.collection.mutable.ArrayBuffer

/**
 * 数组学习
 */
object ArrayOps {
  def main(args: Array[String]) {
    /** 普通数组 */
    val array = Array(1,2,3,4,5)
    array.foreach(println)
    /** 定长数组 */
    val numberArray = new Array[Int](5)
    val strArray = new Array[String](5)
    numberArray.foreach(println)
    strArray.foreach(println)
    /** 可变数组 */
    val ab = ArrayBuffer(4,1,2,3)
    /** 数组 + 操作 */
    ab += 4
    println("ab += 4")
    ab.foreach(print)
    println("#")
    /** 数组 - 操作(去掉索引靠前的) */
    ab -= 4
    println("ab -= 4")
    ab.foreach(print)
    println("#")
    /** 数组 + 原族操作 */
    ab += (5,6)
    println("ab += (5,6)")
    ab.foreach(print)
    println("#")
    /** 数组 + 数组操作 */
    ab ++= Array(7,8)
    println("ab ++= Array(7,8)")
    ab.foreach(print)
    println("#")
    /** 数组去除操作 */
    ab.trimEnd(5)
    println("ab.trimEnd(5)")
    ab.foreach(print)
    println("#")
    /** 数组插入操作  insert(n: Int, elems: A*) */
    ab.insert(1,0,0)
    println("ab.insert(1,0,0)")
    ab.foreach(print)
    println("#")
    /** 数组删除操作 */
    ab.remove(3)
    println("ab.remove(3)")
    ab.foreach(print)
    println("#")
    /** 数组范围删除操作 */
    ab.remove(1,3)
    println(" ab.remove(1,3)")
    ab.foreach(print)
    println("#")
    /** 转化为不可边数组 */
    ab.toArray
    /** 对数组每一个元素做操作 */
    val resArray = for( num <- array) yield num * 2//array.map(_*2)
    array.foreach(print)
    print("==>")
    resArray.foreach(print)
    println("#")
    /** 对数组元素求和(仅对于范型可求和的数组) */
    val sumArray = Array(1,2,3).sum
    println("sumArray:"+sumArray)
    /** 数组取最大值(字符串参考码值)*/
    val maxArray = Array("aa","ccc","dd","555555555").max
    println("maxArray:"+maxArray)
    /** 数组取最大值(字符串参考码值)*/
    val sortArray = Array("aa","ccc","dd","555555555").sorted
    println("sorted")
    sortArray.foreach(println)
    println("#")
    /** 数组字符化 */
    println(array.mkString("and"))
    println(array.mkString("<<","and",">>"))
    /** 定义矩阵 */
    val dim = Array.ofDim[Int](3,4)
    dim(1)(0) = 233
    println("dim(0)(0)  "+dim(0)(0))
    println("dim(1)(0)  "+dim(1)(0))

  }
}
