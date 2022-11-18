
package com.mycompany.array;

import java.util.ArrayList;

public class HashTableADT<T, K> {
    
    private ArregloADT Table;
    private ArrayList llaves, datos;
    private int tSize, indice;
    private ListaLigadaADT<T> aux;
    private T valor, llave;
    
    public HashTableADT(int table_size) { //debe ser un primo minimo de 7
        this.tSize = table_size;
        Table = new ArregloADT(this.tSize);
        llaves = new ArrayList();
        datos = new ArrayList();
        if (esPrimo(this.tSize)) {
            for (int i = 0; i < this.tSize; i++) {
                Table.setElemento(i, new ListaLigadaADT<T>());
            }
        } else {
            System.out.println("Ese no es un valor primo");
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero >= 7) {

            for (int x = 2; x < numero / 2; x++) {
                if (numero % x == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    
  public int funcionHash(String key){
        int index = 0;
        if (!isInteger(key)) {
            for (int i = 0; i < key.length(); i++) {
                index += (int) key.charAt(i);
            }
            
        } else {
            index = Integer.parseInt(key);
        }
        indice = index % tSize;
        return indice;
    }

    public static boolean isInteger(String dato) {
        if(dato.isEmpty()) return false;           //Check if the string is empty
        for(int i = 0; i < dato.length(); i++) {
            if(Character.digit(dato.charAt(i), 10) < 0) return false;
        }
        return true;
    }
    
    public void Add(String key, T value) {
        indice = funcionHash(key);
        aux = (ListaLigadaADT<T>) Table.getElemento(indice);
        aux.agregarAlFinal(value);
        this.llaves.add(key);
        this.datos.add(value);
        Table.setElemento(indice, (T) aux);

    }

    public T valueOf(String key){
        indice = funcionHash(key);
        llave = (T) key;
        T dato = null;
        int index = 0;
        aux = (ListaLigadaADT<T>) Table.getElemento(indice);
        if (llaves.contains(key)) {
            if (aux.getTamanio() > 1) {
                
                index = llaves.indexOf(key);
                index = aux.buscar((T) datos.get(index))-1;
                
            }
            dato = aux.getDato(index);
            
        } else {
            System.out.println("Esa llave no tiene acceso a ningun dato");
        }
        return dato;
    }
    
    public void Remove(String key){
        indice = funcionHash(key);
        llave = (T) key;
        T dato = valueOf(key);
        aux = (ListaLigadaADT<T>) Table.getElemento(indice);
        if (aux.getTamanio() > 1) {
            aux.eliminar(aux.buscar(valueOf(key)) - 1);
        } else {
            aux.eliminarElPrimero();
        }
        llaves.remove(key);
        datos.remove(dato);
    }

    @Override
    public String toString() {
        return "" + Table.toString();
        
    }
    
    
}
