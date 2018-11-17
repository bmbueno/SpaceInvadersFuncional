package Model

import javax.swing.JLabel

class Personagem(coordX: Int, coordY: Int) extends JLabel{
  private var coordenadaX :Int = coordX;
  private var coordenadaY :Int = coordY;
  private var ativo       :Boolean = true;

  //Definindo a label
  this.setVisible(this.ativo);



  def getCoordenadaX():Int = {
    return this.coordenadaX;
  }

  def getCoordenadaY():Int = {
    return this.coordenadaY;
  }

  def morreu(list: List[Personagem], personagem: Personagem):List[Personagem] = {
    if(!list.isEmpty) {
      if (list.head.getCoordenadaX() == personagem.getCoordenadaX() && list.head.getCoordenadaY() == personagem.getCoordenadaY()) {

      }else{
        morreu(list.tail, personagem);
      }
    }
  }
  

}
