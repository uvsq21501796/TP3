/**
 * 
 */
package fr.uvsq.coo.ex3_4;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Entreprise {
	

	private ArrayList<Employé> liste;

	public Entreprise() {
		this.liste = new ArrayList<Employé>();
	}

	public void ajoutEmploye(Employé e) {
		this.liste.add(e);
	}

	public int calculSalaireEntreprise() {
		int salaire = 0;
		for (int i = 0; i < this.liste.size(); i++)
			salaire += this.liste.get(i).calculerSalaire();
		return salaire;

	}
}
