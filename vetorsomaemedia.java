import java.util.Scanner;
public class vetorsomaemedia {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	int soma = 0;
    int valores[] = new int [1000000];
	int m�dia = 0;
	int x;
		for(int i =1;i<=10;i++) {
		System.out.println("Digite o " +i+ "� valor");
		x = s.nextInt();
		valores[x]=x;
		soma+=valores[x];
		m�dia=soma/10;
		
		
	}System.out.println("Soma = "+soma);
	System.out.println(" M�dia aritm�tica = "+m�dia);
}
}
