package com.mycompany.array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Laberinto<T> {

    ArrayList<ArrayList<String>> Informacion = new ArrayList();
    Arreglo2D_ADT<String> matriz, matriz2;
    ArregloADT<Integer> aux;
    int tam = 0;
    int Ren, Col, eRen, eCol, sRen, sCol;
    String[] lineas;
    String[] tamlis;
    private PilaADT solucion;

    public Laberinto(File path) {
        leerCSV(path);
        System.out.println(resolver());
    }

    public Arreglo2D_ADT<String> leerCSV(File path) {
        try {

            BufferedReader lector = new BufferedReader(new FileReader(path));
            String linea;

            while ((linea = lector.readLine()) != null) {
                lineas = linea.split(","); //separa las lineas por comas
                tamlis = linea.split("\n"); //salto de linea
                tam += tamlis.length; //almacena el numero de lineas
                ArrayList<String> datosLinea = new ArrayList();
                for (String datos : lineas) {
                    datosLinea.add(datos);
                }
                Informacion.add(datosLinea); //almacena toda la información del csv en un arraylist de arraylist
            }
            //System.out.println(OutterArray);
            Ren = Integer.parseInt(Informacion.get(0).get(0)); //datos de renglones para crear la matriz del laberinto
            Col = Integer.parseInt(Informacion.get(1).get(0)); //datos de columna para crear la matriz del laberinto
            matriz = new Arreglo2D_ADT(Ren, Col); //creacion del laberinto

            int numRen = 0;
            while (numRen < Ren) {
                int numCol = 0;
                int mRen = numRen + 2;
                while (numCol < Col) {
                    matriz.setElemento(numRen, numCol, Informacion.get(mRen).get(numCol));
                    numCol += 1;
                }
                numRen += 1;
            }
            int a = 0;
            while (a < Ren) {
                int b = 0;
                int c = a + 2;
                while (b < Col) {
                    if ("0".equals(Informacion.get(c).get(b))) {
                        matriz.setElemento(a, b, " "); //los 0 se convertiran al nuevo caracter para visualizar facilmente el camino
                    } else if ("1".equals(Informacion.get(c).get(b))) {
                        matriz.setElemento(a, b, "#"); //los 1 se convertiran al nuevo caracter para visualizar facilmente las paredes del laberinto
                    }
                    b += 1;
                }
                a += 1;
            }
            int entrada = tam - 2;
            int salida = tam - 1;
            this.eRen = Integer.parseInt(Informacion.get(entrada).get(0).replaceAll("\"", "")); //coordenadas en x de la entrada
            this.eCol = Integer.parseInt(Informacion.get(entrada).get(1).replaceAll("\"", "")); //coordenadas en y de la entrada
            this.sRen = Integer.parseInt(Informacion.get(salida).get(0).replaceAll("\"", "")); //coordenadas en x de la salida
            this.sCol = Integer.parseInt(Informacion.get(salida).get(1).replaceAll("\"", "")); //coordenadas en y de la salida
            matriz.setElemento(eRen, eCol, "E"); //asignacion de un valor que indique la entrada en el laberinto
            matriz.setElemento(sRen, sCol, "S"); //asignacion de un valor que indique la salida en el laberinto
        } catch (IOException ex) {
        }
        return matriz;
    }

    public PilaADT resolver() {
        int x = this.eRen;
        int y = this.eCol;
        String visitado = "-";
        int paso = 0;
        int Error = 0;
        int Real = 0;
        solucion = new PilaADT();
        aux = new ArregloADT<>(2);
        aux.setElemento(0, this.eRen);
        aux.setElemento(1, this.eCol);
        solucion.Push(aux);
        
        while (matriz.getElemento(x, y) != "S") {

            ArregloADT<Integer> aux2 = new ArregloADT<>(2);
            aux2 = (ArregloADT<Integer>) solucion.Peek();
            x = aux2.getElemento(0);
            y = aux2.getElemento(1);
            if (matriz.getElemento(x, y) == "S") {

            } else if (comprobacion(x, y - 1) && (" ".equals(matriz.getElemento(x, y - 1)) || "S".equals(matriz.getElemento(x, y - 1)))) {//izquierda
                if (" ".equals(matriz.getElemento(x, y - 1))) { //si no es la salida
                    ArregloADT<Integer> tmp = new ArregloADT<>(2);
                    tmp.setElemento(0, x);
                    tmp.setElemento(1, y - 1);
                    solucion.Push(tmp);
                    matriz.setElemento(x, y - 1, visitado);
                    tmp = null;
                    paso++;

                } else { //si es la salida entonces
                    ArregloADT<Integer> aux3 = new ArregloADT<>(2);
                    aux3.setElemento(0, x);
                    aux3.setElemento(1, y - 1);
                    solucion.Push(aux3);
                    aux3 = null;
                    
                } 
//no puede avanzar a la izquierda
            } else if (comprobacion(x - 1, y) && (" ".equals(matriz.getElemento(x - 1, y)) || "S".equals(matriz.getElemento(x - 1, y)))) { //arriba
                if (" ".equals(matriz.getElemento(x - 1, y))) { //si no es la salida
                    ArregloADT<Integer> tmp = new ArregloADT<>(2);
                    tmp.setElemento(0, x - 1);
                    tmp.setElemento(1, y);
                    solucion.Push(tmp);
                    matriz.setElemento(x - 1, y, visitado);
                    tmp = null;
                    paso++;

                } else { //si es la salida entonces
                    ArregloADT<Integer> tmp = new ArregloADT<>(2);
                    tmp.setElemento(0, x - 1);
                    tmp.setElemento(1, y);
                    solucion.Push(tmp);
                    tmp = null;
                    
                }
//no puede avanzar hacia arriba
            } else if (comprobacion(x, y + 1) && (" ".equals(matriz.getElemento(x, y + 1)) || "S".equals(matriz.getElemento(x, y + 1)))) {  //derecha
                if (" ".equals(matriz.getElemento(x, y + 1))) { //si no es la salida
                    ArregloADT<Integer> tmp = new ArregloADT<>(2);
                    tmp.setElemento(0, x);
                    tmp.setElemento(1, y + 1);
                    solucion.Push(tmp);
                    matriz.setElemento(x, y + 1, visitado);
                    tmp = null;
                    paso++;

                } else { //si es la salida entonces
                    ArregloADT<Integer> tmp = new ArregloADT<>(2);
                    tmp.setElemento(0, x);
                    tmp.setElemento(1, y + 1);
                    solucion.Push(tmp);
                    tmp = null;
                    
                }
//no puede avanzar a la derecha
            } else if (comprobacion(x + 1, y) && (" ".equals(matriz.getElemento(x + 1, y)) || "S".equals(matriz.getElemento(x + 1, y)))) { //abajo
                if (" ".equals(matriz.getElemento(x + 1, y))) { //si no es la salida
                    ArregloADT<Integer> tmp = new ArregloADT<>(2);
                    tmp.setElemento(0, x + 1);
                    tmp.setElemento(1, y);
                    solucion.Push(tmp);
                    matriz.setElemento(x + 1, y, visitado);
                    tmp = null;
                    paso++;

                } else { //si es la salida entonces
                    ArregloADT<Integer> tmp = new ArregloADT<>(2);
                    tmp.setElemento(0, x + 1);
                    tmp.setElemento(1, y);
                    solucion.Push(tmp);
                    tmp = null;
                    
                }
            } else { //no puede ir hacia abajo, no hay camino y debe eliminar el paso anterior
                matriz.setElemento(x, y, "+");
                solucion.Pop();
                Error--;
            }
            System.out.println("Paso numero " + paso);
            System.out.println(matriz);
        }
        Real = paso + Error;
        System.out.println("El numero total de pasos fue: " + paso);
        System.out.println("Los pasos para resolver el laberinto sin errores es: " + Real);
        return solucion;

    }

    public boolean comprobacion(int x, int y) {
        return (x >= 0 && x <= Ren) && (y >= 0 && y <= Col);
    }

    @Override
    public String toString() {
        return matriz.toString();
    }
}
