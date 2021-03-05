/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacaoquick;

/**
 *
 * @author Fábio
 */
import java.util.Scanner;

public class OrdenacaoQuick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = new int[10];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < valores.length; i++){
            System.out.println("Informe um número: ");
            valores[i] = Integer.parseInt(sc.nextLine());
        }
        
        quickSort(valores, 0, valores.length - 1);
        
        System.out.println("\n\nValores Ordenados");
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
    
    static void quickSort(int[] vetor, int esq, int dir){
        int pivo, aux, i, j, meio;
        
        i = esq;
        j = dir;
        
        meio = (int) ((i + j)/2);
        pivo = vetor[meio];
        
        do{
            while (vetor[i] < pivo){
                i++;
            }
            while (vetor[j] > pivo){
                j--;
            }
            if ( i <= j){
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                i++;
                j--;
            }
        }while (j > i);
        
        if(esq < j)
            quickSort(vetor, esq, j);
        if (i < dir)
            quickSort(vetor, i, dir);
    }
    
}
