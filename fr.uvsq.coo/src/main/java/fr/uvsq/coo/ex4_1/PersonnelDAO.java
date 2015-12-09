/**
 * 
 */
package fr.uvsq.coo.ex4_1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.time.LocalDate;

/**
 * @author user
 *
 */
public class PersonnelDAO extends DAO<Personnel> {

	/* (non-Javadoc)
	 * @see fr.uvsq.coo.ex4_1.DAO#create(java.lang.Object)
	 */
	@Override
	public Personnel create(Personnel obj) {
		try(ObjectOutputStream out = new ObjectOutputStream (
				new BufferedOutputStream (
						new FileOutputStream ( fichier)))) { 
								out.writeObject ( obj ) ;
				} catch (IOException e) {
					e.printStackTrace();
				}
		return obj;
	}

	/* (non-Javadoc)
	 * @see fr.uvsq.coo.ex4_1.DAO#find(java.lang.String)
	 */
	/*
	@Override
	public Personnel find(String id) {
		Personnel p = new Personnel.Builder("", "", LocalDate.of(10,10,10)).build() ;
		try {
		PreparedStatement prepare = connect.prepareStatement (
		"SELECT ∗ FROM personnel WHERE nom = ? " ) ;
		prepare.setString( 1 , id ) ;
		ResultSet result = prepare.executeQuery() ;
		if(result.first()) {
		p = new Personnel.Builder(
		result.getString ( "nom" ) ,
		result.getString( " age " ) ,
		LocalDate.of(10,10,10)).build() ;
		}
		}catch( SQLException e ) {
		e.printStackTrace  ( ) ;
		}
		return p ;
	}
*/
	/* (non-Javadoc)
	 * @see fr.uvsq.coo.ex4_1.DAO#update(java.lang.Object)
	 */
	@Override
	public Personnel update(Personnel obj) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.uvsq.coo.ex4_1.DAO#delete(java.lang.Object)
	 */
	@Override
	public void delete(Personnel obj) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.uvsq.coo.ex4_1.DAO#find(java.lang.String)
	 */
	@Override
	public Personnel find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
