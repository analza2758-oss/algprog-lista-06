import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int contador = 0;

        char [] letras = new char [10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a letra " + i + ": ");
            letras[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < 10; i++) {
            if (letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
                System.out.print(letras[i] + " ");
                contador++;
            }
        }

        System.out.println("\nQuantidade de consoantes: " + contador);

        sc.close();


    }
}
