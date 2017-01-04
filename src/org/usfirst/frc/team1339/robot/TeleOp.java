package org.usfirst.frc.team1339.robot;

import org.usfirst.frc.team1339.utils.Looper;

public class TeleOp {
	
	TeleOp(){
		
	}
	
    public void teleOpPeriodic(){
    	Looper.getInstance().update();
    	Robot.HardwareAdapter.checkTriggers();
    }
    
	public void init(){	
		Looper.getInstance().setInitDefaults();
	}
}
