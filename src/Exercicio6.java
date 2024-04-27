import java.util.Scanner;

public class Exercicio6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 15;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho * 2];

        // Lendo os elementos do vetor A
        System.out.println("Digite os 15 elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = scanner.nextInt();
        }

        // Lendo os elementos do vetor B
        System.out.println("Digite os 15 elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = scanner.nextInt();
        }

        // Preenchendo o vetor C com os elementos de A e B
        for (int i = 0; i < tamanho; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + tamanho] = vetorB[i];
        }

        // Apresentando o vetor C
        System.out.println("\nVetor C (junção dos vetores A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        scanner.close();
    }
}

