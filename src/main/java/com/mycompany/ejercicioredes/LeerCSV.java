package com.mycompany.ejercicioredes;
        
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LeerCSV {
    public void leer(){
        ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("");//ubicacion del archivo
        try{
            BufferedReader leer = Files.newBufferedReader(filePath);
            String linea;
            while((linea = leer.readLine()) !=null){
                String[] datos2 = linea.split(",");
                ArrayList<String> datosMatriz = new ArrayList<String>();
                for(String dato : datos2){
                    datosMatriz.add(dato);
                }
                datos.add(datosMatriz);
                System.out.println(datosMatriz);
                
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        
        System.out.println("\nLos seguidores en Twitter son los siguientes: \n" + datos.get(8));
        System.out.println("Hubo un aumento de 5092 seguidores de Enero a Junio");
        System.out.println("\nLos datos de crecimiento de seguidores en Twitter son los siguientes: \n" + datos.get(9));
        System.out.println("\nLos datos de visualizaciones en Youtube son los siguientes: \n" + datos.get(16));
        
        
        
        
        
    }
   
}
