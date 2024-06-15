import scala.swing._
import java.awt.{ Color, Graphics2D }

object cuadrado extends SimpleSwingApplication {

  def top: MainFrame = new MainFrame {
    title = "Figuras Geométricas"
    preferredSize = new Dimension(400, 400)
    
    override def paint(g: Graphics2D): Unit = {
      super.paint(g)
      
      // Dibujar cuadrado
      g.setColor(Color.orange)
      g.drawLine(100, 100, 200, 100)   // Lado 1
      g.drawLine(200, 100, 200, 200)   // Lado 2
      g.drawLine(200, 200, 100, 200)   // Lado 3
      g.drawLine(100, 200, 100, 100)   // Lado 4
    }
  }
  
  def main(args: Array[String]): Unit = {
    SwingUtilities.invokeLater(() => {
      val app = new cuadrado
      app.main(Array.empty)
    })
  }
}
