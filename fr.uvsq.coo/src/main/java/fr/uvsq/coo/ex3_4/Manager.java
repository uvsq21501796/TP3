/**
 * 
 */
package fr.uvsq.coo.ex3_4;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Manager extends Employé{
	
	private ArrayList<Employé> listeEmployé;
	
	/**
	 * 
	 */
	
	public Manager() {
		// TODO Auto-generated constructor stub
		super();
		listeEmployé = new ArrayList<Employé>();
	}
	
	public void ajouteEmployé(Employé e) {
		this.listeEmployé.add(e);
	}
	
	@Override 
	public int calculerSalaire() {

		int salaire = getSalaire() + 20 * getAnnee();

		for (int j = 0; j < listeEmployé.size(); j++) {
			salaire += 100;
		}

		return salaire;
	}

}
