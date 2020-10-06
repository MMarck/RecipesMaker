
fun main(args: Array<String>) {

    val makeRecipe = {println(
        """
                [ [ Hacer receta ] ]
Selecciona por categoría el ingrediente que buscas
    1. Agua
    2. Leche
    3. Carne
    4. Verduras
    5. Frutas
    6. Cereal
    7. Huevos
    8. Aceites"""
    )
    }

    val viewRecipe = {numeroCategoria : String ->
        println("\t")
        when (numeroCategoria){
            "1" -> { println ( "\n\tCategoria : AGUA") }
            "2" -> { println ( "Categoria : LECHE") }
            "3" -> { println ( "Categoria : CARNE") }
            "4" -> { println ( "Categoria : VERDURAS") }
            "5" -> { println ( "Categoria : FRUTAS") }
            "6" -> { println ( "Categoria : CEREAL") }
            "7" -> { println ( "Categoria : HUEVOS") }
            "8" -> { println ( "Categoria : ACEITES") }
            "9" -> println("\n[ [ [ GRACIAS POR VISITAR ] ] ]")
            else ->  println("\t!! ingrese una opcion valida !!")
        }

    }


    val solicitarRespuesta = {
        print("ingrese su respuesta: ")
        readLine()
    }


    do {
        println("""
        :: Bienvenido a Recipe Maker ::
Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir"""
        )

        var response: String?
        response = solicitarRespuesta()

        when (response){
            "1" -> { makeRecipe()
                     response = solicitarRespuesta()
                     viewRecipe(response.toString())
            }
            "2" -> { println("usted ha selecionado : $response") }
            "3" -> println("\n[ [ [ GRACIAS POR VISITAR ] ] ]")
            else ->  println("\t!! ingrese una opcion valida !!")
        }


    } while (!response.equals("3") )

}