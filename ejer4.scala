@main def ejer4(): Unit = {

    val personas = List(
    Persona("Ana", 25, "Madrid"),
    Persona("Carlos", 32, "Bilbao"),
    Persona("Lucía", 19, "Madrid"),
    Persona("Miguel", 45, "Bilbao"),
    Persona("Elena", 28, "Bilbao"),
    Persona("Javier", 38, "Madrid"),
    Persona("Sara", 22, "Bilbao")
    )

    println("Las personas mayores de 30 años son:")
    personas.filter(_.edad > 30).foreach{ case Persona(nombre, edad, ciudad) => println(s"$nombre, que tiene $edad años y vive en $ciudad." ) }

    val mediaEdades = personas
    .groupBy(_.ciudad)
    .mapValues(lista=> lista.map(_.edad).sum.toDouble/lista.size)
    
    mediaEdades.foreach{ case(ciudad, edadMedia) => println(s"Ciudad: $ciudad, edad media: $edadMedia.")}


}

case class Persona(nombre: String, edad: Int, ciudad: String)
