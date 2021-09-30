import java.util.Scanner;
public class multiplos3e5 {
	public static void main(String[]args) {
		int v[]= {2,5,3,15,17,22,23,26,27};
		int i;
		
	
			for(i=1;i<v.length;i++) {
				v[i]=i;
				
			
			for(i=1;i<v.length;i++) {
				if(v[i]%3==0) {
					System.out.println(v[i]+" é múltiplo de 3");
					
				}
				if(v[i]%5==0) {
					System.out.println(v[i]+" é múltiplo de 5");
					
				}
			}
			}
			
			
	}
}
