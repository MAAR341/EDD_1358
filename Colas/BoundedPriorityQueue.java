
package com.mycompany.array;

import java.util.ArrayList;

public class BoundedPriorityQueue<T> {

    private int nPrioridad, tam;
    private ArregloADT nivelPrioridad;
    private ColasADT aux, aux2;

    public BoundedPriorityQueue(int niveles) {
        this.nPrioridad = niveles;
        nivelPrioridad = new ArregloADT(nPrioridad);
        for (int i = 0; i < niveles; i++) {
            nivelPrioridad.setElemento(i, new ColasADT());
        }
    }

    public boolean is_empty() {
        return this.tam == 0;
    }

    public int length() {

        return tam;
    }

    public void enqueue(int prioridad, T elem) {
        if (prioridad >= 0 && prioridad < nPrioridad) {
            aux = (ColasADT) nivelPrioridad.getElemento(prioridad);
            aux.enqueue(elem);
            nivelPrioridad.setElemento(prioridad, aux);
            this.tam++;
        } else {
            System.out.println("Esa prioridad no existe");
        }
    }

    public void dequeue() {
        int prioridad = 0;
        aux = (ColasADT) nivelPrioridad.getElemento(prioridad);
        if (!aux.is_empty()) {
            aux.dequeue();
            nivelPrioridad.setElemento(prioridad, aux);
            this.tam--;

        } else {
            while (aux.is_empty() && prioridad < nPrioridad) {

                prioridad++;
                if (prioridad < nPrioridad) {
                    aux = (ColasADT) nivelPrioridad.getElemento(prioridad);

                }
            }
            aux.dequeue();
            nivelPrioridad.setElemento(prioridad, aux);
            this.tam--;
        }
        if (tam < 0) {
            this.tam = 0;
        }
    }

    @Override
    public String toString() {
        String estado = "";
        for (int i = 0; i < nPrioridad; i++) {
            aux = (ColasADT) nivelPrioridad.getElemento(i);
                estado += "\n"+ aux.toString();
            
        }
 
        return estado;
    }

}
