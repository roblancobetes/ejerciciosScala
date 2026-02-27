error id: file:///C:/Users/RodrigoBlanco(AlfaFo/Desktop/ejerciciosScala/ejer8.scala:
file:///C:/Users/RodrigoBlanco(AlfaFo/Desktop/ejerciciosScala/ejer8.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -evento5.
	 -evento5#
	 -evento5().
	 -scala/Predef.evento5.
	 -scala/Predef.evento5#
	 -scala/Predef.evento5().
offset: 444
uri: file:///C:/Users/RodrigoBlanco(AlfaFo/Desktop/ejerciciosScala/ejer8.scala
text:
```scala
@main def ejer8(): Unit = {

    val ahora = System.currentTimeMillis()

    val listaEventos = List(
        Evento("alice", "login", ahora - 3600 * 1000),        // hace 1 hora
        Evento("bob", "logout", ahora - 2 * 3600 * 1000),  // hace 2 horas
        Evento("carol", "comprar", ahora - 30 * 60 * 1000),  // hace 30 minutos
        Evento("dave", "agregar_carrito", ahora - 10 * 60 * 1000), // hace 10 minutos
        evento5@@ = Evento("eve", "eliminar_cuenta", ahora - 5 * 60 * 1000))   // hace 5 minutos


}

case class Evento(usuario: String, accion: String, ts: Long)
```


#### Short summary: 

empty definition using pc, found symbol in pc: 