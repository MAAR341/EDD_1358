
package com.mycompany.array;

import java.util.ArrayList;

public class Arreglo2D_ADT<T> {
    private int numRenglones, numColumnas;
    private ArregloADT mat, aux;

    public Arreglo2D_ADT() {
        this.numRenglones = 0;
        this.numColumnas = 0;
        this.mat = new ArregloADT();
        for(int i=0; i<numRenglones ; i++){
            mat.setElemento(i, new ArregloADT());
        }
    }
   
   public Arreglo2D_ADT(int ren,int col){
        this.numRenglones = ren;
        this.numColumnas = col;
        this.mat = new ArregloADT(ren);
        for(int i=0; i<numRenglones ; i++){
            mat.setElemento(i, new ArregloADT(col));
        }
   }
   
        
    public void limpiar(T dato) {
        for (int i = 0; i < this.numRenglones; i++) {
            for (int j = 0; j < this.numColumnas; j++) {
                aux = new ArregloADT(this.numRenglones);
                int posicion = 0;
                while(posicion < this.numColumnas){
                    aux.setElemento(posicion, dato);
                    posicion += 1;
                }
                    mat.setElemento(i, aux);
            }
        }

    }
   
   public boolean comprobacion(int indice){
       return indice >=0 && indice < this.numRenglones;
   }

   public void setElemento(int ren,int col,T dato){
       if (comprobacion(ren)){
            aux =  (ArregloADT) mat.getElemento(ren);
            aux.setElemento(col, dato);          
            mat.setElemento(ren,(T) aux); 
       }
       
            
    }
   public T getElemento(int ren, int col){
       if (comprobacion(ren)){
        aux = (ArregloADT)mat.getElemento(ren);
        return (T) aux.getElemento(col); 
       }      
        return null;
    } 
   
   public int getRenglones(){
        return this.numRenglones;
    }
    public int getColumnas(){
        return this.numColumnas;
    }

     @Override
    public String toString(){
        return String.format("%s", mat);
    } 


}
      

  