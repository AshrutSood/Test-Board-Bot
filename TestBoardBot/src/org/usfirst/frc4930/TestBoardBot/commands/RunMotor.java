
package org.usfirst.frc4930.TestBoardBot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4930.TestBoardBot.Robot;

/**
 *
 */
public class RunMotor extends Command {
    public RunMotor() {
      requires(Robot.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
      Robot.driveTrain.move(Robot.oi.getJoystick1());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
      Robot.driveTrain.stop();
    }

    protected void interrupted() {
    }
}
