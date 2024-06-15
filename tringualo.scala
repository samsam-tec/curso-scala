import scala.swing._
import java.awt.{ Color, Graphics2D }

object triangulo extends SimpleSwingApplication {

  def top: MainFrame = new MainFrame {
    title = "Figuras Geométricas"
    preferredSize = new Dimension(400, 400)
    
    override def paint(g: Graphics2D): Unit = {
      super.paint(g)
      
      // dubujamos triángulo
      g.setColor(Color.red)
      g.drawLine(100, 100, 200, 100)   // Lado 1
      g.setColor(Color.blue)
      g.drawLine(200, 100, 150, 200)   // Lado 2
      g.setColor(Color.green)
      g.drawLine(150, 200, 100, 100)   // Lado 3
    }
  }
  
  def main(args: Array[String]): Unit = {
    SwingUtilities.invokeLater(() => {
      val app = new triangulo
      app.main(Array.empty)
    })
  }
}
