
package com.mycompany.juegodelavida;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuestaUsuario = "";
        int numGeneraciones = 0;
        boolean run = true;
        Tablero xd = new Tablero();
        //matriz inicial
        xd.setElemento(5,3,1);
        xd.setElemento(4,4,1);
        xd.setElemento(6,3,1);
        xd.setElemento(2,4,1);
        xd.setElemento(1,6,1);
        xd.setElemento(6,4,1);
        xd.setElemento(6,5,1);
        xd.setElemento(5,4,1);
        xd.setElemento(5,5,1);
        xd.imprimir();
        System.out.println("");
        
        System.out.println("Ingresa el numero de generaciones que quieres ver: ");
        respuestaUsuario = sc.nextLine();
        System.out.println("El numero de generaciones ingresado es " + respuestaUsuario);
        
        switch(respuestaUsuario){
                case "0":
                    run = false;
                    break;
                    
                case "1":
                    numGeneraciones = 1;
                    break;
                
                case "2":
                    numGeneraciones = 2;
                    break;
                
                
                case "3":
                    numGeneraciones = 3;
                    break;
                
                    
                case "4":
                    numGeneraciones = 4;
                    break;
                
                    
                case "5":
                    numGeneraciones = 5;
                    break;
                
                    
                case "6":
                   numGeneraciones = 6;
                   break;
                
                   
                case "7":
                  numGeneraciones = 7;
                  break;
                  
                case "8":
                  numGeneraciones = 8;
                  break;
                    
                case "9":
                  numGeneraciones = 9;
                  break;  
                  
                case "10":
                  numGeneraciones = 10;
                  break;
                  
                  
            }
        for (int i = 0; i < numGeneraciones; i++) {
            xd.siguienteGen();
            xd.imprimir();
            System.out.println("---------------------"+ "Siguiente generación" +"--------------------------");
        }
        
        
    }
    
}
