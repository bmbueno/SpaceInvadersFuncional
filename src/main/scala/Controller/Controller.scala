package Controller
import Model._
import scala.Array._
import Array.ofDim
import scala.util.Random
import java.awt.Color
import javax.swing.{JFrame,WindowConstants, JLabel, JPanel, ImageIcon}


class Controller(){

  var aliens = inicializaAliens1(4,List[Alien]())
  var nave: Nave = new Nave(500,50)
  var labelNave: JLabel = new JLabel(Constantes.IMG_NAVE)

//==================================================================================

// Função que troca a nave a ser utilizada atualizando sua posição
def trocaNave(x: Int): JLabel = {
  if(x > 0 && x < 550) {
    nave = new Nave(x,50)
    labelNave = new JLabel(Constantes.IMG_NAVE)

    return labelNave
  }else
    return labelNave
}
//==================================================================================

// Função que associa lista de aliens a lista de labels correspondentes, para depois adc no panel
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
// ================================================================================================

// Função cria alies de acordo com o numero de frotas dados
def inicializaAliens1(numFrotas: Int, lista: List[Alien]): List[Alien] = {
    numFrotas match {
      case 0 => lista
      case _ => inicializaAliens1(numFrotas-1,inicializaFrotaAliens(11,lista,numFrotas-1))
    }
}

def inicializaFrotaAliens(numAliens: Int, lista: List[Alien], numFrota: Int): List[Alien] = {
    numAliens match {
      case 0 => lista
      case _ => inicializaFrotaAliens(numAliens-1, adicionaAlien(new Alien(5+((numAliens-1)*50),20+(numFrota*50)),lista),numFrota)
    }
  }


//=================================================================================================

// Função que cria uma lista de aliens com o numero de aliens dado
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
  // Função que adiciona um disparo na lista de disparos
  def adicionaDisparo(disparo: Disparo, lista: List[Disparo]): List[Disparo] ={
    lista match {
      case List() =>  List(disparo)
      case head :: tail => disparo :: lista
    }
  }
  //================================================================================================
// Função que devolve um panel pronto com as labels dadas em uma lista
  def adcLabelsPanel(listaLabels: List[JLabel], panel: JPanel): JPanel = {
    listaLabels.map((label: JLabel) => panel.add(label))                                                // <= UTILIZAÇÃO MAP
    panel.setBackground(Color.black)
    panel.setBounds(0,0,600,600)
    panel.setLayout(null)
    return panel
  }
  //================================================================================================


}
