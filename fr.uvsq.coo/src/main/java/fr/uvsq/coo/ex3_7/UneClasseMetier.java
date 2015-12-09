/**
 * 
 */
package fr.uvsq.coo.ex3_7;

import java.time.LocalDateTime;

/**
 * @author user
 *
 */
public class UneClasseMetier  extends Affiche{
	
	public void uneMethodeMetier()
	{
		Affiche.Aff(LocalDateTime.now()+ ": Début  de  uneMethodeMetier");
	
	
	// Traitement métiers
	
		Affiche.Aff(LocalDateTime.now()+ ": Fin  de  uneMethodeMetier");

	
	}

}
