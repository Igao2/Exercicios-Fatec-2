import java.util.Scanner;
public class contadorimpares {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int contador = 0;
		for(int i = 1;i<=30;i++) {
			
			int n�mero;
			System.out.println("Digite o " +i+ "� N�mero");
			n�mero = s.nextInt();
				if(n�mero%2!=0) {
				contador++;
				}
		}
				if(contador == 0) {
					System.out.println("N�o h� n�meros �mpares");
				}
		
		System.out.println("Foram digitados "+contador+" n�meros �mpares ");
		
	}

}
