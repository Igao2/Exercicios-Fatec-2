import java.util.Scanner;
public class intervalonumerosparessoma {
	public static void main(String[]args) {
		int x;
		int b;
		int i;
		int soma = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o começo do intervalo: ");
		x = s.nextInt();
		System.out.println("Digite o final do intervalo: ");
		b = s.nextInt();
		for(i = x;i<=b;i++) {
			if(i%2==0) {
			soma+=i;
				System.out.println(i);
				
			}	
		}System.out.println("Soma = " +soma);
	}
}
