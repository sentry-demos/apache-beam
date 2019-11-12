package example

import io.sentry.Sentry

import org.slf4j.LoggerFactory

import com.spotify.scio._

object WordCount {
  private val logger = LoggerFactory.getLogger(this.getClass)

  def main(cmdlineArgs: Array[String]): Unit = {
    val (sc, args) = ContextAndArgs(cmdlineArgs)

    val input = "README.md"
    val output = "dist/output.txt"

    logger.error("ERROR HERE");

    sc.textFile(input)
      .map(_.trim)
      .flatMap(_.split("[^a-zA-Z']+").filter(_.nonEmpty))
      .countByValue
      .map(t => t._1 + ": " + t._2)
      .saveAsTextFile(output)

    val result = sc.close().waitUntilFinish()
  }
}
