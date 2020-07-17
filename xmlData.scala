package com.spark.sql

import org.apache.spark.sql.SparkSession

object xmlData {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession.builder().master("local[1]").appName("xmlData").getOrCreate()
    val xmlDf= spark.read
      .format("com.databricks.spark.xml")
//      .option("rowTag", "PLAY").xml("")

  }

}
