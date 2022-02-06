import java.util.Scanner;

public class mensaje {

    public String solicitaDatos(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public void saludar(Persona p) {
        System.out.printf("Hola, bienvenido a java "+ p);
    }
}
