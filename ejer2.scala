
@main def ejer2(): Unit = {

    val lista = List(3, 7, 2, 10, 4, 7, 10)

    val suma = lista
        .distinct
        .filter(_ > 5)
        .map(x => x*x)
        .sum

    println(s"El resultado es $suma.")
 

}