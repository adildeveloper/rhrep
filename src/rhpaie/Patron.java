package rhpaie;

import java.util.Date;

public class Patron extends Employe {
	
	private  static double chiffreAffaire;
	private  double pourcentage;

	
	public Patron(int matricule, String nom, String prenom, Date dateNaissance) {
		super(matricule, nom, prenom, dateNaissance);
		
	}

	
	
	public Patron(int matricule, double pourcentage) {
		super(matricule);
		
		this.pourcentage = pourcentage;
	
	}



	public static double getChiffreAffaire() {
		return chiffreAffaire;
	}



	public static void setChiffreAffaire(double chiffreAffaire) {
		Patron.chiffreAffaire = chiffreAffaire;
	}



	@Override
	public double getSalaire() {
		
		double salaire = Math.round((Patron.chiffreAffaire*this.pourcentage/100)/12);
		
		return salaire;
	}

	public String toString() {
		
		return super.toString()+ "avec un chiffre d'affaire "+this.chiffreAffaire+"et un pourcentage de "
		+this.pourcentage;
	}
}
