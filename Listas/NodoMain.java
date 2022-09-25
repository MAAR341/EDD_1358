package Listas;

public class NodoMain {

    public static void main(String[] args) {
       //System.out.println(p.printAll());
       
        System.out.println("Probando impl de Lista Ligada");
        ListaLigadaADT<Integer> lista = new ListaLigadaADT();
        lista.agregarAlFinal(10);
        lista.transversal();
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(40);
        lista.transversal();
        lista.agregarAlInicio(100);
        lista.transversal();
        lista.agregarDespuesDe(42, 3);
        lista.transversal();
        lista.eliminar(2);
        lista.transversal();
        lista.eliminarElPrimero();
        lista.transversal();
        lista.eliminarElFinal();
        lista.transversal();
        System.out.println(lista.buscar(42));
        System.out.println(lista.existe(42));
        lista.actualizar(42, 2);
        lista.transversal();
        
        System.out.println("------------------------------------------------");
        ListaDoble<Integer> lista2 = new ListaDoble();
        lista2.agregarAlFinal(10);
        lista2.transversal();
        lista2.agregarAlFinal(5);
        lista2.agregarAlFinal(40);
        lista2.transversal();
        lista2.agregarAlInicio(100);
        lista2.transversal();
        lista2.agregarDespuesDe(42, 3);
        lista2.transversal();
        lista2.eliminar(2);
        lista2.transversal();
        lista2.eliminarElPrimero();
        lista2.transversal();
        lista2.eliminarElFinal();
        lista2.transversal();
        System.out.println(lista2.buscar(42));
        
        lista2.actualizar(42, 2);
        lista2.transversal();
    }
}