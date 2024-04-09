import java.util.Scanner;

public class Main3d {
    
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);

    int numnotas1 = 5;
    int numNotas2 = 5;
    double aluno1 = 0;
    double aluno2 = 0;
    double totalNotas1 = 0;
    double totalnotas2 = 0;
    int contador1 = 0;
    int contador2 = 0;
    
    System.out.println("Digite seu nome:" + aluno1);
    String nome1 = scanner.next();

    while (contador1 < numnotas1) {
        contador1++;

        System.out.println("Digite a nota " + contador1 + ":");
        double nota1 = scanner.nextDouble();
        totalNotas1 += nota1;
    }

    double media1 = totalNotas1 / numnotas1;

    System.out.println("Aluno 1:" + nome1);
    System.out.println("A sua média das notas é: " + media1);


    if (media1 >= 7) {
        System.out.println("Aprovado");
        
        }else if (media1 < 7 && media1 > 4) {
        System.out.println("Reprovado com direito a recuperação");
                    
        }else {
            System.out.println("Reprovado sem direito a recuperação");
        }








        System.out.println("Digite seu nome:" + aluno2);
        String nome2 = scanner.next();

        while (contador2 < numNotas2) {
            contador2++;
    
            System.out.println("Digite a nota " + contador2 + ":");
            double nota2 = scanner.nextDouble();
            totalnotas2 += nota2;
        }
    
        double media2 = totalnotas2 / numNotas2;


        System.out.println("Aluno 2:" + nome2);
        System.out.println("A sua média das notas é: " + media2);
    

        if (media2 >= 7) {
            System.out.println("Aprovado");
            
            }else if (media2 < 7 && media2 > 4) {
            
            System.out.println("Reprovado com direito a recuperação");
            
                
            }else {
                System.out.println("Reprovado sem direito a recuperação");
            }
    

    scanner.close();
}
}
