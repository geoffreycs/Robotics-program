/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
//import frc.robot.RobotMap;

public class DriveArcade extends Command {
  public DriveArcade() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drivetrain);
  }

  //Stuff
  double finalPower = 0.6; //Actual power; change it here
  double currentPower = finalPower/4;
  int loopCount = 0;

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (loopCount == 0) {
      loopCount = 1;
    }
    else if (loopCount == 1) {
      loopCount = 2;
      currentPower = finalPower/2;
    }
    else if (loopCount == 2) {
      loopCount = 10;
      currentPower = finalPower;
    }
    Robot.drivetrain.driveJoystick(Robot.oi.getDriverController(), currentPower);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.drivetrain.arcadeDrive(0,0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
