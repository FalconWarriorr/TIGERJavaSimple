/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team900.subsystems;

import org.usfirst.frc.team900.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
//An example subsystem.  You can replace me with your own Subsystem.

public class TankDriveTalon extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public TankDriveTalon()
    {
       
    }
    public void initDefaultCommand() {
        // <NOT NECESSARY> Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive(double lValue, double rValue)
    {
        
    }
}
