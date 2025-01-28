//class ConjuntoLibros {
//    val conjuntoLibros = arrayOfNulls<Libro>(4)
//
//    fun anadirLibro(libroNuevo: Libro){
//        for (libro in conjuntoLibros.indices){
//            if(libro !in conjuntoLibros.indices){
//                conjuntoLibros[libro] = libroNuevo
//                println("Libro añadido.")
//            }
//        }
//        println("No hay espacio para añadir.")
//    }
//
//    fun eliminarLibroPorTitulo(titulo: String){
//        for (libro in conjuntoLibros.indices){
//            if (conjuntoLibros[libro]?.titulo == titulo){
//                conjuntoLibros[libro] = null
//                println("$titulo eliminado.")
//            }
//        }
//        println("No se encontró ese titulo.")
//    }
//
//    fun eliminarLibroPorAutor(autor: String){
//        for(libro in conjuntoLibros.indices){
//            if (conjuntoLibros[libro]?.autor == autor){
//                conjuntoLibros[libro] = null
//                println("El libro de $autor ha sido eliminado.")
//            }
//        }
//        println("No se encontró ese autor.")
//    }
//
//    fun mostrarLibroMayorCalificacion(){
//        for (libro in conjuntoLibros.indices){
//            if (conjuntoLibros[libro].clasificacion)
//        }
//    }
//
//    fun mostrarLibroMenorCalificacion(){
//
//    }
//
//    fun mostrarConjunto(){
//
//    }
//}