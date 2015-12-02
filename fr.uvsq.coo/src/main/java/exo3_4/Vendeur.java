package exo3_4;

public class Vendeur extends Employe 
{
	
	private int commission;
	
	public Vendeur(int c)
	{
		super();
		this.commission = c;
	}
	
	@Override
	public int calculerSalaire()
	{
		return this.getSalaire() + 20 * this.getAnnee() * this.commission;
	}

	
	
}
