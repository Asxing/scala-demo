package com.zzy.study.scala

/**
 * Lazy 学习
 */
object LazyOps {
  def main(args: Array[String]) {
    val str = getName("spark")
    /** 可以实现延时加载 */
    lazy val strLazy = getName("scala")
  }
  def getName(name:String) = {
    println("name is "+name)
    name + "!"
  }
}
