import java.util.Scanner;
public class gerar3vetor {
	 
	private int v[]= {1,2,3,4,5,6,7,8,9,10};
	private int b[]= {11,12,13,14,15,16,17,18,19,20};
	private int n[]=new int[v.length+b.length];
	private int i;
	private int d=0;
		public void lervalores() {
			System.out.println("Valores do primeiro vetor: ");
			for (i=0;i<v.length;i++) {
				System.out.println(v[i]);
			}
			System.out.println("---------------------------");
			System.out.println("---------------------------");
			
			System.out.println("Valores do segundo vetor: ");
			for (i=0;i<b.length;i++) {
				System.out.println(b[i]);
			}
			System.out.println("---------------------------");
			System.out.println("---------------------------");
			}
		public void obter3vetor() {
	for (i=0;i<v.length;i++) {
		n[d]=v[i];
		d++;
	}
	for (i=0;i<b.length;i++) {
		n[d]=b[i];
		d++;
}
		}
		public void imprimir3vetor() {
			System.out.println("Valores do terceiro vetor: ");
	for(i=0;i<n.length;i++) {
		System.out.println(n[i]);
	}

}
	public static void main(String[]args) {
		gerar3vetor obj = new gerar3vetor();
		obj.lervalores();
		obj.obter3vetor();
		obj.imprimir3vetor();
}
}