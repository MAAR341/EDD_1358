
package com.mycompany.array;

import java.util.ArrayList;

public class ColasADT<T> {

    private ArrayList cola;
    private int tam;
    private T elemento;

    public ColasADT() {
        this.cola = new ArrayList();
        this.tam = 0;
    }

    public boolean is_empty() {
        return this.tam == 0;
    }

    public int length() {
        return tam;
    }

    public void enqueue(T elem) {
        this.elemento = elem;
        cola.add(elemento);
        tam = this.tam + 1;
    }

    public void dequeue() {
        if (!is_empty()) {
            cola.remove(0);
            tam = this.tam - 1;
        }
    }

    @Override
    public String toString() {
        return "" + cola;
    }

}
