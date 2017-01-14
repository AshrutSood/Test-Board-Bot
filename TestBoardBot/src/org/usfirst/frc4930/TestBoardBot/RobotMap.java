
package org.usfirst.frc4930.TestBoardBot;

import com.ctre.CANTalon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static CANTalon motor;

    public static void init() {
        motor = new CANTalon(1);
        
        motor.setSafetyEnabled(true);
        motor.setExpiration(0.1);
       
    }
}
