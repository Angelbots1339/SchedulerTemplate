package org.usfirst.frc.team1339.commands;

import org.usfirst.frc.team1339.base.CommandBase;
import org.usfirst.frc.team1339.robot.Robot;
import org.usfirst.frc.team1339.utils.Constants;

import edu.wpi.first.wpilibj.Joystick;

public class ExampleCommand extends CommandBase{
	
	double throttle, turn;
	Joystick stick;
	
	public ExampleCommand(){
		requires(Robot.chassis);
	}
	
	protected void init(){
		
	}
	
	public void execute(){
		stick = Robot.HardwareAdapter.getXboxStick();
		throttle = stick.getRawAxis(Constants.xboxLeftYAxis);
		turn = stick.getRawAxis(Constants.xboxRightXAxis);
		
		Robot.chassis.driveWithJoystick(throttle, turn);
	}
	
	public boolean isFinished(){
		return false;
	}
	
	protected void end(){
		
	}
	
	protected void interrupted(){
		
	}
}
