error id: file:///C:/Users/RodrigoBlanco(AlfaFo/Desktop/ejerciciosScala/ejer8.scala:local6
file:///C:/Users/RodrigoBlanco(AlfaFo/Desktop/ejerciciosScala/ejer8.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -palabra.
	 -palabra#
	 -palabra().
	 -scala/Predef.palabra.
	 -scala/Predef.palabra#
	 -scala/Predef.palabra().
offset: 2149
uri: file:///C:/Users/RodrigoBlanco(AlfaFo/Desktop/ejerciciosScala/ejer8.scala
text:
```scala
import java.time.{Instant, ZoneId, ZonedDateTime}
import java.time.DayOfWeek

@main def ejer8(): Unit = {

    val ahora = System.currentTimeMillis()

    val listaEventos = List(
        Evento("alice", "login", ahora - 3600 * 1000),              // hace 1h
        Evento("alice", "comprar", ahora - 50 * 60 * 1000),         // hace 50min
        Evento("alice", "logout", ahora - 30 * 60 * 1000),          // hace 30min
        Evento("bob", "login", ahora - 3 * 3600 * 1000),            // hace 3h
        Evento("bob", "agregar_carrito", ahora - 2 * 3600 * 1000),  // hace 2h
        Evento("bob", "comprar", ahora - 90 * 60 * 1000),           // hace 1h30min
        Evento("carol", "login", ahora - 4 * 3600 * 1000),          // hace 4h
        Evento("carol", "agregar_carrito", ahora - 3 * 3600 * 1000),// hace 3h
        Evento("carol", "comprar", ahora - 2 * 3600 * 1000),        // hace 2h
        Evento("dave", "login", ahora - 5 * 3600 * 1000),           // hace 5h
        Evento("dave", "agregar_carrito", ahora - 4 * 3600 * 1000), // hace 4h
        Evento("dave", "agregar_carrito", ahora - 3 * 3600 * 1000), // hace 3h
        Evento("eve", "login", ahora - 6 * 3600 * 1000),            // hace 6h
        Evento("eve", "eliminar_cuenta", ahora - 5 * 3600 * 1000),  // hace 5h
        Evento("eve", "logout", ahora - 4 * 3600 * 1000),           // hace 4h
        Evento("frank", "login", ahora - 2 * 3600 * 1000),          // hace 2h
        Evento("frank", "comprar", ahora - 90 * 60 * 1000),         // hace 1h30min
        Evento("frank", "comprar", ahora - 60 * 60 * 1000)          // hace 1h
    )

    val accionesPorUsuario = listaEventos
      .groupBy(_.usuario)
      .mapValues(_.size)

    //Usuarios con una sola acción
    val usuariosUnicos = accionesPorUsuario
      .filter(_._2 == 1)
      .keys
      .toList

    val top2Acciones = listaEventos
      .groupBy(_.accion)
      .mapValues(_.size)
      .toSeq
      .sortBy(-_._2)
      .take(2)

    println("Las acciones más frecuentes son:")
    top2Acciones.foreach{case (accion, apariciones) => println(s"$pal@@abra, que aparece $apariciones veces.")}

}


def momentoDelDia(timestampMillis: Long, zoneId: ZoneId = ZoneId.systemDefault()): String = {
  val hora = Instant
    .ofEpochMilli(timestampMillis)
    .atZone(zoneId)
    .getHour

  if (hora < 12) "mañana"
  else "tarde"
  
}

case class Evento(usuario: String, accion: String, ts: Long)
```


#### Short summary: 

empty definition using pc, found symbol in pc: 