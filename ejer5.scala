@main def ejer5(): Unit = {

    val lista =List(" Scala ", "spark", "", " FUNCIONAL ", "scala", "Spark")

    val mapaConteo = lista
        .map(_.trim)
        .filter(! _.isEmpty())
        .map(_.toLowerCase())
        .distinct
        .sorted
        .map(palabra => (palabra, palabra.length))
        .toMap

    mapaConteo.foreach{case (palabra, apariciones) => println(s"Palabra: $palabra, apariciones: $apariciones")}

    val suma = mapaConteo
        .foldLeft(0){ case (acc, (palabra, longitud))
         => acc + longitud}

    println(s"La suma es $suma.")

}