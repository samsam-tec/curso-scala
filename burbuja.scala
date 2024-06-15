object OrdenamientoBurbuja {

  def main(args: Array[String]): Unit = {
    val lista = Array(64, 25, 12, 22, 11)

    println("Lista original:")
    imprimirLista(lista)

    // Llamar al método de ordenamiento burbuja
    ordenamientoBurbuja(lista)

    println("\nLista ordenada:")
    imprimirLista(lista)
  }

  def ordenamientoBurbuja(arr: Array[Int]): Unit = {
    val n = arr.length

    for (i <- 0 until n-1) {
      // los ultimos i elementos ya están ordenados, por lo tanto, no es necesario revisarlos
      for (j <- 0 until n-i-1) {
        // comparamos elementos adyacentes y hacer el intercambio si están en el orden incorrecto
        if (arr(j) > arr(j+1)) {
          // Intercambiar arr[j] y arr[j+1]
          val temp = arr(j)
          arr(j) = arr(j+1)
          arr(j+1) = temp
        }
      }
    }
  }

  def imprimirLista(arr: Array[Int]): Unit = {
    // Imprimir todos los elementos de la lista
    arr.foreach(e => print(e + " "))
    println()
  }
}
