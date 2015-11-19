package fr.uvsq.coo.ex3_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

public class personnel1 {
	
	private String nom;
	private String prenom;
	private Date date;
	private ArrayList<> Tel;
 	public fonction fonct;
	
	public static class Builder
	{
		private String nom = "EL FACHTALI";
		private String prenom = "Aiman";
		private Date date;
 		private String fonction;
		public fonction fonct;
		
		public Builder Nom(String N) {
			nom = N;
			return this;
		}
		public Builder Prenom(String P) {
			prenom = P;
			return this;	
		}
		public Builder(Date date) {
			super();
			this.date = date;
		}
		public Builder(fr.uvsq.coo.ex3_8.fonction fonct) {
			super();
			this.fonct = fonct;
		}
		
		
	}
	
	
	
	
	
	
	

}
