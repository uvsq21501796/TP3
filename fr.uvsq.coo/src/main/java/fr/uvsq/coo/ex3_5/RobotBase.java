/**
 * 
 */
package fr.uvsq.coo.ex3_5;

/**
 * @author user
 *
 */
public class RobotBase {
	
	protected  Position position ;
	protected  enum Direction {Nord,Sud,Ouest,Est;}
	protected  Direction direction;
	
	public RobotBase(Position position, Direction dir) {
		this.position = position;
		if(Direction.Nord == dir) {
			this.direction = dir;
		}else if (Direction.Est == dir) {
			this.direction = dir;
		}else if (Direction.Ouest == dir) {
			this.direction = dir;
		}else if (Direction.Sud == dir) {
			this.direction = dir;
		}
	}
	
	public void avance() {}
	

}
