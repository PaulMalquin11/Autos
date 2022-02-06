import java.util.Scanner;

public class mensaje {

    public String solicitaDatos(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public void saludar(String nombre) {
        System.out.println("Hola, bienvenido a java "+ nombre);
    }
}
