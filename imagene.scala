import scala.swing._
import java.awt.{Graphics2D, Image}
import javax.imageio.ImageIO
import java.io.File

object MostrarImagen extends SimpleSwingApplication {

  // Variable para almacenar la imagen cargada
  var imagen: Option[Image] = None

  // Método para cargar la imagen desde la ruta especificada
  def cargarImagen(ruta: String): Option[Image] = {
    try {
      Some(ImageIO.read(new File(ruta)))
    } catch {
      case e: Exception =>
        println(s"Error al cargar la imagen: $e")
        None
    }
  }

  def top: MainFrame = new MainFrame {
    title = "Mostrar Imagen"
    preferredSize = new Dimension(800, 600)
    resizable = false

    // Cargar la imagen al iniciar la ventana
    imagen = cargarImagen("logo.png")

    override def paint(g: Graphics2D): Unit = {
      super.paint(g)
      for (img <- imagen) {
        g.drawImage(img, (size.width - img.getWidth(null)) / 2, (size.height - img.getHeight(null)) / 2, null)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    SwingUtilities.invokeLater(() => {
      val app = new MostrarImagen
      app.main(Array.empty)
    })
  }
}
