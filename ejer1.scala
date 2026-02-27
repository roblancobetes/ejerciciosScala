@main def ejer1(nombre: String, edad: Int): Unit = {


    
    println("Hola " + nombre + (if (edad >= 18)
         " eres mayor de edad" else " eres menor de edad"))


}
