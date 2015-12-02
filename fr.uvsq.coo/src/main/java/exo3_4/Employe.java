package exo3_4;

/** pour respecter le principe OCP, le code a �t� con�u 
 * de fa�on a ce que si on veut ajouter une nouvelle cat�gorie 
 * d'employ�s, il n y a pas besoin de modifier le code de la 
 * classe Employe, il suffit simplement de cr�er une nouvelle classe 
 * qui extend la classe Employe
 * 
 *  
 * @author AIMAN
 *
 */

public class Employe {
	
	private int salaire;
	private int annee;
	
	public Employe()
	{
		this.salaire = 1500;
		annee = 0;
	}
	
	Employe(int s) {
		this.salaire = s;
		annee = 0;
	}

	public int getSalaire()
	{
		return salaire;
	}
	
	public void setSalaire(int salaire)
	{
		this.salaire = salaire;
	}
	
	public int getAnnee()
	{
		return annee;
	}
	
	public void setAnnee(int annee)
	{
		this.annee = annee;
	}
	
	public int calculerSalaire()
	{
		return this.salaire + 20 * this.annee;
	}
	
}

