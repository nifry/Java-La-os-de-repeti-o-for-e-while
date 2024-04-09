import java.util.Scanner;

public class Main1d  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double soma = 0;
        int contador = 0;
        while (contador < 8) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            double num = scanner.nextDouble();
            soma += num;
            contador++;
        }
        
        double media = soma / 8;
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}
