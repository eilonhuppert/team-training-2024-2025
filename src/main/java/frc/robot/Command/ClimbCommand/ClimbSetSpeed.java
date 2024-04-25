/**
 * This command lets you control the speed of both climb arms.
 * @author: yair
 * @Version 1.0.1
 */
package frc.robot.Command.ClimbCommand;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.Climb.ClimbSubsystem;

public class ClimbSetSpeed extends Command {

  ClimbSubsystem climb = ClimbSubsystem.getInstance();
  private DoubleSupplier _speed;
  /** Creates a new ClimbSetSpeed. */
  public ClimbSetSpeed(DoubleSupplier speed) {
    addRequirements(climb);
     _speed = speed;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    climb.setSpeed(_speed.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    climb.setSpeed(0);
  }

}
