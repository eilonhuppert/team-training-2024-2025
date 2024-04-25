// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Command.ClimbCommand;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.Climb.ClimbSubsystem;

public class ClimbSetSpeed extends Command {

  ClimbSubsystem climb = ClimbSubsystem.getInstance();
  Double speed;
  /** Creates a new ClimbSetSpeed. */
  public ClimbSetSpeed(double speed) {
    addRequirements(climb);
    this.speed = speed;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    climb.setSpeed(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    climb.setSpeed(0);
  }

}
