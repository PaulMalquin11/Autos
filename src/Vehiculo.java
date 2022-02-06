
public class Vehiculo {
    private String marca, modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String MostrarDatos(){
        return "Marca: " + marca + "\nModelo :"+ modelo + "\nPrecio : $" + precio+ "\n";
    }


}
