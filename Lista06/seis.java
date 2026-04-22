import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int alunos = 0;
    
        for (int i = 0; i < 10; i++) {
            int soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + j + " do aluno " + i + ": ");
                int notas = sc.nextInt();
                soma += notas;
            }
            double media = soma / 4;

            if (media >= 7) {
                alunos++;
            }
        }

        System.out.println("Alunos co média maior ou igual a 7.0: " + alunos);

        sc.close();
            
        }


    }

