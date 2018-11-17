package Model

object SpaceInvaders{



  def main(args: Array[String]): Unit = {

    var lista = 1::2::4::6::Nil;
    var interface = new UI()
    var listaPersonagem = List[Alien]()
    var lista = new Lista()

    listaPersonagem = lista.inicializaAliens(Constantes.NUMERO_ALIENS_LINHA,listaPersonagem)

    println(listaPersonagem)


    println(teste(lista))
  }
}
