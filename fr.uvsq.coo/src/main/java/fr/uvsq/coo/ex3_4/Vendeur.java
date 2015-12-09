/**
 * 
 */
package fr.uvsq.coo.ex3_4;

/**
 * @author user
 *
 */
public class Vendeur extends Employé {
	
	private int comission;

	public Vendeur(int c) {
		super();
		this.comission = c;
	}

	@Override
	public int calculerSalaire() {
		return this.getSalaire() + 20 * this.getAnnee() + this.comission;
	}

}
