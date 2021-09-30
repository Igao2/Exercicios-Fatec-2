import java.util.Scanner;
public class sequenciaprimos {
	public static void main(String[]args) {
		int v;
		int i;
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o valor para definir o começo da sequência: ");
		x = s.nextInt();
		System.out.println("Digite o valor para definir o final da sequência: ");
		v = s.nextInt();
		 	for(i=x;i<=v;i++) {
		 		int contador=0;
		 			for(int d=1;d<=i;d++) {
		 				if(i%d==0) {
		 					contador++;
		 				}
		 			}if(contador==2) {
		 				System.out.println("Esse número é primo: "+i);
		 			}
		 	}
}
}
