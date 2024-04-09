import java.util.Scanner;

public class Main1f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double soma = 0;
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            double num = scanner.nextDouble();
            soma += num;
        }
        
        double media = soma / 8;
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}