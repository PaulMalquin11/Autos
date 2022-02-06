package com.acme;

public record PersonaRegistro(String nombre, String apellido) {
    @Override
    public String toString() {
        //ABC Comente la linea de cod que se puede eliminar
       // System.out.println("Esta isntruccion es inservible");
        return "%s %s".formatted(nombre, apellido);
    }
}
