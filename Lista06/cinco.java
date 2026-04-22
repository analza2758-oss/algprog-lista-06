import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int p = 0; int im = 0;

        int [] inteiros = new int[20];
        int [] pares = new int [20];
        int [] impares = new int [20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            inteiros[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (inteiros[i] % 2 == 0) {
                pares[p] = inteiros[i];
                p++;
            } else {
                impares[im] = inteiros[i];
                im++;
            }
        }

        System.out.println("\nNúmeros Inteiros: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(inteiros[i] + " ");
        }

        System.out.println("\nNúmeros Pares: ");
        for (int i = 0; i < p; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nNúmeros Impares: ");
        for (int i = 0; i < im; i++) {
            System.out.print(impares[i] + " ");
        }

        sc.close();
    }
}
