package Cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();
	
	public Velo (double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	public Velo (double braquet) {
		this.braquet = braquet;
	}
	
	public Velo () {
		braquet = DEFAUT_BRAQUET;
	}
	
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
        this.genAlea = genAlea;
    }
		
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
        this.braquet = braquet;
    }
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
        this.diamRoue = diamRoue;
    }
	
	public String toString() {
		return "Velo[braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return (FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble());
	}
	
	public static void main(String[] args) {
		Velo v1 = new Velo (20,50);
		
		System.out.println(v1);
		System.out.println("genAlea : " + v1.getGenAlea());
        System.out.println("Puissance : " + v1.getPuissance(70));
	}
}
	