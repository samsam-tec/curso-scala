import java.util.concurrent.Executors

object hilos {

  def main(args: Array[String]): Unit = {
    // creamos un pool de hilos con 5 hilos
    val pool = Executors.newFixedThreadPool(5)

    // Definir una función que ejecutará en cada hilo
    def tarea(): Runnable = new Runnable {
      def run(): Unit = {
        val threadName = Thread.currentThread().getName
        println(s"Hilo $threadName: Iniciando tarea...")
        Thread.sleep(2000) // Simulamos una tarea que toma 2 segundos
        println(s"Hilo $threadName: Tarea completada.")
      }
    }

    // ejecutamos múltiples tareas en hilos diferentes
    (1 to 10).foreach { _ =>
      pool.execute(tarea())
    }

    // crerramos el pool de hilos después de completar todas las tareas
    pool.shutdown()
  }
}
