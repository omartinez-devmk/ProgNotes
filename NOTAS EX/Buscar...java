//Método Buscar equipo, etc

private Equipo buscarEquipo (String nombre){
    Equipo equipoEncontrado = null; // Me genero una variable y la inicializao a null
    int contador = 0;


    //Alternativa con for:
    for (Equipo it : equipos){
        if (it.getNombre().equals(nombre)){
            equipoEncontrado = it;
            break;
        }
    }
    return equipoEncontrado;



    while (equipoEncontrado == null && contador < equipos.size()){ // Se podría hacer un 'for' desde el primer equipo hasta el último 
        if (equipos.get(contador).getNombre().equals(nombre)){     // lo que pasa que con while, el bucle se para en cuanto encuentre al equipo
            equipoEncontrado = equipos.get(contador); // ¿cómo se que lo he encontrado? Cuando equipoEncontrado es distinto de null.
        }
        contador++;
    }
    return equipoEncontrado;

}


public void altaEquipo(){
    System.out.println("****************************");
    System.out.println("******* Alta Equipo ********");
    System.out.println("****************************");
    System.out.println("Nombre equipo");
    String nombre = scanner.nextLine();
    System.out.println("Ciudad equipo");
    String ciudad = scanner.nextLine();


    Equipo equipoEncontrado = buscarEquipo(nombre);