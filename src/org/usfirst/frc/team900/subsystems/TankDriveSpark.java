/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team900.subsystems;

import org.usfirst.frc.team900.robot.Constants;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

//An example subsystem.  You can replace me with your own Subsystem.
public class TankDriveSpark extends Subsystem {
    SpeedController frontLeft, frontRight, backLeft, backRight;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public TankDriveSpark()
    {
        frontLeft = new Spark(Constants.FL_DRIVE_SPARK);
        frontRight = new Spark(Constants.FR_DRIVE_SPARK);
        backLeft = new Spark(Constants.BL_DRIVE_SPARK);
        backRight = new Spark(Constants.BR_DRIVE_SPARK);
    }
    public void initDefaultCommand() {
        // <NOT NECESSARY> Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());

    }
    
    public void drive(double lValue, double rValue)
    {
        frontLeft.set(lValue);
        backLeft.set(lValue);
        backRight.set(rValue);
        backRight.set(rValue);
    }
}