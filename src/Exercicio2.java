import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
    

    //Elaborar um programa que leia oito elementos inteiros em uma matriz A do tipo vetor.
    //Construir uma matriz B de mesma dimensão com os elementos da matriz A multiplicados por 3.
    //O elemento B[1] deve ser implicado pelo elemento A[1] * 3,
    //lemento B[2] implicado pelo elemento A[2] * 3,
    //e assim por diante, até 8. Apresentar a matriz B

    
        Scanner scanner = new Scanner(System.in);
        int[] matrizA = new int[8]; // Matriz A
        int[] matrizB = new int[8]; // Matriz B

        // Leitura dos elementos da matriz A
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            matrizA[i] = scanner.nextInt();
        }

        // Construção da matriz B multiplicando os elementos de A por 3
        for (int i = 0; i < 8; i++) {
            matrizB[i] = matrizA[i] * 3;
        }

        // Apresentação da matriz B
        System.out.println("\nA matriz B, com os elementos de A multiplicados por 3, é:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + matrizB[i]);
        }
    }
}
