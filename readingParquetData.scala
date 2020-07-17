package com.spark.sql

import org.apache.spark.sql.SparkSession

object readingParquetData {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession.builder().master("local[2]").appName("parquetData").getOrCreate()
    val parquetDf=spark.read.parquet("data/dimension.parquet")
    parquetDf.show()
  }

}
