package com.mycompany.array;

import java.util.ArrayList;

public class Colas {

    public static void main(String[] args) {
        
        ColasADT cola = new ColasADT();
        System.out.println(cola.is_empty());
        System.out.println(cola.length());
        cola.enqueue(2);
        cola.enqueue(5);
        cola.enqueue(7);
        System.out.println(cola);
        System.out.println(cola.is_empty());
        System.out.println(cola.length());
        cola.dequeue();
        System.out.println(cola);
        System.out.println(cola.is_empty());
        System.out.println(cola.length());
       
        
        BoundedPriorityQueue ca = new BoundedPriorityQueue(7);
        ca.enqueue(4, "Maestre");
        ca.enqueue(2, "Niños");
        ca.enqueue(4, "Mecanico");
        ca.enqueue(3, "Mujeres");
        ca.enqueue(2, "3ra Edad");
        ca.enqueue(1, "Niñas");
        ca.enqueue(3, "Hombres");
        ca.enqueue(4, "Vigia");
        ca.enqueue(5, "Capitan");
        ca.enqueue(4, "Timonel");
        System.out.println(ca);
        System.out.println(ca.length());
        System.out.println(ca.is_empty());
    }
    
}
