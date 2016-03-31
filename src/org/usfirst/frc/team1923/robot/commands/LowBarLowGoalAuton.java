package org.usfirst.frc.team1923.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LowBarLowGoalAuton extends CommandGroup {
    
    public  LowBarLowGoalAuton() {
        this(0.7, 4, 3, 1);//find values
    }
    
    public LowBarLowGoalAuton(double speed, double driveTimeOut1, double driveTimeOut2, double turnTimeOut){
    	addSequential(new IntakePistonCommand());
    	addSequential(new DriveTimeCommand(0, 1));
    	addSequential(new DriveTimeCommand(speed,driveTimeOut1));
    	addSequential(new DriveRightTurnCommand(speed,turnTimeOut));
    	addSequential(new DriveTimeCommand(speed,driveTimeOut2));
    	
    }
}
