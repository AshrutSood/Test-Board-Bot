
package org.usfirst.frc4930.TestBoardBot;

import org.usfirst.frc4930.TestBoardBot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public Joystick joystick1;

    public OI() {
        joystick1 = new Joystick(0);
    
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Run Motor", new RunMotor());
    }

    public double getJoystick1() {
        return joystick1.getY();
    }
}

