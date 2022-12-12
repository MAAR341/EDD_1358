
package com.mycompany.proyectoedd;

import java.util.Scanner;
import java.util.Stack;

public class EjemploStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int indice, tam = 0;
       
        
        String respuestaUsuario;
        boolean play = true;
        
        Stack pila = new Stack(); //Inicializacion de la pila
        
        System.out.println("------------------------------");
            System.out.println("Escribe 0 para terminar el programa");
            System.out.println("Escribe 1 para agregar un elemento a la pila"); //push()
            System.out.println("Escribe 2 para eliminar un elemento de la pila"); //pop()
            System.out.println("Escribe 3 para ver un elemento de la pila"); //peek()
            System.out.println("Escribe 4 para mostrar la pila"); //toString()
            System.out.println("Escribe 5 para ver el tamaño de la pila"); //size()
            System.out.println("Escribe 6 para vaciar la pila"); //clear()
            System.out.println("Escribe 7 para verificar si la pila esta vacia"); //empty()
            System.out.println("Escribe 8 para buscar el indice de un elemento en la pila"); //clone()
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
                 
                case "1": //agregara un elemento al final de la pila con el metodo push().
                    System.out.println("Ingresa el elemento que quieres agregar: ");
                    respuesta = sc.nextLine();
                    pila.push(respuesta);

                    break;
                   
                case "2": //utilizara el metodo pop() para eliminar un elemento al final de la pila y mostrarlo.
                    if (pila.size() > 0){
                        pila.pop();
                    } else {
                        System.out.println("No hay elementos en la pila");
                    }
                    break;
                
                case "3": //utilizara el metodo peek() para mostrar el final de la pila.
                    if (pila.size() > 0){
                        System.out.println("El ultimo elemento de la lista es: " + pila.peek());
                    } else {
                        System.out.println("No hay elementos en la pila");
                    }
                    break;
                    
                case "4": //Devolvera el toString del estado actual de la pila.
                    System.out.println(pila);
                    break;
                    
                case "5": //Regresara el valor del tamaño que tiene la pila mediante el metodo size().
                    System.out.println(pila.size());
                    break;
                    
                case "6": //Utilizara el metodo clear() para vaciar la lista por completo, todos los elementos seran eliminados.
                    pila.clear();
                    break;
                    
                case "7": //Revisara si hay elementos en la pila con el metodo empty(); si los hay, el resultado sera true
                          //y devolvera un mensaje negativo; si no los hay, la lista esta vacia (false) y devolvera un mensaje afirmativo.
                    if (pila.empty()){
                        System.out.println("La pila esta vacia");
                    } else {
                        System.out.println("La pila no esta vacia");
                    }
                    break;
                   
                case "8": //buscara el indice que tiene un elemento mediante el metodo search().
                    System.out.println("Ingresa el elemento que quieres revisar: ");
                    respuesta = sc.nextLine();
                    if (pila.contains(respuesta)){
                        System.out.println("El elemento " + respuesta + " se encuentra en la posicion: " + pila.search(respuesta));
                    } else{
                        System.out.println("El elemento no se encuentra en la lista");
                    }
                    break;
                    
            }
        }
    }
}
