package com.spark.sql

import org.apache.spark.sql.SparkSession

object readingJsonData {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession.builder().master("local[2]").appName("jsonData").getOrCreate()
    val jsonDf=spark.read.json("data/iris.json")
    jsonDf.show()
    jsonDf.printSchema()
  }}
