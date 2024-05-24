import java.util.Scanner;

public class Utilidades {
    static Scanner scanner = new Scanner(System.in);

    //Método para leer entero Sim 1
    public static int leerEntero(String dato){
        while (true) {
            
            try{
                System.out.println("Dar " + dato);
                String datoLeido = scanner.nextLine();
                int numeroLeido = Integer.parseInt(datoLeido); // Convierte un dato de String a int. Si viene un dato string no pasa nada,pero si viene la altura, ahí es donde hay que convertirlo.
                return numeroLeido;
            }
            catch (Exception e){
                System.out.println("Valor erróneo");
            
            }
        }
    }


    // Método para leer double Sim 1
    public static double leerDouble(String dato){
        while (true) {
            
            try{
                System.out.println("Dar " + dato);
                String datoLeido = scanner.nextLine();
                double numeroLeido = Double.parseDouble(datoLeido); // Convierte un dato de Double a int. Si viene un dato string no pasa nada,pero si viene la altura, ahí es donde hay que convertirlo.
                return numeroLeido;
            }
            catch (Exception e){
                System.out.println("Valor erróneo");
            
            }
        }
    }
}