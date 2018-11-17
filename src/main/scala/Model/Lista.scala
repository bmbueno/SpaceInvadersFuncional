package Model

class Lista() {

  def inicializaAliens(numAliens: Int, lista: List[Alien]): List[Alien] = {
    numAliens match {
      case 0 => lista
      case _ => inicializaAliens(numAliens-1, adicionaAlien(new Alien(200,200),lista))
    }
  }
  def adicionaAlien(alien: Alien, lista: List[Alien]): List[Alien] ={
    lista match {
      case List() =>  List(alien)
      case head :: tail => alien :: lista
    }
  }
  def adicionaDisparo(disparo: Disparo, lista: List[Disparo]): List[Disparo] ={
    lista match {
      case List() =>  List(disparo)
      case head :: tail => disparo :: lista
    }
  }
  def adicionaDisparo1(disparo: Disparo, lista: List[Disparo]): List[Disparo] ={
    if(lista.isEmpty) {
      return  List(disparo)
    }
    else
      return disparo :: lista
    }
  }
