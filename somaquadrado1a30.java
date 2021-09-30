import java.util.Scanner;
public class somaquadrado1a30 {
	public static void main(String[]args){
		int bay[];
		int x =5000;
		int soma = 0;
		bay = new int [x];
		int valores[];
		int b = 5000;
		 valores = new int [b];
		for(int i = 1;i<=30;i++)
		{	bay[i]=i;
			System.out.println(+bay[i]);
			int quadrado = bay[i]*bay[i];
			valores[quadrado]=quadrado;
			soma += valores[quadrado];
			
			System.out.println("Quadrado de "+i + " = "+valores[quadrado]);
			System.out.println("Somatório = "+soma);
		}
	}

}
