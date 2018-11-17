package Controller
import Model._
import scala.Array._
import Array.ofDim
import scala.util.Random

class Controller(){

  private var tecla: Int = 0
  private var velocidadeDefinida: Int = 0
  private var velocidade: Int = 0
  private var alien = new Alien(10,100)
  private var nave = new Nave(100,500)
  private var disparoNave: Disparo = new Disparo(100,200,false)
  private var aliens: Array[Alien] = new Array[Alien](Constantes.NUMERO_ALIENS_LINHA)
  private var aliens1: Array[Alien] = new Array[Alien](Constantes.NUMERO_ALIENS_LINHA)
  private var aliens2: Array[Alien] = new Array[Alien](Constantes.NUMERO_ALIENS_LINHA)
  private var aliensV =  ofDim[Alien](3,Constantes.NUMERO_ALIENS_LINHA)
  private var pontuacao: Int = 0
  private var iRandomico : Random = new Random
  private var jRandomico : Random = new Random
  private var vida: Int = 3
  private var aliensMortos: Int = 0


  def getVelocidade = velocidade
  def getNave = nave
  def getAlien = alien
  def getDisparo = disparoNave
  def getNumAliens = Constantes.NUMERO_ALIENS_LINHA
  def getNumAliensColuna = Constantes.NUMERO_ALIENS_COLUNA
  def getPontuação = pontuacao
  def getImagemAlien1 = Constantes.IMG_ALIEN1
  def getImagemDisparo = Constantes.IMG_DISPARO
  def getVida = vida

  def inicializa(): Unit = {

  }

  def setDificuldade(dificuldade: String): Unit = {

  }

  def setTecla(tecla: Int): Unit = {

  }

  def Nave(): Unit = {
  }

  def Alien(): Unit = { // vai ter de receber a lista de aliens

  }

  def disparoNav(): Unit = {
    if(this.disparoNave.getAtivo){
      this.disparoNave.moveFrente()
    }
    if(this.disparoNave.getY < 0)
      this.disparoNave.desativa()

      for(i <- 0 to Constantes.NUMERO_ALIENS_COLUNA-1){
        for(j <- 0 to Constantes.NUMERO_ALIENS_LINHA-1){
          if(((this.disparoNave.getX > aliensV(i)(j).getX - 10) && (this.disparoNave.getX < aliensV(i)(j).getX + 10)) && (this.disparoNave.getY == aliensV(i)(j).getY) && (aliensV(i)(j).getAtivo))
                 {  this.disparoNave.desativa()
                   this.aliensV(i)(j).desativa()
                   aliensMortos +=1
                   pontuacao += 10
                 }
        }
      }

}

  def getAliens(i : Int,j : Int): Alien = {

  }

  def disparoAliens(): Unit = {

  }
  def ganhou(): Boolean = {
    
  }
}
