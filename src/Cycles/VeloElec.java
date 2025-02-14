package Cycles;

import java.util.Random;

public class VeloElec extends Velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec (double braquet, double diamRoue, double coupleMoteur) {
		super(braquet,diamRoue);
		facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec (double braquet, double coupleMoteur) {
		super(braquet);
		facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getDEFAUT_COUPLE_MOTEUR() {
		return facteurPuissanceMoteur;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		this.facteurPuissanceMoteur = DEFAUT_COUPLE_MOTEUR;
    }
	
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double coupleMoteur) {
        this.facteurPuissanceMoteur = coupleMoteur;
    }
	
	@Override
    public String toString() {
        return "VeloElec[facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
    }
    
    public double getPuissance(double FrequenceCoupsDePedale) {
        return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
    }
    
    public static void main(String[] args) {
        VeloElec ve1 = new VeloElec(20, 50, 45.3);
        
        System.out.println(ve1);
        System.out.println("FacteurPuissanceMoteur : " + ve1.getFacteurPuissanceMoteur());
        System.out.println("Puissance : " + ve1.getPuissance(70));
    }
}
	