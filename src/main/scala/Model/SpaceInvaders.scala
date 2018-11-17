package Model
import View._
object SpaceInvaders{

  def main(args: Array[String]): Unit = {

    var interface = new UI()
    var lista = new Lista()
    var listaA = List(12, Nil)
    var listaPersonagem = List(new Alien(100,100), "tesdqad", listaA)
    var listaD = List[Disparo]()
    var disparo = new Disparo(100,100)
    var per1 = new Personagem(100,100)
    var per2 = new Personagem(100,100)

//    listaPersonagem = lista.inicializaAliens(Constantes.NUMERO_ALIENS_LINHA,listaPersonagem)
    var l = listaPersonagem(2)

  //  println(per1.colisao(per2)(0).getAtivo)

    println(lista.adicionaDisparo1(disparo,listaD))
    println(lista.adicionaDisparo1(disparo,listaD))
    

  }
}
