import java.util.Scanner;

public class Exercicio8 {
    public class InverterVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definindo o tamanho dos vetores
        int tamanho = 20;
        
        // Vetor A
        double[] vetorA = new double[tamanho];
        
        // Vetor B (inicialmente vazio)
        double[] vetorB = new double[tamanho];

        // Lendo os elementos para o vetor A
        System.out.println("Digite os 20 elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = scanner.nextDouble();
        }

        // Preenchendo o vetor B de forma invertida
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[tamanho - 1 - i];
        }

        // Apresentando os elementos dos vetores A e B
        System.out.println("\nVetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nVetor B (invertido):");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorB[i] + " ");
        }

        scanner.close();
    }
}
}
