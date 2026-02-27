@main def ejer6(): Unit = {

    val texto = List(      
        "scala combina programación funcional y orientada a objetos",
        "su sintaxis es concisa y expresiva",
        "permite trabajar con colecciones de manera eficiente",
        "spark usa scala para procesamiento distribuido de grandes datos",
        "la interoperabilidad con java es uno de sus puntos fuertes",
        "los patrones de diseño funcional ayudan a escribir código más seguro",
        "los implicits permiten extender funcionalidades sin modificar clases",
        "las case classes facilitan la manipulación de datos inmutables",
        "el REPL de scala es útil para probar ideas rápidamente",
        "la comunidad scala aporta librerías como cats y akka",
        "spark y scala juntos permiten análisis de datos en tiempo real",
        "los streams en scala son una forma elegante de procesar secuencias",
        "scala fomenta un estilo declarativo de programación",
        "la combinación de futures y promises simplifica la concurrencia",
        "muchos frameworks de big data confían en scala por su expresividad",
        "comprender los monads en scala ayuda a manejar efectos secundarios",
        "scala se puede usar tanto en backend como en análisis de datos",
        "la documentación oficial proporciona ejemplos claros y prácticos",
        "la sintaxis flexible permite escribir DSLs internas con facilidad",
        "aprendiendo scala, se adquieren habilidades valiosas para big data"
        )

    val palabras = texto.flatMap(_.split("[\\s.,;:]+"))

    val conteo = palabras
        .groupBy(identity)
        .mapValues(_.size)
        .toMap

    //Alternativa usando groupMapReduce
    val conteo2 = palabras.groupMapReduce(identity)(_ => 1)(_ + _)

    //Media de palabras por frase (suma de todas las palabras entre número de frases)
    val frases = texto.map(_.split("[\\s.,;:]+"))
    val media = frases.map(_.size).sum.toDouble/frases.size

    println(s"La media de palabras por frase es: $media.")

    //alternativa (sin val frases): val media = palabras.size.toDouble/texto.size

    //Palabras más frecuentes
    val top2 = conteo
        .toSeq
        .sortBy{case(_, valor) => -valor}
        .take(2)

    println("Las palabras más frecuentes son:")
    top2.foreach{case (palabra, apariciones) => println(s"$palabra, que aparece $apariciones veces.")}

    //Frases que contienen Scala
    val numFrasesScala = frases
        .filter(frase => (frase.contains("scala") || frase.contains("Scala")))
        .size
    println(s"El número de frases que contienen \"scala\" es: $numFrasesScala.")

    //Agrupar por primera letra
    val mapaPrimeraLetra = palabras.groupBy(_(0).toUpper).mapValues(_.distinct)

    println("Según la primera letra, las palabras que aparecen son:")
    mapaPrimeraLetra.foreach{case (caracter, lista) => 
        println(s"Con el carácter $caracter empiezan las palabras ${lista.mkString(", ")}")
        }

}