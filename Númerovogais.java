   import java.util.Scanner;
   	public class N�merovogais{
   		public static void main(String[]args) {
   		 char vogal[]= {'a','e','i','o','u','A','E','I','O','U'};
   		 Scanner t = new Scanner(System.in);
   		 String texto;
   		 int contador = 0;
   		 int i;
   		System.out.println("Digite um texto de no m�ximo 15 caracteres: ");
   		texto = t.nextLine();
   		if(texto.length()>15){
   			System.out.println("Texto excedeu o tamanho m�ximo!");
   			System.exit(0);
   		}
   			for( i = 0; i < texto.length() ; i++){
   			for(int j = 0; j <vogal.length; j++){
   			if(texto.charAt(i) == vogal[j]) {
   				contador++;
   				}
   			}
   		}
   			System.out.println("Foram imprimidas " + contador+" vogais");
   }
  }
   