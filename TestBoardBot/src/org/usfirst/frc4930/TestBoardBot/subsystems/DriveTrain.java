
package org.usfirst.frc4930.TestBoardBot.subsystems;

import org.usfirst.frc4930.TestBoardBot.RobotMap;
import org.usfirst.frc4930.TestBoardBot.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    public void initDefaultCommand() {
        setDefaultCommand(new RunMotor());
    }
    
    public void move(double speed){
      RobotMap.motor.set(speed);
    }
    
    public void stop(){
      RobotMap.motor.set(0.0);
    }
}

