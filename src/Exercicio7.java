import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Vetores de nomes
        String[] vetorA = new String[20];
        String[] vetorB = new String[30];
        String[] vetorC = new String[50];

        // Lendo os nomes para o vetor A
        System.out.println("Digite os nomes para o vetor A (20 elementos):");
        for (int i = 0; i < 20; i++) {
            vetorA[i] = scanner.nextLine();
        }

        // Lendo os nomes para o vetor B
        System.out.println("Digite os nomes para o vetor B (30 elementos):");
        for (int i = 0; i < 30; i++) {
            vetorB[i] = scanner.nextLine();
        }

        // Preenchendo o vetor C com os elementos de A e B
        int idxC = 0;
        for (int i = 0; i < 20; i++) {
            vetorC[idxC] = vetorA[i];
            idxC++;
        }
        for (int i = 0; i < 30; i++) {
            vetorC[idxC] = vetorB[i];
            idxC++;
        }

        // Apresentando o vetor C
        System.out.println("\nVetor C (junção dos vetores A e B):");
        for (int i = 0; i < 50; i++) {
            System.out.println(vetorC[i]);
        }

        scanner.close();
    }
}

