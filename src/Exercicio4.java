import java.util.Scanner;

public class Exercicio4 {
    

    public static void main(String[] args) {

         // Criando os vetores/matriz A e B
        int[] A = new int[15];
        int[] B = new int[15];

        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Lendo os elementos da matriz A
        System.out.println("Digite os 15 elementos da matriz A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // Calculando os quadrados e armazenando em B
        for (int i = 0; i < 15; i++) {
            B[i] = A[i] * A[i];
        }

        // Apresentando os elementos das matrizes A e B
        System.out.println("Matriz A:");
        for (int i = 0; i < 15; i++) {
            System.out.println("A[" + i + "]: " + A[i]);
        }

        System.out.println("\nMatriz B (quadrados de A):");
        for (int i = 0; i < 15; i++) {
            System.out.println("B[" + i + "]: " + B[i]);
        }

        // Fechando o scanner
        scanner.close();
    }
}

