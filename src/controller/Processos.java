package controller;

import java.util.concurrent.Callable;

public class Processos {
	public Processos() {
		super();
	}
	
	public static double[][] classificaV(double[][] v) {
        int cont1,cont2;
        double aux,aux2;

        for(cont1=0;cont1<v.length;cont1++) {
            for(cont2=(cont1+1);cont2<v.length;cont2++) {
                if(v[cont1][0] > v[cont2][0] ){
                        aux = v[cont1][0];
                        v[cont1][0] = v[cont2][0];
                        v[cont2][0] = aux;
                        
                        aux2 = v[cont1][1];
                        v[cont1][1] = v[cont2][1];
                        v[cont2][1] = aux2;
                }
            }
        }   
        return v;
    }
	
	
}
