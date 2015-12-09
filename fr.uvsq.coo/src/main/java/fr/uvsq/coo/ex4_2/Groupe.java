/**
 * 
 */
package fr.uvsq.coo.ex4_2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Groupe implements Element ,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3569604536270001050L;
	public ArrayList<Element> list;
	public String nom;
	
	Groupe(String nom) {
		list = new ArrayList<Element>();
		this.nom = nom;
	}
	
	
	
	/* (non-Javadoc)
	 * @see fr.uvsq.coo.ex3_8.Element#Affichage()
	 */
	public void affiche() {
		// TODO Auto-generated method stub
		System.out.println(nom );
		for(Element e : list)
		{
			e.affiche();
		}
		
	}

}
