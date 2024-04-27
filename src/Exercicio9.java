import java.util.Scanner;

public class Exercicio9 {
   public class JuncaoTresVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definindo o tamanho dos vetores
        int tamanho = 5;
        
        // Vetores A, B e C
        double[] vetorA = new double[tamanho];
        double[] vetorB = new double[tamanho];
        double[] vetorC = new double[tamanho];
        
        // Vetor D (com o triplo de elementos)
        double[] vetorD = new double[tamanho * 3];

        // Lendo os elementos para o vetor A
        System.out.println("Digite os 5 elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = scanner.nextDouble();
        }

        // Lendo os elementos para o vetor B
        System.out.println("Digite os 5 elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = scanner.nextDouble();
        }
        
        // Lendo os elementos para o vetor C
        System.out.println("Digite os 5 elementos do vetor C:");
        for (int i = 0; i < tamanho; i++) {
            vetorC[i] = scanner.nextDouble();
        }

        // Preenchendo o vetor D com os elementos de A, B e C
        int idxD = 0;
        for (int i = 0; i < tamanho; i++) {
            vetorD[idxD] = vetorA[i];
            idxD++;
        }
        for (int i = 0; i < tamanho; i++) {
            vetorD[idxD] = vetorB[i];
            idxD++;
        }
        for (int i = 0; i < tamanho; i++) {
            vetorD[idxD] = vetorC[i];
            idxD++;
        }

        // Apresentando os elementos do vetor D
        System.out.println("\nVetor D (junção dos vetores A, B e C):");
        for (int i = 0; i < vetorD.length; i++) {
            System.out.print(vetorD[i] + " ");
        }

        scanner.close();
    }
} 
}
