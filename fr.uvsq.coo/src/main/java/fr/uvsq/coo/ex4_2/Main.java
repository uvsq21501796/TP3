/**
 * 
 */
package fr.uvsq.coo.ex4_2;

/**
 * @author user
 *
 */
public class Main {
	public static void main ( String [ ] args ) {
		DAO<Personnel> personneDao = DAOFactory.getPersonneDAO();
		System.out.println ( personneDao.find ( " Dupond" ) ) ;
		}

}
