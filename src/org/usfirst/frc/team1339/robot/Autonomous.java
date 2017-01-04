package org.usfirst.frc.team1339.robot;

import org.usfirst.frc.team1339.base.CommandBase;
import org.usfirst.frc.team1339.utils.Looper;

/**
 * This is the class for autonomous robot control.
 * @author Sam Schwartz
 * @author Nate Howard
 * @author Sam Korman
 * @see Robot
 *
 */
public class Autonomous {
	
	private CommandBase autoCommand = null;

	Autonomous(){
		
	}
	
	public void init(){
		/*
		 * If you have an autonomous command, here is where you would set it. eg:
		 * autoCommand = new DriveStraight(0.5, 3);
		 */
		Looper.getInstance().setInitDefaults();
		if(autoCommand != null) Looper.getInstance().newCommand(autoCommand);
	}
	
	public void autonomousPeriodic(){
		Looper.getInstance().update();
    }

}