import scala.swing._
import java.awt.{ Color, Graphics2D, geom }

object FigurasGeometricas extends SimpleSwingApplication {

  def top: MainFrame = new MainFrame {
    title = "Figuras Geométricas"
    preferredSize = new Dimension(400, 400)
    
    // Define el color de fon verde
    background = Color.green
    
    override def paint(g: Graphics2D): Unit = {
      super.paint(g)
      
      // Dibuja un cuadrado sin fon verde
      g.setColor(Color.black)
      g.drawRect(50, 50, 100, 100)
      
      //  un cuadrado con fon verde
      g.setColor(Color.green)
      g.fillRect(200, 50, 100, 100)
      
      //  un triángulo sin fon verde
      val triangle = new geom.Path2D.Double()
      triangle.moveTo(150, 250)
      triangle.lineTo(100, 350)
      triangle.lineTo(200, 350)
      triangle.closePath()
      g.setColor(Color.black)
      g.draw(triangle)
      
      //  un triángulo con fon verde
      val triangle2 = new geom.Path2D.Double()
      triangle2.moveTo(300, 250)
      triangle2.lineTo(250, 350)
      triangle2.lineTo(350, 350)
      triangle2.closePath()
      g.setColor(Color.green)
      g.fill(triangle2)
      
      //  un círculo sin fon verde
      g.setColor(Color.black)
      g.drawOval(100, 150, 100, 100)
      
      //  un círculo con fon verde
      g.setColor(Color.green)
      g.fillOval(250, 150, 100, 100)
    }
  }
  
  def main(args: Array[String]): Unit = {
    SwingUtilities.invokeLater(() => {
      val app = new FigurasGeometricas
      app.main(Array.empty)
    })
  }
}
