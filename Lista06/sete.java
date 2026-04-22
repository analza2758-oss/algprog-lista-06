import java.util.Scanner;

public class sete {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int soma = 0; int multiplicao = 1;
    
        int [] numeros = new int [5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            numeros[i] = sc.nextInt();
            soma = soma + numeros[i];
            multiplicao = multiplicao * numeros[i];
        }

        System.out.print("Soma: " + soma);
        System.out.print("\nMultiplicação: " + multiplicao);
        System.out.println("\nNúmeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();

    }
}
