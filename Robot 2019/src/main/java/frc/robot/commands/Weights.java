/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Weights extends Command {

  // True direction indicates "punching," false indicates retracting
  // of the solenoid
  boolean direction = true;

  public Weights(boolean direction) {
    this.direction = direction;
  }

  // Making sure the solenoid is not already moving before
  // executing the punch/retract
  @Override
  protected void initialize() {

    Robot.punch.doubleIdle();
  }

  // Takes in the boolean from the constructor to punch or retract
  @Override
  protected void execute() {
    if(direction){
      Robot.LiftW.Weights();
    }else{
      Robot.LiftW.Down();
    }
  }

  // Returns true immediately so execute only runs once
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Ensures that the solenoid does not continue to move
  @Override
  protected void end() {
    Robot.punch.doubleIdle();
  }

  // Ends the command in case of interruption
  @Override
  protected void interrupted() {
    end();
  }
}