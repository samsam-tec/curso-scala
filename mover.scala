import scala.swing._
import java.awt.{ Color, Graphics2D }
import scala.swing.event._

object MoverPixel extends SimpleSwingApplication {
  
  // variables para las coordenadas del punto
  var posX = 200
  var posY = 200
  
  def top: MainFrame = new MainFrame {
    title = "Mover Pixel con Teclado"
    preferredSize = new Dimension(400, 400)
    
    focusable = true
    
    listenTo(keys)
    
    reactions += {
      case KeyPressed(_, Key.Up, _, _) =>
        posY -= 1
        repaint()
      case KeyPressed(_, Key.Down, _, _) =>
        posY += 1
        repaint()
      case KeyPressed(_, Key.Left, _, _) =>
        posX -= 1
        repaint()
      case KeyPressed(_, Key.Right, _, _) =>
        posX += 1
        repaint()
    }
    
    override def paint(g: Graphics2D): Unit = {
      super.paint(g)
      
      // dibujamos el punto 
      g.setColor(Color.red)
      //coordenadas actuales
      g.fillRect(posX, posY, 5, 5)
    }
  }
  
  def main(args: Array[String]): Unit = {
    SwingUtilities.invokeLater(() => {
      val app = new MoverPixel
      app.main(Array.empty)
    })
  }
}
