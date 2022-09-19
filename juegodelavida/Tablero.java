
package com.mycompany.juegodelavida;

public class Tablero {
    private int mat[][] = new int[10][10];
    private int vivo, muerto;

    public Tablero() {
        this.vivo = 1;
        this.muerto = 0;
    }
    
    
    public int getElemento(int ren, int col){
        return mat[ren][col];
    }
    
    public void setElemento(int ren, int col, int valor){
        mat[ren][col] = valor;
    }
    
   
    public int vecinosVivos(int ren, int col){
        int vecinosVivos = 0;
        try {
            if (mat[ren - 1][col - 1] == vivo) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (mat[ren - 1][col] == vivo) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (mat[ren - 1][col + 1] == vivo) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (mat[ren][col - 1] == vivo) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        //if(tablero[i][j] == '1')count++;//la casilla en cuestión
        try {
            if (mat[ren][col + 1] == vivo) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (mat[ren + 1][col - 1] == vivo) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (mat[ren + 1][col] == vivo) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (mat[ren + 1][col + 1] == vivo) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        return vecinosVivos;
    }
    
     private void limpiarTablero() {
        for (int i = 0; i < mat.length - 1; i++) {
            for (int j = 0; j < mat[i].length - 1; j++) {
                mat[i][j] = muerto;
            }
        }
    }
     
    public void imprimir(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                 System.out.print(mat[i][j] + " ");
              }
              System.out.println("");
        }
    }
    public void siguienteGen(){
        int tmp[][] = new int[10][10];
        tmp=mat;
        for(int ren=0; ren<10; ren++){
            for(int col=0; col<10; col++){
                
                if (mat[ren][col]==vivo && (vecinosVivos(ren, col) == 2 || vecinosVivos(ren, col) == 3)) {
                        tmp[ren][col] = vivo;

                } else {
                    if (mat[ren][col]==vivo && (vecinosVivos(ren, col) <= 1)) {
                        tmp[ren][col] = muerto;
                    
                }else{
                    if(mat[ren][col]==vivo && (vecinosVivos(ren, col) >= 4)){
                        tmp[ren][col] = muerto;
                }else{
                    if(mat[ren][col]==muerto && (vecinosVivos(ren, col) == 3)){
                        tmp[ren][col] = vivo;
                        }
                    }
            }
                    
        }
    }
        mat=tmp;
}
}
}