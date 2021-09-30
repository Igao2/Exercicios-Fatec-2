import java.util.Scanner;

public class cubo {
		
		public static void main(String[]args) {
			Scanner s = new Scanner(System.in);
			for(int i = 1;i<=10;i++) {
			int x;
			System.out.println("Digite o "+i+"º valor");
			x = s.nextInt();
			int z = x*x*x;
			System.out.println("O cubo de "+x+ " = "+z);
			}
			
		}

	}


