/**
 * 
 */
package fr.uvsq.coo.ex4_1;

/**
 * @author user
 *
 */
public class DAOFactory {
	public static DAO<Personnel> getPersonneDAO ( ) {
		return new PersonnelDAO ( ) ;
	}

}
