@main def ejer7(): Unit = {

    val productos = List(
        Producto("Laptop Lenovo ThinkPad", "Electrónica", 1200.99, 15),
        Producto("iPhone 15", "Electrónica", 999.99, 0),
        Producto("Cafetera Philips", "Hogar", 79.90, 50),
        Producto("Zapatillas Nike Air", "Deporte", 129.99, 0),
        Producto("Libro Scala Avanzado", "Libros", 39.95, 100),
        Producto("Monitor LG 27\"", "Electrónica", 249.99, 20),
        Producto("Silla Ergonómica", "Oficina", 189.50, 0),
        Producto("Teclado Mecánico", "Electrónica", 89.99, 40),
        Producto("Mochila Samsonite", "Accesorios", 59.99, 35),
        Producto("Smart TV 55\"", "Electrónica", 699.00, 12),
        Producto("Tablet Samsung Galaxy Tab", "Electrónica", 499.99, 0),
        Producto("Auriculares Bluetooth Sony", "Electrónica", 149.99, 60),
        Producto("Impresora HP LaserJet", "Oficina", 179.99, 8),
        Producto("Escritorio Ajustable", "Oficina", 399.99, 0),
        Producto("Bicicleta de Montaña", "Deporte", 899.99, 5),
        Producto("Reloj Deportivo Garmin", "Deporte", 299.99, 0),
        Producto("Microondas Samsung", "Hogar", 129.90, 18),
        Producto("Batidora Moulinex", "Hogar", 49.99, 0),
        Producto("Router WiFi 6", "Electrónica", 159.99, 22),
        Producto("Cámara Canon EOS", "Electrónica", 849.99, 0)
        )

    val disponibles = productos.filter(_.stock > 0)
    
    //Agrupar por categoría
    val gruposCategorias = productos.groupBy(_.categoria)

    val productosMasCaros = gruposCategorias
        .mapValues(lista => lista.sortBy(-_.precio))
        .mapValues(_(0))

    val precioMedio = gruposCategorias
        .mapValues(_.map(_.precio))
        .mapValues(lista => lista.sum.toDouble/lista.size)

    gruposCategorias.foreach{ case (categoria, _) => 
        println(s"$categoria, Top: ${productosMasCaros(categoria).nombre}" +
        s", Media: ${precioMedio(categoria)}")}
}

case class Producto(nombre: String, categoria: String, precio: Double, stock: Int)