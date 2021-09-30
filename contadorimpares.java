import java.util.Scanner;
public class contadorimpares {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int contador = 0;
		for(int i = 1;i<=30;i++) {
			
			int número;
			System.out.println("Digite o " +i+ "º Número");
			número = s.nextInt();
				if(número%2!=0) {
				contador++;
				}
		}
				if(contador == 0) {
					System.out.println("Não há números ímpares");
				}
		
		System.out.println("Foram digitados "+contador+" números ímpares ");
		
	}

}
