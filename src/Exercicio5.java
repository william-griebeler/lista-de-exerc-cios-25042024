import java.util.Scanner;

public class Exercicio5 {
    public class FatorialVetor {
    // Função para calcular o fatorial de um número
    static int fatorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 15;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        // Lendo os elementos do vetor A
        System.out.println("Digite os 15 elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = scanner.nextInt();
        }

        // Calculando os fatoriais e preenchendo o vetor B
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = fatorial(vetorA[i]);
        }

        // Apresentando os vetores A e B
        System.out.println("\nVetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nVetor B (fatoriais correspondentes):");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorB[i] + " ");
        }

        scanner.close();
    }
}
}
