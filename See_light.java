import ch.aplu.jgamegrid.Location;
import ch.aplu.robotsim.*;

public class See_light {
	public See_light() {
		NxtContext.setStartPosition(150, 250);
		NxtContext.useBackground("sprites/blackPanels.gif");
		NxtContext.setStartDirection(0);
		LegoRobot robot = new LegoRobot();
		Gear gear = new Gear();
		LightSensor lsensor = new LightSensor(SensorPort.S3, false);
		robot.addPart(gear);
		robot.addPart(lsensor);
		int brightness = 0;
		while (true) {
			brightness = lsensor.getValue();
			if (brightness == 1000) {
				gear.forward();
			} else if (brightness == 0) {
				gear.stop();
				gear.rightArc(0.1, 2700);
				gear.forward();
			}
			System.out.println("Brightnes" + brightness);
		}

	}

	public static void main(String[] args) {
		new See_light();
	}
}
