import java.util.Scanner;

public class Ex3Desafio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        System.out.println("Tabela de quadrados de 1 até " + num + ":");

        for (int i = 1; i <= num; i++) {
            int quadrado = i * i;
            System.out.println(i + "² = " + quadrado);
        }
        scanner.close();
    }
}
