// Ordenación usando .sort
// import java.util.Collections;
// import java.util.Comparator;

public void listarEntrenadores(){
    ArrayList<Entrenador> entrenadores = new ArrayList<>();

    for (Equipo equipo : equipos){
        entrenadores.add(equipo.getEntrenador());
    }

    Collections.sort(entrenadores, Comparator.comparingInt(entrenador -> entrenador.getAnioLicencia()));

    for (Entrenador entrenador : entrenadores){
        entrenador.escribirDatos();
    }
}


// Método burbuja

// Método comparación