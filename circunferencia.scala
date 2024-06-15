import scala.swing._
import java.awt.{ Color, Graphics2D }

object circunferencia extends SimpleSwingApplication {

  def top: MainFrame = new MainFrame {
    title = "Figuras Geométricas"
    preferredSize = new Dimension(400, 400)
    
    override def paint(g: Graphics2D): Unit = {
      super.paint(g)
      
      // Dibujar circunferencia
      val centerX = 200
      val centerY = 200
      val radius = 50
      
      g.setColor(Color.blue)
      g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius)
    }
  }
  
  def main(args: Array[String]): Unit = {
    SwingUtilities.invokeLater(() => {
      val app = new circunferencia
      app.main(Array.empty)
    })
  }
}
/*
Para dibujar una circunferencia usando la ecuación general de la circunferencia:
(x - h)^2 + (y - k)^2 = r^2
establecemos el centro (ℎ,𝑘) y 𝑟 como radio de la circunferencia.
*/