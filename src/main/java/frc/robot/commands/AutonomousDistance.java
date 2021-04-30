// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    final double turnSpeed = 0.4; 
    final double moveSpeed = 0.7;
    addCommands(
        new DriveDistance(moveSpeed, 12, drivetrain),
        new TurnDegrees(-turnSpeed, 86, drivetrain),
        new DriveDistance(moveSpeed, 12, drivetrain),
		    new TurnDegrees(turnSpeed, 152, drivetrain),
		    new DriveDistance(moveSpeed, 26,drivetrain),
        new TurnDegrees(-turnSpeed, 67,drivetrain),
        new DriveDistance(moveSpeed,8.5,drivetrain),
        new TurnDegrees(-turnSpeed, 88,drivetrain),
        new DriveDistance(moveSpeed,25,drivetrain),
        new TurnDegrees(turnSpeed, 170,drivetrain),
        new DriveDistance(moveSpeed,26,drivetrain),
        new TurnDegrees(-turnSpeed, 91,drivetrain),
        new DriveDistance(moveSpeed,18,drivetrain),
        new TurnDegrees(-turnSpeed, 86,drivetrain),
        new DriveDistance(moveSpeed,26,drivetrain),
        new TurnDegrees(0.5, 160, drivetrain),
        new DriveDistance(moveSpeed, 9, drivetrain),
        new TurnDegrees(-turnSpeed, 75,drivetrain),
        new DriveDistance(1,8.5,drivetrain),
        new TurnDegrees(-turnSpeed,0,drivetrain));
  }
}
