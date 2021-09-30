import java.util.Scanner;
public class altura20pessoas {
	public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	int x = 20;
	int i;
	double menor = 0;
	double valores[];
	valores = new double [x];
	for(i=0;i<20;i++) {
		System.out.println("Digite a "+(i+1)+"ª altura");
		valores[i]= s.nextDouble();
		menor=valores[i];
	}
		for(i=0;i<20;i++) {
		
			if(valores[i]<menor) {
				menor=valores[i];
			}
		} System.out.println(+menor);
	
	}

}

