package org.usfirst.frc.team1923.robot;

import edu.wpi.first.wpilibj.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * @modified Xavier 1/17/2016
 * @modified by Aravind 1/17/2016
 * @modified by Aravind 1/31/2016
 */
public class RobotMap {
    
	public static final double EASE_INCREMENT = 0.09; //@TODO test ease increment
	
	//Gear Shifters
//	public static Solenoid gearSolenoidLeft = new Solenoid(0); //@TODO find port
//	public static Solenoid gearSolenoidRight = new Solenoid(0); //@TODO find port

	//Drive Motors
	public static CANTalon leftDriveOne = new CANTalon(1);  //@TODO find port
	public static CANTalon leftDriveTwo = new CANTalon(2);  //@TODO find port
	public static CANTalon leftDriveThree = new CANTalon(3);  //@TODO find port
	public static CANTalon rightDriveOne = new CANTalon(4);  //@TODO find port
	public static CANTalon rightDriveTwo = new CANTalon(5);  //@TODO find port
	public static CANTalon rightDriveThree = new CANTalon(6);  //@TODO find port
	
	//Intake Motors
	public static CANTalon intake = new CANTalon(0);
	
//	public static Encoder leftEncoder = new Encoder(0,0);
//	public static Encoder rightEncoder = new Encoder(0,0);

	
	//public static Gyro gyro = new Gyro(0);
	//public static Ultrasonic ultra = new Ultrasonic(1,1);//@TODO find port
	//public static AnalogAccelerometer accel = new AnalogAccelerometer(0);//@TODO find port
	
	//Robot initializing
	public static void init(){
		//gyro.reset();
//		leftEncoder.reset();
//		rightEncoder.reset();
		//ultra.reset();
		//accel.reset();
	}

}
