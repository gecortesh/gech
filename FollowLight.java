import ch.aplu.jgamegrid.Location;
import ch.aplu.robotsim.*;/**
 * Import libraries
 */

/**
 * @author gecortesh
 *
 */
public class FollowLight {
	//Constructor
public FollowLight (){
	LegoRobot robot = new LegoRobot();  //Add new object robot, gear and sensors
	Gear gear = new Gear();
	LightSensor rsensor = new LightSensor(SensorPort.S1, false); 
	LightSensor lsensor = new LightSensor(SensorPort.S2, false);
	robot.addPart(gear);
	robot.addPart(rsensor);
	robot.addPart(lsensor);
	int left = 0;  //declaring initial values
	int right =0;
	
	while (true) {
		right = rsensor.getValue();  // Saving the lectures of the sensors in a variable
		left = lsensor.getValue();
		if (right > 1000) {  //the sensors get the brigthness of the background
			gear.right();   // if the right ligth sensor detects brigthness makes the robot turn right an then forward
			Tools.delay(50);
			gear.forward();
		} else if (left > 1000) { //if the left ligth sensor detects brigthness makes the robot turn left an then forward
			gear.left();
			Tools.delay(50);
			gear.forward();
		}else if (right == 1000 && left == 1000) { //if both sensors do not detect light then it goes forward until any detection
			gear.forward();
		}
		System.out.println("Rsensor: " + right + "Lsensor: "+ left);
}
}
	/**
	 * @param args is the main class assigning a space of memory to the program
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new FollowLight ();
	}

}
