
package com.hackaton2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la agenda: ");
        Agenda agendaTelefonica = new Agenda();
        String opcion;
        String telefono;
        String nombre;
        String apellido;
        String repetir = "si";
        Contacto contacto;
        agendaTelefonica.llenarContactos();

        System.out.println("\n Bienvenid@ a la agenda");

        do {

            System.out.println("1 . Añadir contacto");
            System.out.println("2 . Comprobar si existe un contacto");
            System.out.println("3 . Listar contactos");
            System.out.println("4 . Buscar un contacto");
            System.out.println("5 . Eliminar contacto");
            System.out.println("6 . Comprobar si la agenda esta llena");
            System.out.println("7 . Comprobar espacios libres");
            System.out.println("8 . Salir");
            System.out.print("Digite una opción: ");
            opcion = entrada.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("\nVamos a añadir un nuevo contacto");
                    System.out.print("Digite el nombre: ");
                    nombre = entrada.next();

                    System.out.print("Digite el apellido: ");
                    apellido = entrada.next();

                    System.out.print("Digite el teléfono : ");
                    telefono = entrada.next();

                    contacto = new Contacto(nombre, apellido, telefono);
                    agendaTelefonica.anadirContacto(contacto);
                    break;

                case "2":
                    System.out.print("\nVamos a comprobar si exite un contacto");
                    System.out.print("\nDigite el nombre: ");
                    nombre = entrada.next();

                    System.out.print("\nDigite el apellido: ");
                    apellido = entrada.next();

                    contacto = new Contacto(nombre, apellido);
                    if (agendaTelefonica.existeContacto(contacto)) {
                        System.out.println("\nEl contacto existe");
                    } else {
                        System.out.println("\nEl contacto no existe");
                    }
                    break;

                case "3":
                    System.out.println("\nLista de contactos: ");
                    List<Contacto> contactos = agendaTelefonica.listarContactos();
                    for (int i = 0; i < contactos.size(); i++) {
                        Contacto c = contactos.get(i);
                        System.out.println((i + 1) + ". " + c.getNombre() + " " + c.getApellido() + " - " + c.getTelefono());
                    }
                    break;

                case "4":
                    System.out.print("\nVamos a buscar un contacto");
                    System.out.print("\nDigite el nombre: ");
                    nombre = entrada.next();
                    System.out.print("\nDigite el apellido: ");
                    apellido = entrada.next();

                    agendaTelefonica.buscarContacto(nombre, apellido);
                    break;

                case "5":
                    System.out.print("\nVamos a eliminar un contacto");
                    System.out.print("\n¡Precaución! Después de eliminado, no se puede recuperar");
                    System.out.print("\nDigite el nombre: ");
                    nombre = entrada.next();
                    System.out.print("\nDigite el apellido: ");
                    apellido = entrada.next();
                    contacto = new Contacto(nombre, apellido);
                    //agendaTelefonica.eliminarContacto(contacto);
                    if (agendaTelefonica.eliminarContacto(contacto)) {
                        System.out.println("\nse a eliminado el contacto");
                    } else {
                        System.out.println("\nContacto no existe");
                    }

                    break;

                case "6":
                    if (agendaTelefonica.agendaLlena()) {
                        System.out.println("\nAGENDA LLENA");
                    } else {
                        System.out.println("\nTodavía tienes espacio en la agenda");
                    }
                    break;
                case "7":
                    agendaTelefonica.espacioLibres();
                    break;

                case "8":
                    System.out.println("\n¡Hasta la próxima!");
                    break;

                default:
                    System.out.println("\nOpción inválida");
                    System.out.println("");
                    break;

            }

            System.out.println("\nPresione enter para continuar ...");
            entrada.nextLine();

        } while (!opcion.equals("8"));

    }
}