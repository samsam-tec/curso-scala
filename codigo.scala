object OperacionesBasicas {
  def main(args: Array[String]): Unit = {
    // Operaciones basicas
    val a = 10
    val b = 5

    val suma = a + b
    val resta = a - b
    val multiplicacion = a * b
    val division = a / b
    val potencia = Math.pow(a, b)  // a^b
    val radicacion = Math.sqrt(a)  // √a

    println(s"Suma: $a + $b = $suma")
    println(s"Resta: $a - $b = $resta")
    println(s"Multiplicación: $a * $b = $multiplicacion")
    println(s"División: $a / $b = $division")
    println(s"Potencia: $a ^ $b = $potencia")
    println(s"Radicación: √$a = $radicacion")

    // Operadores Lógicos
    val verdadero = true
    val falso = false

    println(s"verdadero AND falso = ${verdadero && falso}")
    println(s"verdadero OR falso = ${verdadero || falso}")
    println(s"NOT verdadero = ${!verdadero}")

    // Operadores Relacionales
    println(s"$a > $b = ${a > b}")
    println(s"$a < $b = ${a < b}")
    println(s"$a == $b = ${a == b}")
    println(s"$a != $b = ${a != b}")
    println(s"$a >= $b = ${a >= b}")
    println(s"$a <= $b = ${a <= b}")

    // Bucles
    println("Bucle for:")
    for (i <- 1 to 5) {
      println(i)
    }

    println("Bucle while:")
    var i = 1
    while (i <= 5) {
      println(i)
      i += 1
    }

    println("Bucle do-while:")
    i = 1
    do {
      println(i)
      i += 1
    } while (i <= 5)

    // Condicionales
    println("Condicional if-else:")
    if (a > b) {
      println(s"$a es mayor que $b")
    } else if (a < b) {
      println(s"$a es menor que $b")
    } else {
      println(s"$a es igual a $b")
    }

    // Manejo de Datos
    println("Manejo de Arrays:")
    val array = Array(1, 2, 3, 4, 5)
    array.foreach(println)

    println("Manejo de Listas:")
    val lista = List(1, 2, 3, 4, 5)
    lista.foreach(println)

    println("Manejo de Mapas:")
    val mapa = Map("uno" -> 1, "dos" -> 2, "tres" -> 3)
    mapa.foreach { case (k, v) => println(s"$k -> $v") }

    println("Manejo de Tuplas:")
    val tupla = (1, "Scala", true)
    println(tupla._1)
    println(tupla._2)
    println(tupla._3)
  }
}

//scalac codigo.scala
//scala codigo
//