/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.DoublePunch;
import frc.robot.commands.Down;
import frc.robot.commands.In;
import frc.robot.commands.Out;
import frc.robot.commands.Up;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public static final String driveController = null;

  public Joystick driverController = new Joystick(RobotMap.OI_DRIVE_CONTROLLER);

Button button1 = new JoystickButton(driverController, 1);
Button button4 = new JoystickButton(driverController, 4);
Button button2 = new JoystickButton(driverController, 2);
Button button3 = new JoystickButton(driverController, 3);
JoystickButton doublePunch = new JoystickButton(driverController, 5);
JoystickButton doubleRetract = new JoystickButton(driverController, 6);

public Joystick getDriverController() {
  return driverController;
}

  public OI() {
    button4 = new JoystickButton(driverController, 4);
    button4.whileHeld(new Up());
    button1 = new JoystickButton(driverController, 1);
    button1.whileHeld(new Down());
    button2 = new JoystickButton(driverController, 2);
    button2.whileHeld(new In());
    button3 = new JoystickButton(driverController, 3);
    button3.whileHeld(new Out());
    doublePunch.whileHeld(new DoublePunch(true));
    doubleRetract.whileHeld(new DoublePunch(false));



  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);

  }

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}

