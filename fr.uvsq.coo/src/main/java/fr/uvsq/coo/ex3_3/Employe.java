/**
 * 
 */
package fr.uvsq.coo.ex3_3;

/**
 * @author user
 *
 */
public class Employe {
	
	private final String nom ;
	private final String adresse ;
	
	public Employe(String nom,String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}

	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	
	
	
	
}
