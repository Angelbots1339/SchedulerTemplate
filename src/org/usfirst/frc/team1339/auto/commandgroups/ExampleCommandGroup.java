package org.usfirst.frc.team1339.auto.commandgroups;

import org.usfirst.frc.team1339.base.CommandGroupBase;

public class ExampleCommandGroup extends CommandGroupBase{

	public ExampleCommandGroup(){
		/*
		 * A command group is a group of commands that run in sequence and in parallel.
		 * 
		 * To add a command to run in sequence, use addSequential(), eg:
		 * addSequential(new DriveChassis());
		 * 
		 * This starts to run the command, and it will run until it is finished, and then
		 * the command after it will start running.
		 * 
		 * To add a command to run in parallel, use addParallel(), eg:
		 * addParallel(new DriveShooter());
		 * 
		 * This starts to run the command, and then the command after it will immediately
		 * start to run, regardless of whether this command has finished or not.
		 * 
		 * You can also add an interrupter, which will end a command based on an AngelButton,
		 * regardless of if it has finished or not. You give it a line number, starting at 0, 
		 * an AngelButton, and optionally, a value for the AngelButton to be at for the command
		 * to end. Use addInterrupter(), eg:
		 * addInterrupter(0, Robot.HardwareAdapter.getAButton());
		 * or
		 * addInterrupter(2, Robot.HardwareAdapter.getXButton(), false);
		 * 
		 * In the first example, the very first command will end when the A button returns true.
		 * In the second example, the third command will end when the X button returns false.
		 */
	}
}
