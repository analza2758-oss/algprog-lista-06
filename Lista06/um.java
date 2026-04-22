import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
