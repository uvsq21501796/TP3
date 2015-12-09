/**
 * 
 */
package fr.uvsq.coo.ex4_1;

import java.io.File;

/**
 * @author user
 *
 */
public abstract class DAO<T> {
	protected File fichier =  new File("Baaui") ;
	public abstract T create (T obj) ;
	public abstract T find ( String id ) ;
	public abstract T update (T obj ) ;
	public abstract void delete (T obj ) ;


}
