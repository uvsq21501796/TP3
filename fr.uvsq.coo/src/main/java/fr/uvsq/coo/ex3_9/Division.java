/**
 * 
 */
package fr.uvsq.coo.ex3_9;

import java.util.Stack;

/**
 * @author user
 *
 */
public class Division extends Command {
	protected Stack<String> history;
	
	public Division (Stack<String> h) {
		history = h;
	}

	@Override
	public  Stack <String> execute() {
		return history;

	}

}
