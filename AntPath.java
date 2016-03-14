import ch.aplu.jgamegrid.Location;
import ch.aplu.robotsim.*;/**
 * Import Libraries
 */
/**
 * @author gecortesh
 *
 */
public class AntPath {
public AntPath(){
	NxtContext.setStartPosition(430, 430);
	NxtContext.useBackground("sprites/antPath.gif");
	NxtContext.setStartDirection(195);
	LegoRobot robot = new LegoRobot();
	Gear gear = new Gear();
	LightSensor rsensor = new LightSensor(SensorPort.S1, false);
	LightSensor lsensor = new LightSensor(SensorPort.S2, false);
	robot.addPart(gear);
	robot.addPart(rsensor);
	robot.addPart(lsensor);
	int left = 0;  //declaring initial values
	int right = 0;

	while (true){ 
		right = rsensor.getValue();  // Saving the lectures of the sensors in a variable
		left = lsensor.getValue();
		if (right == 0 && left == 0){
			gear.forward();
			Tools.delay(50);
			gear.stop();
			gear.rightArc(.1, 50);
			gear.forward();
		}else if (right == 0 && left == 1000){ 
		gear.stop();
		gear.left();
		Tools.delay(50);
		gear.forward();
		} else if (left == 0 && right == 1000){
		gear.stop();
		gear.right();
		Tools.delay(50);
		gear.forward();
		} else if (right == 1000 && left == 1000){
			gear.forward();
			Tools.delay(50);
		} 
		} 
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AntPath();
	}

}
