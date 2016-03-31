package org.usfirst.frc.team1923.robot.commands;

import org.usfirst.frc.team1923.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveRightTurnCommand extends Command {

	private double speed;
	private double timeOut;
	
	public DriveRightTurnCommand(double speed, double timeOut){
		requires(Robot.driveSubsystem);
		setTimeout(timeOut);
		this.speed = speed;
		this.timeOut = timeOut;
	}

	protected void initialize() {
		
	}

	protected void execute() {
		Robot.driveSubsystem.scalarDrive(speed, speed);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.driveSubsystem.stop();
	}

	protected void interrupted() {
		end();
	}
}
