import java.util.Scanner;

public class Exercicio1 {

    // Elaborar um programa que efetue a leitura de dez nomes de pessoas
    // em uma matriz A do tipo vetor e apresentá-los em seguida;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10]; 

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        
        System.out.println("\nOs nomes digitados são:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}

}

