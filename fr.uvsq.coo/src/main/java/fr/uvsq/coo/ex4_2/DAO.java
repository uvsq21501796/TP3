/**
 * 
 */
package fr.uvsq.coo.ex4_2;

import java.sql.*;

/**
 * @author user
 *
 */
public abstract class DAO<T> {
	protected Connection connect = null;//DriverManager.getConnection(url, "myLogin", "myPassword"); 
	public abstract T create (T obj) ;
	public abstract T find ( String id ) ;
	public abstract T update (T obj ) ;
	public abstract void delete (T obj ) ;


}
