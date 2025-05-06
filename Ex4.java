import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de alunos da sua sala:");
        int alunos = scanner.nextInt();

        double notas = 0;
        int soma = 1;

        while (soma < alunos){
            System.out.println("Digite a nota do aluno " + soma + ":");
            double nota = scanner.nextDouble();
            notas += nota;
            soma++;
        }
        double media = notas / alunos;
        System.out.println("A media da sala e: " + media);

        scanner.close();
    }
}
