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
  val labelTitulo: JLabel = new JLabel("SPACE INVADERS")
  var labelVida: JLabel = new JLabel()
  var labelPontuacao: JLabel = new JLabel()
  var labelNave: JLabel = new JLabel(Constantes.IMG_NAVE)
  var listaLabelsAliens = List[JLabel]()


  def inicia(): Unit = {
    // this.tela.setTitle(titulo);
    // this.tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    // this.tela.setSize(600, 600);
    // this.tela.setLocationRelativeTo(null);
    // this.tela.addKeyListener(this)
    // this.tela.setResizable(false)
    // this.tela.setVisible(true)
  }

  def iniciarMenu(): Unit = {

  }
  def iniciarJogo(): Unit ={


    listaLabelsAliens = controle.labelsAliens(controle.aliens)
    //println(listaLabelsAliens)

    panel = controle.adcLabelsPanel(listaLabelsAliens,panel)
    tela.add(panel)
  //  tela = controle.addLabelsAliensPanel(listaLabelsAliens,tela)

    this.tela.setTitle(titulo);
    this.tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.tela.setSize(600, 600);
    this.tela.setLocationRelativeTo(null);
    this.tela.addKeyListener(this)
    this.tela.setResizable(false)
    this.tela.setVisible(true)

      //this.panel.setBackground(Color.black)
      //  this.panel.add(controle.associaLabelAlien(controle.alien))
        // this.panel.add(this.labelNave)
        // this.labelNave.setBounds(100,100,100,100)
        // this.panel.add(this.labelVida)
        // this.panel.add(this.labelPontuacao)
        // this.panel.setBounds(0,0,600,600)
        // this.panel.setLayout(null)
        // this.tela.add(this.panel)
        // this.tela.setVisible(true)



  }
  def fimDeJogoWin(): Unit = {

  }

  def fimDeJogoOver(): Unit = {

  }
  def keyPressed(k:KeyEvent): Unit = {

  }
  def keyReleased(k:KeyEvent): Unit = {
  }

  def keyTyped(k:KeyEvent): Unit = {
  }

  def printNave(): Unit = {

  }
  def printAliens(): Unit = {

  }



  def printDisparo(): Unit = {

  }
    def printDisparoAliens(): Unit = {

    }
    def printInfo(): Unit = {

    }
  def verificaFimJogo(): Unit = {

  }

}
