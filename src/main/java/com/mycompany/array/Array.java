package com.mycompany.array;

public class Array {

    public static void main(String[] args) {
        
        ArregloADT ejemploLista = new ArregloADT(5);
        System.out.println("El arreglo tiene " + ejemploLista.getLongitud() + " elementos");
        ejemploLista.setElemento(0,"a");
        ejemploLista.setElemento(1, 3);
        ejemploLista.setElemento(2,"b");
        ejemploLista.setElemento(3, 4);
        ejemploLista.setElemento(4,"c");
        System.out.println("El elemento en esa posicion es: " + ejemploLista.getElemento(3));
        System.out.println(ejemploLista);
        System.out.println(ejemploLista.limpiar("Hola"));
       
    }
}
