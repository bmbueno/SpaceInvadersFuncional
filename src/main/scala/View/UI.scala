package View

import javax.swing.{JFrame,WindowConstants, JLabel, JPanel, ImageIcon}
import java.awt.event._
import java.awt.Color
import java.awt.Dimension
import Controller._
import java.time._
import Array.ofDim

class UI() extends JFrame with KeyListener {

  var controle = new Controller()

  def inicia(): Unit = {
    //controle.inicializa(NUMERO_ALIENS_LINHA,)
  }

  def iniciarMenu(): Unit = {

  }
  def iniciarJogo(): Unit ={


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
