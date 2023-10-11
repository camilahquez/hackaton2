package com.hackaton2;

import com.hackaton2.Contacto;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda () {
        this.contactos = new ArrayList<>(50);
    }

    public boolean anadirContacto(Contacto contacto) {

        if (existeContacto(contacto)){
            return false;

        }else {
            contactos.add(contacto);
            return true;
        }
    }

public void llenarContactos(){
    contactos.add(new Contacto("Juan", "Perez", "123-456-7890"));
    contactos.add(new Contacto("Maria", "Gomez", "987-654-3210"));
    contactos.add(new Contacto("Carlos", "Lopez", "555-123-4567"));
    contactos.add(new Contacto("Laura", "Diaz", "888-888-8888"));
    contactos.add(new Contacto("Pedro", "Martinez", "777-777-7777"));


}

    public boolean existeContacto(Contacto contacto ){

        for (Contacto c: contactos) {
            if (c.equals(contacto)){
                return true;
            }
        }
        return false;


    }
    public void buscarContacto (String nombre, String apellido) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.size() && !encontrado; i++) {
            if (contactos.get(i) != null && contactos.get(i).getNombre().trim().equalsIgnoreCase(nombre.trim()) && contactos.get(i).getApellido().equals(apellido))
            {
                System.out.println("\nContacto encontrado , su telefono es : " + contactos.get(i).getTelefono());
            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println("\nNo se ha encontrado el contacto");
    }
}


    public List<Contacto> listarContactos() {
        return contactos;
    }

    public boolean eliminarContacto(Contacto contacto) {
        if (existeContacto(contacto)) {
            return contactos.remove(contacto);
        }else {
            return false;
        }

    }

    public boolean agendaLlena(){
        if (contactos.size() == 50) {
            return true;
        }else {
            return false;
        }

    }

    public void espacioLibres() {
        int esapacioRestante = 50-contactos.size();
        System.out.println("\nquedan " + esapacioRestante + " espacios");

    }


}
