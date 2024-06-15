object factorialR {
  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn._

    println("Ingrese un número para calcular su factorial:")
    val num = readInt()

    val resultado = factorial(num)

    println(s"El factorial de $num es $resultado")
  }
}
