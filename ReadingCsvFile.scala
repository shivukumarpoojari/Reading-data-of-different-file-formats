package com.spark.sql

import org.apache.spark.sql.SparkSession

object ReadingCsvFile {
  def main(args: Array[String]): Unit = {
    val session = SparkSession.builder().master("local").getOrCreate()
    val heartData=session.read.option("header","true").csv("data/heart.csv")
    heartData.show()
  }
}
