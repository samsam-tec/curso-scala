class Alumno(var nombre: String, var edad: Int, var promedio: Double) {
  
  // metods para obtener los atributos
  def getNombre: String = nombre
  def getEdad: Int = edad
  def getPromedio: Double = promedio
  
  // mtdos para actualizar los atributos
  def setNombre(nuevoNombre: String): Unit = {
    nombre = nuevoNombre
  }
  
  def setEdad(nuevaEdad: Int): Unit = {
    edad = nuevaEdad
  }
  
  def setPromedio(nuevoPromedio: Double): Unit = {
    promedio = nuevoPromedio
  }
  
  // Método para imprimir la información del alumno
  def imprimirInfo(): Unit = {
    println(s"Nombre: $nombre, Edad: $edad, Promedio: $promedio")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var opcion = 0
    
    //  seleccionar la fuente de datos
    println("Seleccione una opción:")
    println("1. Ingresar datos por teclado")
    println("2. Usar datos predeterminados")
    
    // leemos la opción del usuario
    opcion = scala.io.StdIn.readInt()
    
    // switch case para manejar la opción seleccionada
    opcion match {
      case 1 => {
        println("Ingrese los datos del alumno:")
        println("Nombre:")
        val nombre = scala.io.StdIn.readLine()
        println("Edad:")
        val edad = scala.io.StdIn.readInt()
        println("Promedio:")
        val promedio = scala.io.StdIn.readDouble()
        
        val alumno1 = new Alumno(nombre, edad, promedio)
        alumno1.imprimirInfo()
      }
      case 2 => {
        // dtos predeterminados para 6 alumnos
        val alumno1 = new Alumno("Juan", 20, 8.5)
        val alumno2 = new Alumno("María", 22, 7.8)
        val alumno3 = new Alumno("Pedro", 21, 9.2)
        val alumno4 = new Alumno("Ana", 19, 8.0)
        val alumno5 = new Alumno("Carlos", 23, 7.5)
        val alumno6 = new Alumno("Laura", 20, 9.0)
        
        // imprimirmos información de los alumnos
        println("Datos predeterminados:")
        alumno1.imprimirInfo()
        alumno2.imprimirInfo()
        alumno3.imprimirInfo()
        alumno4.imprimirInfo()
        alumno5.imprimirInfo()
        alumno6.imprimirInfo()
      }
      case _ => println("Opción inválida")
    }
  }
}
