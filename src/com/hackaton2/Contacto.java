package com.hackaton2;

import java.util.Objects;

public class Contacto {

    //creamos los atributos del contacto
    private String nombre;

    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Contacto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = null;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido() {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return nombre.trim().equalsIgnoreCase(contacto.nombre.trim()) &&
                apellido.trim().equalsIgnoreCase(contacto.getApellido().trim());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {

        return "\nNombre: " + nombre + "\nApellido" + apellido + "\nTelefono: " + telefono + "\n";

    }
}
