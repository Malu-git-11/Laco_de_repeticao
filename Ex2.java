import java.util.Scanner;

public class Ex2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 10 para ver a tabuada:");
        int num = scanner.nextInt();

        System.out.println("Tabuada do " + num + ":");

        for (int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
