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

    val conteo2 = palabras.groupMapReduce(identity)(_ => 1)(_ + _)
}