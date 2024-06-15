import scala.swing._
import java.awt.{Color, Graphics2D}

object TrianguloSierpinskiRecursivo extends SimpleSwingApplication {

  def top: MainFrame = new MainFrame {
    title = "Triángulo de Sierpinski Recursivo"
    preferredSize = new Dimension(600, 600)

    override def paintComponent(g: Graphics2D): Unit = {
      super.paintComponent(g)

      val depth = 6 // Nivel de profundidad del Triángulo de Sierpinski

      // Puntos iniciales del triángulo grande
      val p1 = new Point(size.width / 2, 50)
      val p2 = new Point(50, size.height - 50)
      val p3 = new Point(size.width - 50, size.height - 50)

      // Dibujar el triángulo inicial
      g.setColor(Color.BLACK)
      drawTriangle(g, p1, p2, p3)

      // Llamar a la función recursiva para dibujar el Triángulo de Sierpinski
      sierpinski(g, depth, p1, p2, p3)
    }

    // Función recursiva para dibujar el Triángulo de Sierpinski
    def sierpinski(g: Graphics2D, depth: Int, p1: Point, p2: Point, p3: Point): Unit = {
      if (depth > 0) {
        // Calcular los puntos medios de cada lado del triángulo
        val p12 = midpoint(p1, p2)
        val p23 = midpoint(p2, p3)
        val p31 = midpoint(p3, p1)

        // Dibujar los tres triángulos más pequeños
        drawTriangle(g, p1, p12, p31)
        drawTriangle(g, p12, p2, p23)
        drawTriangle(g, p31, p23, p3)

        // Llamar recursivamente a la función para cada nuevo triángulo
        sierpinski(g, depth - 1, p1, p12, p31)
        sierpinski(g, depth - 1, p12, p2, p23)
        sierpinski(g, depth - 1, p31, p23, p3)
      }
    }

    // Función para dibujar un triángulo dado por sus vértices
    def drawTriangle(g: Graphics2D, p1: Point, p2: Point, p3: Point): Unit = {
      g.drawLine(p1.x, p1.y, p2.x, p2.y)
      g.drawLine(p2.x, p2.y, p3.x, p3.y)
      g.drawLine(p3.x, p3.y, p1.x, p1.y)
    }

    // Función para calcular el punto medio entre dos puntos
    def midpoint(p1: Point, p2: Point): Point =
      new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2)
  }
}
