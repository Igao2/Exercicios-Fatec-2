import java.util.Scanner;
public class maioresque50 {
 public static void main(String[]args) {
	 Scanner s = new Scanner(System.in);
	 int contador = 0;
	 for(int i = 1;i<=20;i++) {
		int x;
		System.out.println("Digite o "+i+"� n�mero");
		x = s.nextInt();
		 	if(x>50) {
		 		contador++;
		 	}
 }
	 System.out.println("A quantidade de n�meros maiores que 50 � "+contador);
}
}
