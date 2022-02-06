import java.util.Scanner;

public class Main {
    public static  int idAutoBarato(Vehiculo auto[]){
        float precio;
        int id=0;
        precio = auto[0].getPrecio();
        for (int i = 0; i<auto.length; i++){
            if(auto[i].getPrecio() < precio){
                precio = auto[i].getPrecio();
                id=1;
            }
        }
        return id;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        Float precio;
        int num_vehiculos, idbarato;
        System.out.println("Ingrese la cantidad de autos");
        num_vehiculos = entrada.nextInt();

        mensaje obj = new mensaje();
        String nombre = obj.solicitaDatos("Escribe tu name");
        obj.saludar(nombre);

        Vehiculo autos[] = new Vehiculo[num_vehiculos];
        for (int i = 0; i< autos.length; i++ ){
            entrada.nextLine();
            System.out.println("Ingrese las caracteristicas de los autos" + (i+1) + " :");
            System.out.println("Ingrese la marca del auto");
            marca = entrada.nextLine();
            System.out.println("Ingrese el modelo del auto");
            modelo = entrada.nextLine();
            System.out.println("Ingrese el precio del auto");
            precio = entrada.nextFloat();
            autos[i] = new Vehiculo(marca,modelo,precio);
        }
        idbarato = idAutoBarato(autos);
    System.out.println("El auto mas barato es :" + autos[idbarato].MostrarDatos());
    }
}
