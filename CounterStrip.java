import ch.aplu.jgamegrid.Location;
import ch.aplu.robotsim.*;
import ch.aplu.util.*;

public class CounterStrip {
	public CounterStrip() {
		NxtContext.setStartPosition(30, 250);
		NxtContext.useBackground("sprites/panel.gif");
		NxtContext.setStartDirection(0);
		LegoRobot robot = new LegoRobot();
		Gear gear = new Gear();
		LightSensor lsensor = new LightSensor(SensorPort.S3, false);
		robot.addPart(gear);
		robot.addPart(lsensor);
		gear.setSpeed(30);
		int brightness = 0;
		int count = 0;
				
		Console.init();
		while (true) {
			   brightness = lsensor.getValue();
			if (brightness == 1000) {
				gear.forward();
			} else if (brightness == 0) {
				robot.playTone(50.0, 1000.0);
				count++;
				gear.forward();
				Console.println("Counter: " + count);
				Tools.delay(2000);
				} 
		}
		
		
	}
	
	public static void main(String[] args) {
		new CounterStrip();
	}
}
