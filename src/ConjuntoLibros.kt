class ConjuntoLibros {
    val conjuntoLibros = arrayOfNulls<Libro>(4)

    fun anadirLibro(libroNuevo: Libro){
        for (libro in conjuntoLibros.indices){
            if(conjuntoLibros[libro] == null){
                conjuntoLibros[libro] = libroNuevo
                println("Libro añadido.")
                return
            }
        }
        println("No hay espacio para añadir.")
    }

    fun eliminarLibroPorTitulo(titulo: String){
        for (libro in conjuntoLibros.indices){
            if (conjuntoLibros[libro]?.titulo == titulo){
                conjuntoLibros[libro] = null
                println("$titulo eliminado.")
                return
            }
        }
        println("No se encontró ese titulo.")
    }

    fun eliminarLibroPorAutor(autor: String){
        for(libro in conjuntoLibros.indices){
            if (conjuntoLibros[libro]?.autor == autor){
                conjuntoLibros[libro] = null
                println("El libro de $autor ha sido eliminado.")
            }
        }
        println("No se encontró ese autor.")
    }

    fun mostrarLibroMayorCalificacion(){
        fun mostrarLibroMayorCalificacion(){
            val libroMayor = conjuntoLibros.filterNotNull().maxByOrNull { it.calificacion }
            println("Libro con mayor calificación: ${libroMayor ?: "No existen libros."}")
        }
    }

    fun mostrarLibroMenorCalificacion(){
        val libroMenor = conjuntoLibros.filterNotNull().minByOrNull { it.calificacion }
        println("Libro con menor calificación: ${libroMenor ?: "No existen libros."}")
    }

    fun mostrarConjunto(){
        if (conjuntoLibros.all {it == null}){
            println("No existen libros.")
        }

        for(libro in conjuntoLibros)
            if(libro != null){
                println(libro.titulo)
            }
    }
}