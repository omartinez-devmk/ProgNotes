private Jugador buscarJugador(int dorsal){
    Jugador jugadorEncontrado = null;
    int contador = 0;
    while (jugadorEncontrado == null && contador < plantilla.size()){
        if (plantilla.get(contador).getDorsal() == dorsal){
            jugadorEncontrado = plantilla.get(contador);
        }
        contador++;
    }
    return jugadorEncontrado;
}