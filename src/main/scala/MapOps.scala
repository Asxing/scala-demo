package com.zzy.study.scala

import scala.collection.SortedMap

/**
 * map 学习
 */
object MapOps{
  def main(args: Array[String]) {
    /** 普通Map */
    val map = Map("book" -> 20,"gun" -> 100,"pad" -> 1000)
    val resMap = for((k,v) <- map) yield (k,v*0.9)
    resMap.foreach(print)
    println("#")
    println("getOrElse pad  "+resMap.getOrElse("pad",500))
    println("getOrElse phone  "+resMap.getOrElse("phone",800))
    /** 可变Map */
    val mMap = scala.collection.mutable.Map("a"->1,"b"->"2")
    mMap += ("c"->3)
    mMap -= "a"
    mMap.foreach(print)
    println("#")
    /** 有序Map */
    SortedMap("book" -> 20,"gun" -> 100,"pad" -> 1000).foreach(print)
    println("#")
  }
}
