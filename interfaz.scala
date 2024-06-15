import scala.swing._
import scala.swing.event._

object Sumador extends ventana {

  def top: MainFrame = new MainFrame {
    title = "Sumador de Números"
    preferredSize = new Dimension(300, 150)
    resizable = false

    // Componentes de la interfaz
    val label1 = new Label("Número 1:")
    val label2 = new Label("Número 2:")
    val input1 = new TextField(10)
    val input2 = new TextField(10)
    val sumButton = new Button("Sumar")
    val resultLabel = new Label("Resultado:")

    // Diseño del panel principal
    contents = new BoxPanel(Orientation.Vertical) {
      contents += new FlowPanel {
        contents += label1
        contents += input1
      }
      contents += new FlowPanel {
        contents += label2
        contents += input2
      }
      contents += new FlowPanel {
        contents += sumButton
        contents += resultLabel
      }
      border = Swing.EmptyBorder(10, 10, 10, 10)
    }

    listenTo(sumButton)

    reactions += {
      case ButtonClicked(`sumButton`) =>
        try {
          val num1 = input1.text.toDouble
          val num2 = input2.text.toDouble
          val suma = num1 + num2
          resultLabel.text = s"Resultado: $suma"
        } catch {
          case _: NumberFormatException =>
            resultLabel.text = "Error: Ingrese números válidos"
        }
    }
  }

  def main(args: Array[String]): Unit = {
    SwingUtilities.invokeLater(() => {
      val app = new Sumador
      app.main(Array.empty)
    })
  }
}
