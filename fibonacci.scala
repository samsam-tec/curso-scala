object fibonacci {
  // funcion recursiva para calcular el n-esimo numero de fibo
  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn._
    println("Ingrese el valor de n para calcular el número de Fibonacci:")
    val n = readInt()

    println(s"El número de Fibonacci en la posición $n es: ${fibonacci(n)}")
  }
}

/*

object FibonacciNPrimeros {
  // funcion recursiva para calcular los primeros n nmeros de fibonacci
  def fibonacciN(n: Int): List[Int] = {
    def fibRec(count: Int, a: Int, b: Int, acc: List[Int]): List[Int] = {
      if (count <= 0) acc.reverse
      else fibRec(count - 1, b, a + b, a :: acc)
    }
    if (n <= 0) List.empty
    else if (n == 1) List(0)
    else fibRec(n - 1, 0, 1, List(1, 0))
  }

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn._

    println("Ingrese cuántos números de Fibonacci desea mostrar:")
    val n = readInt()
    val fibs = fibonacciN(n)

    println(s"Los primeros $n números de Fibonacci son: ${fibs.mkString(", ")}")
  }
}*/
