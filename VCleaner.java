import ch.aplu.jgamegrid.Location;
import ch.aplu.robotsim.*;/**
 * 
 */

/**
 * @author gecortesh
 *
 */
public class VCleaner {
public VCleaner(){
	NxtContext.setStartPosition(400, 100);
	NxtContext.useObstacle("sprites/bar1.gif",50,250);
	NxtContext.useObstacle("sprites/bar1.gif",450,250);;
	NxtContext.setStartDirection(180);
	LegoRobot robot = new LegoRobot();
	Gear gear = new Gear();
	TouchSensor tsensor = new TouchSensor(SensorPort.S3);
	robot.addPart(gear);
	robot.addPart(tsensor);
	boolean touch = false;
	int side = 0;
	while (true){
		touch = tsensor.isPressed();
		gear.forward();
		
			if (side == 0 &&touch == true){
			gear.backward();
			Tools.delay(300);
			gear.left(550);
out ma			Tools.delay(200);
			gear.forward();
			Tools.delay(200);
			gear.left(550);
			Tools.delay(200);
			side = 1;
			gear.forward();}
		else if (side == 1 && touch == true){
			gear.forward();
				gear.backward();
				Tools.delay(300);
				gear.right(550);
				Tools.delay(200);
				gear.forward();
				Tools.delay(200);
				gear.right(550);
				Tools.delay(200);
				side = 0;
			} System.out.println("Side: "+ side);
	} 
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new VCleaner();
	}

}
