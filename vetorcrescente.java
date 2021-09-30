import java.util.Scanner;

public class vetorcrescente
{
public static void main (String args []){
Scanner s = new Scanner (System.in);

     int vetor[] = new int[10];  
     for (int i=0; i<10; i++){  
         System.out.println ("Digite o "+(i+1)+"º valor");  
         vetor [i] = s.nextInt();  
          
     }  
     
     Ordem(vetor);
     
     System.out.println("Numeros Ordenados: ");
     for (int n : vetor){
    	 System.out.println(n);
     }
     
 }  
   
		public static void Ordem(int vetor[]){  
		     int c;
		     int b;
		     int mec;
		     for(c =0; c<10; c++){  
		     for(b =0; b <9; b++){  
		     if(vetor[b]> vetor[b+1]){  
		       mec = vetor[b];  
		        vetor[b] = vetor[b+1];  
		        vetor[b+1] = mec;  
		                 }  
		             }  
		         }              
		}      
	}
		
