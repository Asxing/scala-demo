package com.zzy.study.scala

/**
 * For学习
 */
object ForOps {
  def main(args: Array[String]) {
    /** 双层 for 循环 */
    for(i <- 1 to 2;j <- 1 to 2) print(i*100+j + "##")
    println("==========================")
    /** 带有守卫的 for 循环 */
    for(i <- 1 to 2;j <- 1 to 2 if i!=j) print(i*100+j + "##")
    println("==========================")
  }
}
