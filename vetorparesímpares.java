import java.util.Scanner;
public class vetorpares�mpares {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int contadori = 0;
	    int x = 0;
		int valores[] = new int [20];
		int contadorp = 0;
		
			for(int i =1;i<=20;i++) {
			System.out.println("Digite o " +i+ "� valor");
			x = s.nextInt();
			valores[x] = x;
			
			System.out.println(valores[x]);
			if(valores[x]%2==0) {
				contadorp++;
				System.out.println(valores[x]+" � par");
			}
			
			if(valores[x]%2!=0) {
				contadori++;
				System.out.println(valores[x]+" � �mpar");
				
			}
			
		} 
			System.out.println(" O n�mero de pares � "+contadorp);
			System.out.println(" O n�mero de �mpares � "+contadori);
	}

}
