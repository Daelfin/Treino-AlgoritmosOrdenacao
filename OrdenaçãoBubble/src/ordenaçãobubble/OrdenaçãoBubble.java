/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaçãobubble;

/**
 *
 * @author Fábio
 */
import java.util.Scanner;

public class OrdenaçãoBubble {

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
        
        valores = bubbleSort(valores);
        
        System.out.println("\n\nValores Ordenados:");
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
    
    static int[] bubbleSort (int[] vetor){
        int auxiliar;
        boolean houveTroca = true;
        
        while (houveTroca){
            houveTroca = false;
            for (int i = 0; i < vetor.length - 1; i++){
                if (vetor[i] > vetor [i + 1]){
                    auxiliar = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = auxiliar;
                    houveTroca = true;
                }
            }
        }
        
        return vetor;
    }
    
}
