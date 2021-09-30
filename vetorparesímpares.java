import java.util.Scanner;
public class vetorparesímpares {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int contadori = 0;
	    int x = 0;
		int valores[] = new int [20];
		int contadorp = 0;
		
			for(int i =1;i<=20;i++) {
			System.out.println("Digite o " +i+ "º valor");
			x = s.nextInt();
			valores[x] = x;
			
			System.out.println(valores[x]);
			if(valores[x]%2==0) {
				contadorp++;
				System.out.println(valores[x]+" é par");
			}
			
			if(valores[x]%2!=0) {
				contadori++;
				System.out.println(valores[x]+" é ímpar");
				
			}
			
		} 
			System.out.println(" O número de pares é "+contadorp);
			System.out.println(" O número de ímpares é "+contadori);
	}

}
