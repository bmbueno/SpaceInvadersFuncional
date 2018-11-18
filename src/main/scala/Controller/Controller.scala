package Controller
import Model._
import scala.Array._
import Array.ofDim
import scala.util.Random
import java.awt.Color
import javax.swing.{JFrame,WindowConstants, JLabel, JPanel, ImageIcon}


class Controller(){

  var aliens = List[Alien]()
  aliens = inicializaAliens(11,aliens)


//==================================================================================
  def labelsAliens(listaAliens: List[Alien]): List[JLabel] = {
    listaAliens match {
      case List() => Nil
      case head :: tail => associaLabelAlien(head) :: labelsAliens(tail)
    }
  }
  def associaLabelAlien(alien: Alien): JLabel = {
    var aux = new JLabel(Constantes.IMG_ALIEN1)
    aux.setBounds(alien.getCX,alien.getCY,100,100)
    return aux
  }

//=================================================================================================
  def inicializaAliens(numAliens: Int, lista: List[Alien]): List[Alien] = {
    numAliens match {
      case 0 => lista
      case _ => inicializaAliens(numAliens-1, adicionaAlien(new Alien(5+((numAliens-1)*50),20),lista))
    }
  }
  def adicionaAlien(alien: Alien, lista: List[Alien]): List[Alien] ={
    lista match {
      case List() =>  List(alien)
      case head :: tail => alien :: lista
    }
  }

  //================================================================================================
  def adicionaDisparo(disparo: Disparo, lista: List[Disparo]): List[Disparo] ={
    lista match {
      case List() =>  List(disparo)
      case head :: tail => disparo :: lista
    }
  }
  //================================================================================================

  def adcLabelsPanel(listaLabels: List[JLabel], panel: JPanel): JPanel = {
    listaLabels.map((label: JLabel) => panel.add(label))
    panel.setBackground(Color.black)
    panel.setBounds(0,0,600,600)
    panel.setLayout(null)
    return panel
  }
  //================================================================================================

  def setDificuldade(dificuldade: String): Unit = {

  }

  def setTecla(tecla: Int): Unit = {

  }

  def Nave(): Unit = {
  }

  def Alien(): Unit = { // vai ter de receber a lista de aliens

  }

  def disparoNav(): Unit = {


}

  def getAliens(i : Int,j : Int): Unit = {

  }

  def disparoAliens(): Unit = {

  }

}
