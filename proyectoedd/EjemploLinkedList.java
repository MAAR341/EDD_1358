
package com.mycompany.proyectoedd;

import java.util.LinkedList;
import java.util.Scanner;

public class EjemploLinkedList {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int indice, tam = 0;
       
        
        String respuestaUsuario;
        boolean play = true;
        
        LinkedList listaLigada = new LinkedList(); //Inicializacion de la listaLigada
        LinkedList listaLigada2 = new LinkedList(); 
        
        System.out.println("------------------------------");
            System.out.println("Escribe 0 para terminar el programa");
            System.out.println("Escribe 1 para agregar un elemento en una posicion especifica"); //add()
            System.out.println("Escribe 2 para agregar un elemento al inicio de la lista"); //addFirst
            System.out.println("Escribe 3 para agregar un elemento al final de la lista"); //addLast
            System.out.println("Escribe 4 para eliminar un elemento en una posicion especifica"); //remove()
            System.out.println("Escribe 5 para eliminar un elemento al inicio de la lista"); //removeFirst
            System.out.println("Escribe 6 para eliminar un elemento al final de la lista"); //removeLast
            System.out.println("Escribe 7 para mostrar la lista"); //toString()
            System.out.println("Escribe 8 para ver un elemento de la lista"); //get()
            System.out.println("Escribe 9 para ver el primer elemento de la lista"); //getFirst()/peekFisrt()
            System.out.println("Escribe 10 para ver el ultimo elemento de la lista"); //getLast()/peekLast()
            System.out.println("Escribe 11 para mostrar el head de la lista"); //element()/peek()
            System.out.println("Escribe 12 para ver el tamaño de la lista"); //size()
            System.out.println("Escribe 13 para vaciar la lista"); //clear()
            System.out.println("Escribe 14 para verificar si la lista esta vacia"); //isEmpty()
            System.out.println("Escribe 15 para clonar la lista"); //clone()
            System.out.println("Escribe 16 para obtener el indice de un elemento"); //lastIndexOf()
            System.out.println("Escribe 17 para verificar si un elemento esta en la lista"); //contains()
            System.out.println("Escribe 18 para mostrar el hashCode de la lista"); //hashCode()
            System.out.println("------------------------------");
            
        while(play){ //El programa se correra indefinidamente hasta terminarlo con una de las opciones.
                     //Las opciones seran escogidas por teclado.
            
            System.out.println("\nElige la opcion que quieres usar \n");
            respuestaUsuario = sc.nextLine();
            System.out.println("el usuario eligio la opcion: " + respuestaUsuario);
            
            
            switch(respuestaUsuario){
                case "0": //El programa dejara de ejecutarse si se elije esta opcion.
                    System.out.println("Fin del programa");
                    play = false;
                    break;
                 
                    
                case "1": //agregara un elemento en una posicion de la lista mediante el metodo add(index), si el indice solicitado
                          //no esta en la lista, se enviara una excepcion con un menaje de error.
                    if (listaLigada.size() >= 0) {
                        System.out.println("Ingresa el elemento que quieres agregar: ");
                        respuesta = sc.nextLine();
                        System.out.println("Ingresa la posicion en la que deseas agregarlo: ");
                        indice = sc.nextInt();
                        if (indice <= listaLigada.size()) {
                            listaLigada.add(indice, respuesta);
                        } else {
                            System.out.println("Ese indice no esta permitido en la lista, prueba otra vez");
                        }
                    }

                    break;
                   
                case "2": //utilizara el metodo addFirst() para agregar un elemento al inicio de la lista.
                    System.out.println("Ingresa el elemento que quieres agregar: ");
                    respuesta = sc.nextLine();
                    listaLigada.addFirst(respuesta);
                    break;
                
                case "3": //utilizara el metodo add() para agregar un elemento al final de la lista.
                    System.out.println("Ingresa el elemento que quieres agregar: ");
                    respuesta = sc.nextLine();
                    listaLigada.addLast(respuesta);
                    break;
                    
                case "4": //Eliminara un elemento segun su posición mediante el metodo remove(index), si la lista esta vacia o
                         //si el indice no esta permitido se enviara un mensaje de error.
                    if (listaLigada.size() != 0) {
                        System.out.println("Ingresa la posicion del elemento que quieres eliminar: ");
                        indice = sc.nextInt();
                        if (indice < listaLigada.size()) {
                            listaLigada.remove(indice);
                        } else if (indice >= listaLigada.size()) {
                            System.out.println("Ese indice no esta permitido en la lista, prueba otra vez");
                        }
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;
                    
                case "5": //utilizara el metodo removeFirst() para eliminar un elemento al inicio de la lista.
                    if (listaLigada.size() >= 0) {
                        listaLigada.removeFirst();
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;
                    
                case "6": //utilizara el metodo removeLast() para eliminar un elemento al final de la lista.
                    if (listaLigada.size() >= 0) {
                        listaLigada.removeLast();
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;

                case "7": //Devolvera el toString del estado actual de la lista.
                    System.out.println(listaLigada);
                    break;
                    
                case "8": //Devolvera un elemento de la lista a traves de su indice con el metodo get().
                    if (listaLigada.size() >= 0) {
                        System.out.println("Ingresa la posicion del elemento que quieres ver: ");
                        indice = sc.nextInt();
                        if (indice < listaLigada.size()) {
                            System.out.println(listaLigada.get(indice));
                        } else if (indice >= listaLigada.size()) {
                            System.out.println("Ese indice no esta permitido en la lista, prueba otra vez");
                        }
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;    
                    
                case "9": //Devolvera el primer elemento de la lista a traves del metodo getFirst().
                    if (listaLigada.size() > 0) {
                        System.out.println("El primer elemento de la lista es: " + listaLigada.getFirst());
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;
                    
                case "10": //Devolvera el ultimo elemento de la lista a traves del metodo getLast().
                    if (listaLigada.size() > 0) {
                        System.out.println("El ultimo elemento de la lista es: " + listaLigada.getLast());
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;
                    
                case "11": //Devolvera el head de la lista a traves del metodo element().
                    if (listaLigada.size() > 0) {
                        System.out.println("El head de la lista es: " + listaLigada.element());
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;
                    
                case "12": //Regresara el valor del tamaño que tiene la lista mediante el metodo size().
                    System.out.println(listaLigada.size());
                    break;
                    
                case "13": //Utilizara el metodo clear() para vaciar la lista por completo, todos los elementos seran eliminados.
                    listaLigada.clear();
                    break;
                    
                case "14": //Revisara si hay elementos en la lista con el metodo isEmpty(); si los hay, el resultado sera true
                          //y devolvera un mensaje negativo; si no los hay, la lista esta vacia (false) y devolvera un mensaje afirmativo.
                    if (listaLigada.isEmpty()){
                        System.out.println("La lista esta vacia");
                    } else {
                        System.out.println("La lista no esta vacia");
                    }
                    break;
                    
                case "15": //Utilizara el metodo clone() para duplicar la lista existente en una nueva. Todos los elementos y atributos
                          //seran copiados en la nueva lista.
                    listaLigada2 =  (LinkedList) listaLigada.clone();
                    System.out.println(listaLigada2);
                    break;
               
                case "16": //Devolvera el ultimo indice que haya recibido un elemento de la lista mediante el metodo lastIndexOf();
                          //si el elemento no esta en la lista, devolvera un (-1)mensaje negativo; si el elemento solo esta una vez en la lista,
                          //devolvera el indice; si hay duplicados, devolvera el indice de la ultima vez que se introdujo el elemento a la lista.
                    System.out.println("Ingresa el elemento que quieres revisar: ");
                    respuesta = sc.nextLine();
                    if (listaLigada.contains(respuesta)){
                        System.out.println("La poición del elemento es: " + listaLigada.lastIndexOf(respuesta));
                    } else{
                        System.out.println("El elemento no se encuentra en la lista");
                    }
                    break;
                    
                case "17": //Verificara si el elemento esta en la lista con contains(); si el elemento se encuentra en la lista,
                           //devolvera un (true) mensaje afirmando la existencia del elemento; si no esta, devolvera un (false) mensaje negativo.
                    System.out.println("Ingresa el elemento que quieres revisar: ");
                    respuesta = sc.nextLine();
                    if (listaLigada.contains(respuesta)){
                        System.out.println("El elemento " + respuesta + " si se encuentra en la lista");
                    } else{
                        System.out.println("El elemento no se encuentra en la lista");
                    }
                    break;
                    
                case "18": //regresa el valor hash que tiene la lista.
                    System.out.println(listaLigada.hashCode());
                    break;
            }
        }
    }
        
}
