/**
 * 
 */
package fr.uvsq.coo.ex3_9;

import java.util.Stack;

/**
 * @author user
 *
 */
public class Undo extends Command {
	
	protected Stack<String> history;
	public Undo(Stack<String> h) {
		history = h;
	}

	/* (non-Javadoc)
	 * @see fr.uvsq.coo.ex3_9.Command#execute()
	 */
	@Override
	public Stack<String> execute() {
		history.pop();
		return history;
	}
	

}
