package com.zzy.study.scala

import scala.io.Source


object ScalaBasics {

  def main(args: Array[String]) {
    /*** 方法调用*/
    //printStrings
    /*** for 循环（打印指定目录的全部文件名称）*/
    for(file <- new java.io.File(".").listFiles()) println(file)
    /*** tuple 集合*/
    val tuple = (100,"scala","spark")
    println(tuple._1)
    /** array 集合*/
    val array = Array(0,1,2,3,4,5)
    for(num <- array) println(num)
    /** map 集合*/
    val map = Map("scala" -> 10,"spark" -> 20)
    for((k,v)<-map) println("k:"+k+","+"v:"+v)
    for((k,_)<-map) println("k:"+k)
    for((_,v)<-map) println("v:"+v)
    /** 读取指定文件 */
    Source.fromFile("/home/feather/.bashrc").getLines().foreach(println)
    Source.fromURL("http://baidu.com").getLines().foreach(println)
  }

  /*** 方法声明 def关键字 */
  def printStrings = {
    /*** 变量声明*/
    var str = ""
    /*** do while 循环操作*/
    do{
      println("please input something !")
      /*** 控制台输入*/
      str = readLine()
      println("str:"+str)
    }while(str != "")
  }
}
