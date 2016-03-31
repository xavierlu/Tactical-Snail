package org.usfirst.frc.team1923.robot.subsystems;

import org.usfirst.frc.team1923.robot.RobotMap;
import org.usfirst.frc.team1923.robot.commands.DriveJoystickCommand;
import org.usfirst.frc.team1923.robot.utils.Calculator;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Subsystem handles drive CANTalons.
 */
public class DriveTrainSubsytem extends Subsystem{
	
	public double oldLeftSpeed = 0,
			oldRightSpeed = 0;

	protected void initDefaultCommand() {
		setDefaultCommand(new DriveJoystickCommand());
	}

	public void stop(){
		rawDrive(0, 0);
	}
	
	public void rawDrive(double left, double right){
		
		RobotMap.drive.tankDrive(-left, right);
	}

	public void scalarDrive(double left, double right){
		left = Math.sin(left);
		right = Math.sin(right);
		
		smoothDrive(left, right);
	}
	
	public void smoothDrive(double left, double right){
		// open loop bias based correction
		oldLeftSpeed = Calculator.ease(left, oldLeftSpeed);
		oldRightSpeed = Calculator.ease(right, oldRightSpeed);

		left = oldLeftSpeed;
		right = oldRightSpeed;
		
		rawDrive(left, right);
	}

}