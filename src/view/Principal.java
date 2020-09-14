package view;

import controller.ThreadSapo;
import controller.Processos;
public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		double[][] s = new double[5][2];
		for (int i = 0; i < 5; i++) {
			ThreadSapo tMatriz = new ThreadSapo(2,30);
			tMatriz.start();
			tMatriz.join();
			s[i][0] = tMatriz.getTempo();
			s[i][1] = tMatriz.getId();
			
		}
		
		s = Processos.classificaV(s);
		for (int i = 0; i < 5; i++ ){
			
			System.out.println("O sapo " + Double.toString(s[i][1]).substring(1,3)  + " foi o " + (i+1) + "º com o tempo de " + (s[i][0]));
		}
		
	}

}
