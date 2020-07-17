package com.spark.sql

import org.apache.spark.sql.SparkSession

object ReadingTextFile {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession.builder().master("local[2]").appName("textData").getOrCreate()
    val textDf=spark.read.text("C:/Users/user/IdeaProjects/SparkSqlApis/data/SW_EpisodeIV.txt")
    textDf.show()
  }

}
