class Libro(val titulo: String, val autor: String, val numPaginas: Int, calificacion: Int) {

    var calificacion: Int = 0
        set(value) {
            if(value in 0..10){
                field = value
            }else{
                throw IllegalArgumentException ( "Requiere estar entre 0 y 10." )
            }
        }


    init {
        require(calificacion in 0..10){"Requiere que esté entre el rango 0-10"}
    }
}