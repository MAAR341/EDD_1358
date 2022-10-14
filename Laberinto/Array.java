package com.mycompany.array;

import java.io.File;
import java.io.IOException;

public class Array {

    public static void main(String[] args) throws IOException {
        
     
           File path = new File("csv.csv"); //colocar ubicacion del csv, el orden es: numero de renglones; numero de columnas; matriz del laberinto; entrada; salida.
           Laberinto l = new Laberinto(path);
           System.out.println(l);
           
          
           
    }
    
     
     
     
}
