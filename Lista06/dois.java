import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números digitados: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
       sc.close();
    
    }
}
