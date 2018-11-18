package Model

import javax.swing.JLabel

class Personagem(coordX: Int, coordY: Int, ativo1: Boolean = true) extends JLabel{
  private var coordenadaX :Int = coordX;
  private var coordenadaY :Int = coordY;
  private var ativo       :Boolean = ativo1;

  //Definindo a label
  this.setVisible(this.ativo);


  def getAtivo = ativo
  def getCX(): Int = {
    return coordenadaX
  }

  def getCY(): Int = {
    return coordenadaY
  }

  // def morreu(list: List[Personagem], personagem: Personagem): List[Personagem] = {
  //   if(list.isEmpty) {
  //     if (list.head.getCoordenadaX() == personagem.getCoordenadaX() && list.head.getCoordenadaY() == personagem.getCoordenadaY()) {
  //
  //     }else{
  //       morreu(list.tail, personagem);
  //     }
  //   }
  // }
  // def morreu(list: List[Personagem]): List[Personagem] = {
  //   list match {
  //     case List() => Nil
  //     case head :: tail =>  this.colisao(head)(0) :: morreu(tail)
  //   }
  // }

  // def morreu(list: List[Personagem]): List[Personagem] = {
  //   if(list.isEmpty) {
  //      return list
  //   }
  //   else{
  //     if(this.colisao(list.head)){
  //
  //     }
  //     Se colisao
  //       bota os dois na lista desativoss
  //       concatena o resto da l
  //   }
  // }

  def colisao(per: Personagem): Boolean = {
    if(per.getCX == this.getCX && per.getCY == this.getCY){
      //return List((new Personagem(per.getCoordenadaX(),per.getCoordenadaY(),false)),(new Personagem(this.getCoordenadaX(),per.getCoordenadaY(),false)))
      return true
    }
    else
      //return List((new Personagem(per.getCoordenadaX(),per.getCoordenadaY(),true)),(new Personagem(this.getCoordenadaX(),per.getCoordenadaY(),true)))
      return false
    }



}
