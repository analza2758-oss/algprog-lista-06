import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int media; int soma = 0;

        int [] notas = new int [4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            notas [i] = sc.nextInt();
        }

        System.out.println("Notas: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + i + ": " + notas[i]);
        }

        for (int i = 0; i < 4; i++) {
            soma = soma + notas[i];
        }

        media = soma / 4;

        System.out.print("Média: " + media);
        

        if (media >= 6) {
            System.out.println("\nAPROVADO!!");
        } else if (media > 5 && media < 5.9) {
            System.out.println("\nRECUPERAÇÃO");
        } else {
         System.out.println("\nREPROVADO");   
        }

        sc.close();


    }
}
