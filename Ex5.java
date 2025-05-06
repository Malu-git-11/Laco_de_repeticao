import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int n = scanner.nextInt();

        int soma = 1;

        while (soma <= n) {
            System.out.println(soma);
            soma++;
        }
        scanner.close();
    }
}
