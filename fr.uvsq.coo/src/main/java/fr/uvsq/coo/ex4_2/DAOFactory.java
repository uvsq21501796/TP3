/**
 * 
 */
package fr.uvsq.coo.ex4_2;

/**
 * @author user
 *
 */
public class DAOFactory {
	public static DAO<Personnel> getPersonneDAO ( ) {
		return new PersonnelDAO ( ) ;
	}

}
