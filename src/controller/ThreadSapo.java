package controller;

import java.util.Random;

public class ThreadSapo extends Thread {
	private double ms;
	private double mc;
	private double tempo;
	public ThreadSapo(double ms, double mc) {
		this.mc = mc;
		this.ms  = ms;
	}
	
	public double getTempo(){
		return this.tempo;
		
	}
	
	@Override
	public void run() {
		this.tempo = corridaSapo();
	}
	
	public double corridaSapo () {
		double tempoIni = 0;
		double tempoFinal = 0;
		double tempo;
				
		Random r = new Random(); 
		tempoIni = System.nanoTime();
		for (double i = 0;  i < this.mc; i += r.nextDouble() * this.ms ){
			System.out.println("Sapo #" + Double.toString((getId()+1)).substring(1,2)  + " Saltou " + i);			
		}
		tempoFinal = System.nanoTime();
		tempo = tempoFinal - tempoIni;
		
		return tempo;
	}
}
