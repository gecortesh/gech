import ch.aplu.robotsim.TurtleRobot;

public class DrivePaths_Square {
	public DrivePaths_Square(){
		TurtleRobot turtle = new TurtleRobot();
		
		for (int k = 0; k < 4; k++)
		{
			square(turtle);
			turtle.left(90);
		}
	}
	
	public void square(TurtleRobot turtle)
	{
		for (int i = 0; i < 4; i++)
		{   
			turtle.forward(100);
			turtle.right(90);
		}
	}
	
	public static void main(String[] args)
	{
		new DrivePaths_Square();
	}


}
