package org.usfirst.frc.team1339.commands;

import org.usfirst.frc.team1339.robot.Constants;
import org.usfirst.frc.team1339.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;

public class ArcadeDrive extends CommandBase{
	
	double throttle, turn;
	Joystick stick;
	
	public ArcadeDrive(){
	}
	
	public void init(){
		
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
	public void end(){
	}
	
	public void interrupted(){
		
	}
}