/**
 * 
 */
package fr.uvsq.coo.ex4_1;

import static org.junit.Assert.*;

import java.io.*;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;


/**
 * @author user
 *
 */
public class PersonnelTest {
	
	private Personnel p;
	File fichier;
	
	@Before
	public void setUp() throws Exception {
		p = new Personnel.Builder("aa", "jACKY", LocalDate.of(200, 10, 10)).build();
		fichier =  new File("Baaui") ;
		try(ObjectOutputStream out = new ObjectOutputStream (
				new BufferedOutputStream (
						new FileOutputStream ( fichier)))) { 
								out.writeObject ( p ) ;
				}
	}
	
	@Test
	public void Test1() throws FileNotFoundException, IOException, ClassNotFoundException {
		Personnel temp;
		try(ObjectInputStream in = new ObjectInputStream (
				new BufferedInputStream (
				new FileInputStream (fichier ) ) ) ) {
				temp = ( Personnel)in.readObject() ;
				assertEquals(p.getNom(),temp.getNom());
				}catch ( EOFException e ) {}
		
	}
		
	

}
