object ejer3 { 

    def main(args: Array[String]): Unit = {

        println(s"El factorial de 5 es ${factorial(5)}")
        println(s"La sucesión de fibonacci en 7 es ${fibonacci(7)}")

        //Represento en qué medida se acerca la sucesión a la razón áurea
        val listaRatios = (2 to 30).map(n => BigDecimal(fibonacci(n))/BigDecimal(fibonacci(n -1)))

        listaRatios.foreach{ case r => println(r)}

        println(s"La suma de los cinco primeros números es ${sumaLista(List(1, 2, 3, 4, 5))}")

    }

    def factorial(n: Int): BigInt = {

        if (n <= 0) 1

        else n * factorial(n - 1)

    }

    def fibonacci(n: Int): BigInt = {

        if (n == 0 || n == 1) n
        else fibonacci(n - 1) + fibonacci(n - 2)
        
    }

    def sumaLista(xs: List[Int]): Int = {

        if (xs.length == 0) 0
        else xs(0) + sumaLista(xs.drop(1))

    }


    
}