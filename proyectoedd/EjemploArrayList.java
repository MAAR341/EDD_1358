
package com.mycompany.proyectoedd;

import java.util.ArrayList;
import java.util.Scanner;

public class EjemploArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declaracion de un objeto scanner para leer las respuestas por teclado del usuario.
        String respuesta;
        int indice;
       
        
        String respuestaUsuario;
        boolean play = true; //Variable para la ejecucion del programa
        
        ArrayList lista = new ArrayList(); //Declaración de la lista que se utilizara en el programa.
        ArrayList lista2 = new ArrayList(); //Lista declarada para ejemplificar el metodo clone() y el metodo equals().
        
        System.out.println("------------------------------");
            System.out.println("Escribe 0 para terminar el programa");
            System.out.println("Escribe 1 para agregar un elemento a la lista");
            System.out.println("Escribe 2 para agregar un elemento en una posicion especifica");
            System.out.println("Escribe 3 para eliminar un elemento");
            System.out.println("Escribe 4 para mostrar la lista");
            System.out.println("Escribe 5 para ver el tamaño de la lista");
            System.out.println("Escribe 6 para vaciar la lista");
            System.out.println("Escribe 7 para verificar si la lista esta vacia");
            System.out.println("Escribe 8 para clonar la lista");
            System.out.println("Escribe 9 para obtener el indice de un elemento");
            System.out.println("Escribe 10 para verificar si un elemento esta en la lista");
            System.out.println("Escribe 11 para verificar si las listas son iguales");
            System.out.println("Escribe 12 para obtener el hashCode de la lista");
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
                    
                case "1": //utilizara el metodo add() para agregar un elemento al final de la lista.
                    System.out.println("Ingresa el elemento que quieres agregar: ");
                    respuesta = sc.nextLine();
                    lista.add(respuesta);
                    break;
                    
                case "2": //agregara un elemento en una posicion de la lista mediante el metodo add(index), si el indice solicitado
                          //no esta en la lista, se enviara una excepcion con un menaje de error.
                    if (lista.size() >= 0) {
                        System.out.println("Ingresa el elemento que quieres agregar: ");
                        respuesta = sc.nextLine();
                        System.out.println("Ingresa la posicion en la que deseas agregarlo: ");
                        indice = sc.nextInt();
                        if (indice <= lista.size()) {
                            lista.add(indice, respuesta);
                        } else {
                            System.out.println("Ese indice no esta permitido en la lista, prueba otra vez");
                        }
                    }

                    break;
                    
                case "3": //Eliminara un elemento segun su posición mediante el metodo remove(index), si la lista esta vacia o
                         //si el indice no esta permitido se enviara un mensaje de error.
                    if (lista.size() != 0) {
                        System.out.println("Ingresa la posicion del elemento que quieres eliminar: ");
                        indice = sc.nextInt();
                        if (indice < lista.size()) {
                            lista.remove(indice);
                        } else if (indice >= lista.size()) {
                            System.out.println("Ese indice no esta permitido en la lista, prueba otra vez");
                        }
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;

                case "4": //Devolvera el toString del estado actual de la lista.
                    System.out.println(lista);
                    break;
                    
                case "5": //Regresara el valor del tamaño que tiene la lista mediante el metodo size().
                    System.out.println(lista.size());
                    break;
                    
                case "6": //Utilizara el metodo clear() para vaciar la lista por completo, todos los elementos seran eliminados.
                    lista.clear();
                    break;
                    
                case "7": //Revisara si hay elementos en la lista con el metodo isEmpty(); si los hay, el resultado sera true
                          //y devolvera un mensaje negativo; si no los hay, la lista esta vacia (false) y devolvera un mensaje afirmativo.
                    if (lista.isEmpty()){
                        System.out.println("La lista esta vacia");
                    } else {
                        System.out.println("La lista no esta vacia");
                    }
                    break;
                    
                case "8": //Utilizara el metodo clone() para duplicar la lista existente en una nueva. Todos los elementos y atributos
                          //seran copiados en la nueva lista.
                    lista2 = (ArrayList) lista.clone();
                    System.out.println(lista2);
                    break;
               
                case "9": //Devolvera el ultimo indice que haya recibido un elemento de la lista mediante el metodo lastIndexOf();
                          //si el elemento no esta en la lista, devolvera un (-1)mensaje negativo; si el elemento solo esta una vez en la lista,
                          //devolvera el indice; si hay duplicados, devolvera el indice de la ultima vez que se introdujo el elemento a la lista.
                    System.out.println("Ingresa el elemento que quieres revisar: ");
                    respuesta = sc.nextLine();
                    if (lista.contains(respuesta)){
                        System.out.println("La poición del elemento es: " + lista.lastIndexOf(respuesta));
                    } else{
                        System.out.println("El elemento no se encuentra en la lista");
                    }
                    break;
                    
                case "10": //Verificara si el elemento esta en la lista con contains(); si el elemento se encuentra en la lista,
                           //devolvera un (true) mensaje afirmando la existencia del elemento; si no esta, devolvera un (false) mensaje negativo.
                    System.out.println("Ingresa el elemento que quieres revisar: ");
                    respuesta = sc.nextLine();
                    if (lista.contains(respuesta)){
                        System.out.println("El elemento " + respuesta + " si se encuentra en la lista");
                    } else{
                        System.out.println("El elemento no se encuentra en la lista");
                    }
                    break;
                    
                case "11": //compara los datos en las listas con equals() para ver si son iguales; si todos los elementos son iguales, devuelve un true;
                           //si hay al menos un elemento distinto, se devuelve false.
                    if (lista.equals(lista2)){
                        System.out.println("La lista 1: " + lista + " es igual a la lista 2: " + lista2);
                    } else {
                        System.out.println("Las listas no son iguales");
                    }
                    break;
                    
                case "12": //regresa el valor hash que tiene la lista.
                    System.out.println(lista.hashCode());
                    break;
                    
            }
        }
    }
        
}
        
        
    
        
   
    

