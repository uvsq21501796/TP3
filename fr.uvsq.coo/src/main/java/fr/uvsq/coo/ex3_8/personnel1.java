package fr.uvsq.coo.ex3_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

public class personnel1 {
	
	



	private final String nom;
	private final String prenom;
	private final Date date;
	public ArrayList<Integer> Tel = new ArrayList<Integer>();
	public String Fonct;
	

	
	public static class Builder
	{
		private final String nom;
		private final String prenom;
		private final Date date;
		public ArrayList<String> Tel = new ArrayList<String>();
		public String Fonct;
		
		public Builder(String nom, String prenom, Date date){
			this.nom = nom;
			this.prenom=prenom;
			this.date = date;
		}

		public Builder Tel(ArrayList tel)
		{
			Tel = tel;
			return this;
		}
		
		public Builder Fonct(String fonct)
		{
			Fonct = fonct;
			return this;
		}
		
		public personnel1 build(){
			return new personnel1(this);
		}
	}
	public personnel1(Builder builder) {
		// TODO Auto-generated constructor stub
	}
		
	}
