package exo3_4;

import java.util.ArrayList;

public class Entreprise {
	
		private ArrayList<Employe> liste;
		
		public Entreprise()
		{
			this.liste = new ArrayList<Employe>(); 
		}
		
		public void ajoutEmploye(Employe e)
		{
			this.liste.add(e);
		}
		
		public int calculSalaireEntreprise()
		{
			int salaire = 0;
			for(int i=0; i<this.liste.size(); i++)
			 
				salaire += this.liste.get(i).calculerSalaire();

			return salaire; 
		}
		
}
