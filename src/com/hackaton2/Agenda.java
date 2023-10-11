package com.hackaton2;

import com.hackaton2.Contacto;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Contacto> contactos = new ArrayList<>(50);

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

    public boolean existeContacto(Contacto contacto ){

        for (Contacto c: contactos) {
            if (c.equals(contacto)){
                return true;
            }
        }
        return false;


    }
    public int buscarContacto(String nombre) {
        for (int i = 0; i < contactos.size() ; i++) {
            if (nombre.equals(contactos.get(i))){
                return contactos.get(i).getTelefono();
            }
        }
        return 0;
    }

    public List<Contacto> listarContactos() {
        return contactos;
    }

    public boolean eliminarContacto(Contacto contacto) {
        if (existeContacto(contacto)) {
            contactos.remove(contacto);
            return true;
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

    public int espacioLibres() {

        return 50-contactos.size();
    }


}
