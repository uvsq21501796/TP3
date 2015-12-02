package exo3_4;

import java.util.ArrayList;

public class Manager extends Employe{
		
		private ArrayList<Employe> listEmploye;
		
		public Manager()
		{
			super();
			listEmploye = new ArrayList<Employe>();
		}
		
		public void ajoutEmploye(Employe e)
		{
			this.listEmploye.add(e);
		}
		
		@Override
		public int calculerSalaire()
		{
			int salaire = getSalaire() + 20 * getAnnee();
			
			for (int j = 0 ; j < listEmploye.size() ; j++)
			{
				salaire += 100;
			}
				
			return salaire;
				
		}
		 

}
