/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Punch extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  DoubleSolenoid doubleS = new DoubleSolenoid(RobotMap.doubleSolenoid1, RobotMap.doubleSolenoid2);

public void doublePunch(){
  doubleS.set(DoubleSolenoid.Value.kForward);
}

public void doubleRetract(){
  doubleS.set(DoubleSolenoid.Value.kReverse);
}

public void doubleIdle(){
  doubleS.set(DoubleSolenoid.Value.kOff);
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
