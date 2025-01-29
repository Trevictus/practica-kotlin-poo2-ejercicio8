fun main(){
    val libro1 = Libro("1000 agujas", "Blade", 1000, 7)
    val libro2 = Libro("Contri más", "Agustino", 300, 10)

    val conjuntoLibros = ConjuntoLibros()

    conjuntoLibros.anadirLibro(libro1)
    conjuntoLibros.anadirLibro(libro2)

    conjuntoLibros.mostrarConjunto()

    conjuntoLibros.eliminarLibroPorAutor("Blade")
    conjuntoLibros.eliminarLibroPorTitulo("Contri más")

    conjuntoLibros.mostrarConjunto()

    conjuntoLibros.anadirLibro(libro1)

    conjuntoLibros.mostrarConjunto()
}