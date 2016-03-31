package org.usfirst.frc.team1923.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TwoBallsAuton extends CommandGroup {
    
    public  TwoBallsAuton() {
    	addSequential(new IntakePistonCommand());
    	addSequential(new DriveTimeCommand(0, 1));
    	//addSequential(new Shoot High);
    	//addSequential(new Turn 90 deg right);
    	addSequential(new DriveTimeCommand(0.7, 5));
    	//addSequential(new Turn around 30 deg left); 	// so basically toward the ball
    	//addSequential(new keep intake roller in for 3 sec);
    	addSequential(new DriveTimeCommand(0.5, 1));	//drive into the ball
    	//addSequential(new Turn toward low bar);
    	//addSequential(new );
    }
}
