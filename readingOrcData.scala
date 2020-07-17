package com.spark.sql

import org.apache.spark.sql.SparkSession

object readingOrcData {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession.builder().master("local[1]").appName("orcData").getOrCreate()
    val orcDf=spark.read.option("header","true").orc("data/userdata2_orc")
    orcDf.show()
  }

}
