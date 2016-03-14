import java.awt.Color;

import ch.aplu.jgamegrid.Location;
import ch.aplu.robotsim.*;

public class Path {
	public Path() {
		NxtContext.setStartPosition(430, 230);
		NxtContext.useBackground("sprites/yellowpath.gif");
		NxtContext.setStartDirection(270);
		LegoRobot robot = new LegoRobot();
		Gear gear = new Gear();
		ColorSensor csensor = new ColorSensor(SensorPort.S3);
		java.awt.Color color;
		robot.addPart(csensor);
		robot.addPart(gear);
		gear.setSpeed(100);
		int lap = 0;
	
		
			while (true){ 
		color = csensor.getColor();
		color.getRGB();
		System.out.println("Color: " + color.getRGB());
		System.out.println("Lap: " + lap);
		if (color.getRGB() == -255){
		gear.forward();
		} 
		else if (color.getRGB() == -16736081){ 
		gear.stop();
		gear.left();
		Tools.delay(50);
		gear.forward();
		} else if (color.getRGB() == -13395661){
		gear.stop();
		gear.right();
		Tools.delay(50);
		gear.forward();
		} else if (color.getRGB() == -16776960){
			gear.stop();
			gear.forward();
			Tools.delay(200);
			lap++;
			
			} else if (lap == 3){
				gear.stop();
			}
		}
		}

	public static void main(String[] args) {
		new Path();

	}

}
