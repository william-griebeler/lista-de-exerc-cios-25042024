import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // Escrever um programa que leia duas matrizes (denominadas A e B) do tipo vetor com 20 elementos reais. 
        //Construir uma matriz C, sendo cada elemento da matriz C a subtração de um elemento correspondente da 
        //matriz A com um elemento correspondente da matriz B, 
        //ou seja, a operação de processamento deve estar baseada na operação C[I] ← A[I] – B[I]. Ao final, 
        //apresentar os elementos da matriz C
 
        double[] A = new double[20];
        double[] B = new double[20];
        double[] C = new double[20];

      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < 20; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextDouble();
        }

        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < 20; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 20; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println("Matriz resultante C:");
        for (int i = 0; i < 20; i++) {
            System.out.println("C[" + i + "]: " + C[i]);
        }

        scanner.close();
    }
}
    
    

