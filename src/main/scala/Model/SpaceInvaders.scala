package Model

import View.UI

object SpaceInvaders {
  def main(args: Array[String]): Unit = {
    var interface = new UI()
    var listaPersonagem = List[Alien]()
    var lista = new Lista()

    listaPersonagem = lista.inicializaAliens(Constantes.NUMERO_ALIENS_LINHA,listaPersonagem)

    println(listaPersonagem)

}
}
