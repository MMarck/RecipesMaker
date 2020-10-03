
fun main(args: Array<String>) {

    do {
        println(
            """:: Bienvenido a Recipe Maker ::\n
                Selecciona la opción deseada
                1. Hacer una receta
                2. Ver mis recetas
                3. Salir\n"""
        )

        print("ingrese su respuesta: ")
        val response: String? = readLine()

        when (response){
            "1" -> { println("usted ha selecionado : $response") }
            "2" -> { println("usted ha selecionado : $response") }
            "3" -> println("GRACIAS POR VISITAR")
            else ->  println("\t!! ingrese una opcion valida !!")
        }


    } while (!response.equals("3") )

}