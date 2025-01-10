/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirPares(informacion);
        };
    
    public static void imprimirPares(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) { // Recorrer filas
            for (int j = 0; j < arreglo[i].length; j++) { // Recorrer columnas
                if (arreglo[i][j] % 2 == 0) { // Verificar si el valor es par
                    System.out.println("Valor par encontrado: " + arreglo[i][j]);
                }
            }
        }
    }
}


