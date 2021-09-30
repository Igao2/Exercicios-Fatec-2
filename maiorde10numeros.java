import java.util.Scanner;
public class maiorde10numeros {
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		int x=10;
		int i;
		int valores[];
		valores=new int [x];
		int maior = 0;
		for(i=0; i<x; i++)
		{
			System.out.println("Digite o " +( i+1) +"º valor : ");
			valores[i] = s.nextInt();
			maior = valores[i];
			
		}
		for(i =0;i<x;i++){
		 
			if (valores[i] > maior) {
			maior = valores[i];
	} 
		 }
		System.out.println(" o maior número é: "+maior);
}   
}
