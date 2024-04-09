import java.util.Scanner;

public class Main3f
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		double aluno1 = 0;
        double aluno2 = 0;
		double numnotas1 = 5;
        double numnotas2 = 5; 
		double totalnotas1 = 0;
        double totalnotas2 = 0;
		
        System.out.println("Digite seu nome:" + aluno1);
        String nome1 = scanner.next();

for (int i =1; i <= numnotas1; i++){    
    
    System.out.println("Digite a nota" + i +  ":" );
    double nota1 = scanner.nextDouble();
    totalnotas1 += nota1;
}

double media1 = totalnotas1 / numnotas1; 



System.out.println("Aluno 1:" + nome1);
System.out.println("Sua média foi:" +media1);

if (media1 >= 7) {
System.out.println("Aprovado");

}else if (media1 < 7 && media1 > 4) {

System.out.println("Reprovado com direito a recuperação");

    
}else {
    System.out.println("Reprovado sem direito a recuperação");
}



System.out.println("Digite seu nome:" + aluno2);
String nome2 = scanner.next();

for (int i =1; i <= numnotas2; i++){    
    
    System.out.println("Digite a nota" + i +  ":" );
    double nota2 = scanner.nextDouble();
    totalnotas2 += nota2;
}

double media2 = totalnotas2 / numnotas2; 

System.out.println("Aluno 2:" + nome2);
System.out.println("Sua média foi:" +media2);

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
