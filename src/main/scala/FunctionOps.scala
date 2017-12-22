package com.zzy.study.scala

/**
 * function 的用法
 */
object FunctionOps {

  /** 普通函数 */
  def add(x : Int) = x +100
  /** 匿名函数 可以赋给常量 */
  val add = (x : Int) => x + 200
  /** 递归函数要指明返回值类型 */
  def fac(n:Int):Int = if(n <= 0) 1 else n*fac(n-1)
  /** 带有默认值的函数 */
  def combine(content:String,left:String="[",right:String="]") = left + content + right
  /** 可变参数 */
  def sum(numbers : Int*) = {
    var res = 0
    for(number <- numbers) res += number
    res
  }
}
