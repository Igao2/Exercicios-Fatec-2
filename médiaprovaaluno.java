import java.util.Scanner;
public class m�diaprovaaluno {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int notas[] = new int[40000];
		int x = 0;
		int soma = 0;
		int m�dia =0;
		for(int i= 1;i<5;i++) {
			notas[x]=x;
			System.out.println("Digite o valor da "+i+"� nota");
			notas[x] = s.nextInt();
			soma+=notas[x];
			m�dia=soma/4;
		
		}
		if(m�dia<3) {
			System.out.println("A m�dia do aluno foi: "+m�dia);
			System.out.println("Aluno reprovado ;-;");
		}
		if((m�dia>=3)&&(m�dia<7)) {
			System.out.println("A m�dia do aluno foi: "+m�dia);
			System.out.println("Exame, seja la o que o Feixas quis dizer com isso??");
		}
		if((m�dia>=7)) {
			System.out.println("A m�dia do aluno foi: "+m�dia);
			System.out.println("Aluno aprovado =D ");
		}
	}

}
