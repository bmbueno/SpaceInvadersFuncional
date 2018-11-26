package View

import javax.swing.{JFrame,WindowConstants, JLabel, JPanel, ImageIcon}
import java.awt.event._
import java.awt.Color
import java.awt.Dimension
import Controller._
import Model.Constantes
import java.time._
import Array.ofDim

class UI() extends JFrame with KeyListener {

  var controle = new Controller()
  val titulo: String = "Space Invaders"
  var panel: JPanel = new JPanel()
  var tela: JFrame = new JFrame()
  var labelVida: JLabel = new JLabel()
  var labelPontuacao: JLabel = new JLabel()
  var listaLabelsAliens = List[JLabel]()
  var auxMovimento: JLabel = new JLabel()

  def iniciarJogo(): Unit ={

    listaLabelsAliens = controle.labelsAliens(controle.aliens)

    panel = controle.adcLabelsPanel(listaLabelsAliens,panel)
    tela.add(panel)

    this.tela.setTitle(titulo);
    this.tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.tela.setSize(600, 600);
    this.tela.setLocationRelativeTo(null);
    this.tela.addKeyListener(this)
    this.tela.setResizable(false)
    this.tela.setVisible(true)

  }
  def keyPressed(k:KeyEvent): Unit = {
    k.getKeyCode() match {
        case 32 => {
          var dis = new JLabel(Constantes.IMG_DISPARO)
          panel.add(dis)
          for(i <- 0 to 10)
          {Thread.sleep(1000)
          dis.setBounds(250,250+i*10,100,100)}

        }
        case 37 => {
          panel.remove(auxMovimento)                                    // remove a nave anterior pra por a proxima nova
          auxMovimento = controle.trocaNave(controle.nave.coordenadaX-10)
          panel.add(auxMovimento)
          auxMovimento.setBounds(controle.nave.coordenadaX,530,50,50)
        }
        case 39 => {
          panel.remove(auxMovimento)
          auxMovimento = controle.trocaNave(controle.nave.coordenadaX+10)
          panel.add(auxMovimento)
          auxMovimento.setBounds(controle.nave.coordenadaX,530,50,50)
        }
        case _ => // default
    }

  }
  def keyReleased(k:KeyEvent): Unit = {
  }

  def keyTyped(k:KeyEvent): Unit = {
  }
}
