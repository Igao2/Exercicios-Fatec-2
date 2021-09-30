import java.util.Scanner;
public class médiaprovaaluno {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int notas[] = new int[40000];
		int x = 0;
		int soma = 0;
		int média =0;
		for(int i= 1;i<5;i++) {
			notas[x]=x;
			System.out.println("Digite o valor da "+i+"ª nota");
			notas[x] = s.nextInt();
			soma+=notas[x];
			média=soma/4;
		
		}
		if(média<3) {
			System.out.println("A média do aluno foi: "+média);
			System.out.println("Aluno reprovado ;-;");
		}
		if((média>=3)&&(média<7)) {
			System.out.println("A média do aluno foi: "+média);
			System.out.println("Exame, seja la o que o Feixas quis dizer com isso??");
		}
		if((média>=7)) {
			System.out.println("A média do aluno foi: "+média);
			System.out.println("Aluno aprovado =D ");
		}
	}

}
