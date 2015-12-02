package exo3_5;

 

public class Robot extends RobotBase {

	 
	
	public Robot(Position position, Direction dir) {
		super(position, dir);
		// TODO Auto-generated constructor stub
	}
	
	public void tourne (Direction dir ) { 
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
	
	@Override
	public void avance () { 
		if(Direction.Nord == this.direction) {
			this.position.setY(position.getY() + 1);
		}else if (Direction.Est == this.direction) {
			this.position.setX(position.getX() + 1);
		}else if (Direction.Ouest == this.direction) {
			this.position.setX(position.getX() - 1);
		}else if (Direction.Sud == this.direction) {
			this.position.setY(position.getY() - 1);
		}
	}
		
	
	
}