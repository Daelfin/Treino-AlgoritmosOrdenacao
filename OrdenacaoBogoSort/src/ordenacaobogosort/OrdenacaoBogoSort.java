/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacaobogosort;

/**
 *
 * @author Fábio
 */

import java.util.Random;
import java.util.Scanner;

public class OrdenacaoBogoSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = new int[10];
        Scanner sc = new Scanner(System.in);
                
        for (int i = 0; i < valores.length; i++){
            System.out.print("Informe um número: ");
            valores[i] = Integer.parseInt(sc.nextLine());
        }
        
        valores = bogoSort(valores);
        
        System.out.println("\nValores Ordenados:");
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
    
    public static boolean estaOrdenado(int[] vetor){
        for(int i = 0; i < vetor.length - 1; i++){
            if (vetor[i] > vetor[i+1]){
                return false;
            }               
        }
        
        return true;
    }
    
    public static int[] bogoSort(int[] vetor){
        Random random = new Random();
        int tamanho = vetor.length;
        int iteracoes = 0;
        
        int[] novoVetor;
        
        do{
            int[] randomicos = new int[tamanho];        
        
            randomicos[0] = random.nextInt(tamanho) + 1;
            int contador = 1;
            boolean repetido = false;
            while (contador < tamanho){
                int r = random.nextInt(tamanho) + 1;
            
                for (int i = 0; i < tamanho; i++){
                    if(randomicos[i] == r){
                    repetido = true;
                    }
                }
            
                if (repetido == false){
                    randomicos[contador] = r;
                    contador++;
                }
                else{
                    repetido = false;
                }            
            }
        
            novoVetor = new int[tamanho];
        
            for (int i = 0; i < tamanho; i++){
                novoVetor[i] = vetor[randomicos[i] - 1];
            }
            
            vetor = novoVetor;
            iteracoes++;
        }while(estaOrdenado(vetor) == false);
        
        System.out.println("\nNº de Iterações: " + iteracoes);
        return vetor;
    }
}
