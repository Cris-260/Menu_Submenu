
package Misclases;
import java.util.Scanner;


public class Arreglo {
    int v [] = new int [5];
		Scanner sc = new Scanner(System.in);
		public  void cargar(){
		for(int i=0; i<5; i++){
			System.out.println("Digite el numero de la posicion [" + i + "]");
			v[i] = sc.nextInt();
			}
		}
		public  void imprimir(){
		for(int i=0; i<5; i++){
			System.out.print("[" + v[i] + "] ");
			}
		}
		public  void invertir(){
                    int aux, j=9;
			for(int i=0; i<5; i++){
                                aux = v[i];
                                v[i] = v[j];
                                v[j] = aux;
                                j--;
                        }
                }
		public void burbuja(){
		for(int i = 2; i < v.length; i++)
                {
                  for(int j = 0;j < v.length-i;j++)
                  {
                      int auxiliar;
                    if(v[j] > v[j+1])
                    {
                      auxiliar = v[j];
                      v[j] = v[j+1];
                      v[j+1] = auxiliar;
                    }   
                  }
                }
                          }
		public  void secuencial(){
                    int menor, pos,aux;
                    for (int i = 0; i < v.length - 1; i++) {      
                menor = v[i];                                       
                pos = i;                           
                for (int j = i + 1; j < v.length; j++){ 
                      if (v[j] < menor) {         
                          menor = v[j];            
                          pos = j;
                      }
                }
                if (pos != i){                                              
                    aux = v[i];
                    v[i] = v[pos];
                    v[pos] = aux;
                }
          }
		}
}

