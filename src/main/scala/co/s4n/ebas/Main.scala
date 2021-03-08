package co.s4n.ebas

import scala.io.StdIn
import scala.math.abs

object Main extends App {

  def gcd(a: Int, b: Int): Int = {
    if(a == b) a
    else if(a > b) gcd(a - b, b)
    else gcd(a, b - a)
  }

  def lcm(a: Int, b: Int): Int = abs(a * b) / gcd(a, b)

  def strToInts(str: String) = str.split(" ").filter(_ != "").map(_.toInt)

  val in = StdIn.readLine()
  val arrayInts = strToInts(in)
  val (x, y) = (arrayInts(0), arrayInts(1))
  println(s"${lcm(x, y) / x} ${lcm(x, y) / y}")
}
