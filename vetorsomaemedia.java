import java.util.Scanner;
public class vetorsomaemedia {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	int soma = 0;
    int valores[] = new int [1000000];
	int média = 0;
	int x;
		for(int i =1;i<=10;i++) {
		System.out.println("Digite o " +i+ "º valor");
		x = s.nextInt();
		valores[x]=x;
		soma+=valores[x];
		média=soma/10;
		
		
	}System.out.println("Soma = "+soma);
	System.out.println(" Média aritmética = "+média);
}
}
