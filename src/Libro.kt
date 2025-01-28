class Libro(val titulo: String, val autor: String, val numPaginas: Int, clasificacion: Int) {

    var clasificacion: Int = 0
        set(value) {
            if(value in 0..10){
                field = value
            }else{
                throw IllegalArgumentException ( "caca" )
            }
        }


    init {
        require(clasificacion in 0..10){"Requiere que esté entre el rango 0-10"}
    }
}