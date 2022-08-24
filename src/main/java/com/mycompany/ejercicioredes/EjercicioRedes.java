package com.mycompany.ejercicioredes;

import java.util.Scanner;

public class EjercicioRedes {
    
    public static void main(String[] args) {
           LeerCSV leerCSV = new LeerCSV();
           leerCSV.leer();
           Scanner teclado = new Scanner(System.in);
           String mes1 = ""; 
           String mes2 = ""; 
           int a = 0;
           int b = 0;
        System.out.println("\nCalcular valor de la diferencia de visualizaciones");    
        System.out.println("Ingrese un Mes: ");
        mes1 = teclado.nextLine();
        if(null != mes1)switch (mes1) {
            case "ENERO":
                a = 12226;
                break;
            case "FEBRERO":
                a = 15605;
                break;
            case "MARZO":
                a = 19602;
                break;
            case "ABRIL":
                a = 19452;
                break;
            case "MAYO":
                a = 21805;
                break;
            case "JUNIO":
                a = 17304;
                break;
            default:
                break;
        }
        System.out.println("\nIngrese otro Mes: ");
        mes2 = teclado.nextLine();
        if(null!=mes2)switch (mes2) {
            case "ENERO":
                b = 12226;
                break;
            case "FEBRERO":
                b = 15605;
                break;
            case "MARZO":
                b = 19602;
                break;
            case "ABRIL":
                b = 19452;
                break;
            case "MAYO":
                b = 21805;
                break;
            case "JUNIO":
                b = 17304;
                break;
            default:
                break;
        }
        if(a!=b){
            int diferencia = b-a;
            System.out.println("\nLa diferencia de visualizaciones entre " + mes1 + " y " + mes2 + " es de: " + diferencia);
        }else{
            System.out.println("No hay variación");
        }
        
           
        System.out.println("Ingresa el valor final de seguidores: ");
        int i = teclado.nextInt();
        
            System.out.println("Ingresa el valor inicial de seguidores: ");
            int j = teclado.nextInt();
            
                float resta = i-j;
                float promedio = (resta/j);
                System.out.println("El Promedio de crecimiento de followers en Twitter es de: " + promedio*100);
           
    }
}