/**
 * 
 */
package fr.uvsq.coo.ex3_4;

/**
 * @author user
 *
 */
public class Employé {
	
	private int salaire;
	private int annee;
	
	public Employé() {
		this.salaire = 1500;
		annee = 0;
	}
	
	/**
	 * @return the salaire
	 */
	public int getSalaire() {
		return salaire;
	}
	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}
	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public int calculerSalaire() {
		return this.salaire + 20 * this.annee;
	}
	

}
