package exo3_3;

public class Employe {
	
	private final String nom;
	private final String adresse;
	
	public Employe (String nom, String adresse)
	{
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public String getAdresse()
	{
		return adresse;
	}
	

}
