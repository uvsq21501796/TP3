package exo3_5;

import java.util.ArrayList;

 
class Terrain {
	private ArrayList<RobotBase> listRobot = new ArrayList<RobotBase>();
	
	public void avancerTous() {
		for(int i =0; i< this.listRobot.size();i++)
		{
			 this.listRobot.get(i).avance();
		}
	
	}
	
	public void ajouterRobot(Robot e) {
		 this.listRobot.add(e);
	}
	
	public void retirerRobot(Robot e) {
		 this.listRobot.remove(e);
	}
	
	

}