/**
 * 
 */
package fr.uvsq.coo.ex4_1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Personnel implements Element,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String nom;
	private final String prenom;
	private final LocalDate dateNaissance;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @return the telephone
	 */
	public ArrayList<String> getTelephone() {
		return telephone;
	}

	/**
	 * @return the poste
	 */
	public String getPoste() {
		return poste;
	}

	private final ArrayList<String> telephone;
	private final String poste;
	
	private Personnel (Builder builder) {
		this.nom = builder.nom;
		this.prenom = builder.prenom;
		
		this.dateNaissance = builder.dateNaissance;
		this.telephone = builder.telephone;
		this.poste = builder.poste;
	}
	
	public void affiche() {
		System.out.println(nom);
		System.out.println(prenom);
		System.out.println(dateNaissance.toString());
	}
	
	public static class Builder {
		// parametre principaux
		private final String nom;
		private final String prenom;
		private final LocalDate dateNaissance;
		
		// parametre opti
		private ArrayList<String> telephone =  new ArrayList<String>();
		private String poste ="";
		
		public Builder(String nom,String prenom,LocalDate date) {
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = date;
		}
		
		public Builder telephone(ArrayList<String> numero) {
			this.telephone = numero;
			return this;
		}
		
		public Builder poste(String poste) {
			this.poste = poste;
			return this;
		}
	
		public Personnel build() {
			return new Personnel(this);
		}
	}
	

	

}
