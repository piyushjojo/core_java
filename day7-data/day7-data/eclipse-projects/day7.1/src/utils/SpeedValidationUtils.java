package utils;

import custom_exception.SpeedOutOfRangeException;

public class SpeedValidationUtils {
	//speed range
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=30;
		MAX_SPEED=80;
	}
	//add a static method for speed validation
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow , causing traffic jam !!!!");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too FAST , FATAL !!!!!!");
		//=> speed within range
		System.out.println("Speed within the range......");
			
	}
	

}
