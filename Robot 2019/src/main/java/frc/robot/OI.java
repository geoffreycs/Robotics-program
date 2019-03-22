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
import frc.robot.commands.SpIn;
import frc.robot.commands.SpOut;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public static final String driveController = null;

  public Joystick driverController = new Joystick(RobotMap.OI_DRIVE_CONTROLLER);
  public Joystick auxController = new Joystick(RobotMap.OI_AUX_CONTROLLER);



Button auxbutton12 = new JoystickButton(auxController, 11);
Button auxbutton11 = new JoystickButton(auxController, 12);
Button auxbutton2 = new JoystickButton(auxController, 2);
Button auxbutton1 = new JoystickButton(auxController, 1);
Button auxbutton10 = new JoystickButton(auxController, 10);
Button auxbutton9 = new JoystickButton(auxController, 9);
Button auxbutton3 = new JoystickButton(auxController, 3);
Button auxbutton4 = new JoystickButton(auxController, 4);


public Joystick getDriverController() {
  return driverController;
}

  public OI() {
    //button4 = new JoystickButton(driverController, 4);
    auxbutton11.whileHeld(new Up());
    //button1 = new JoystickButton(driverController, 1);
    auxbutton12.whileHeld(new Down());
    //button2 = new JoystickButton(driverController, 2);
    auxbutton2.whileHeld(new In());
    //button3 = new JoystickButton(driverController, 3);
    auxbutton1.whileHeld(new Out());
    //button10 = new JoystickButton(driverController, 10);
    auxbutton10.whileHeld(new SpIn());
    //button8 = new JoystickButton(driverController, 8);
    auxbutton9.whileHeld(new SpOut());
    auxbutton3.whileHeld(new DoublePunch(true));
    auxbutton4.whileHeld(new DoublePunch(false));



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

