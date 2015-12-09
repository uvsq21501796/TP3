/**
 * 
 */
package fr.uvsq.coo.ex3_9;

import java.util.Hashtable;
import java.util.Stack;

/**
 * @author user
 *
 */
public class Interpreter {
	protected Stack<String> history = new Stack<String>();
	protected Hashtable<String,Command> set = new Hashtable<String,Command>();
	
	/*
	public void session ()
	{
		while(true)
		{
			Command command = getNewCommand();
			if (command instanceof Quit) {
				return ;
				} 
			else {
				command.execute ( ) ;
				}
		}
	}
	*/
	protected Command getNewCommand ( ) 
	{
	  String s = System.in.toString() ;
	  while ( ! set.containsKey(s) ) 
	   {
		System.out.println("Not a valid command; try again!") ;
		 s = System.in.toString() ;
	   }
	  return ((Command) set.get(s)) ;
	 }

}
