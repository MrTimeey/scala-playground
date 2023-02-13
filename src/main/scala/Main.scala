import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object Date {
  def main(args: Array[String]): Unit = {
    println("Hallo, Welt!")

    val now = new Date
    val df = getDateInstance(LONG, Locale.GERMANY)
    println(df format now)
  }
}