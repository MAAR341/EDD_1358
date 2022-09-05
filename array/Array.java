package com.mycompany.array;

import java.io.IOException;

public class Array {

    public static void main(String[] args) throws IOException {
        
        //ArregloADT ejemploLista = new ArregloADT(5);
        //System.out.println("El arreglo tiene " + ejemploLista.getLongitud() + " elementos");
        //ejemploLista.setElemento(0,"a");
        //ejemploLista.setElemento(1, 3);
        //ejemploLista.setElemento(2,"b");
        //ejemploLista.setElemento(3, 4);
        //ejemploLista.setElemento(4,"c");
        //System.out.println("El elemento en esa posicion es: " + ejemploLista.getElemento(3));
        //System.out.println(ejemploLista.getElemento(2));
        //System.out.println(ejemploLista.limpiar(7));
        
        NominaADT nominaADT = new NominaADT();
           nominaADT.leer();
           nominaADT.listarSueldos();
           nominaADT.mayorAntiguedad();
           nominaADT.menorAntiguedad();
    }
}
