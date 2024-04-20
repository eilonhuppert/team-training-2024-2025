/**this subsystem is responsible for climbing 
 * @author: yair
 * @Version 2.0.0
*/

package frc.robot.Subsystem.Climb;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ClimbSubsystem extends SubsystemBase implements ClimbConstants{
  private CANSparkMax m_rightMotor;
  private static ClimbSubsystem instance;
  private CANSparkMax m_leftMotor;

  public static ClimbSubsystem getInstance(){
    if (instance == null)
      instance = new ClimbSubsystem();
    return instance;
  }
  /** Creates a new ClimbSubsystem. */
  private ClimbSubsystem() {
    m_rightMotor = new CANSparkMax(CANSPARK_MAX_RIGHT_MOTOR_ID,  MotorType.kBrushless);
    m_leftMotor = new CANSparkMax(CANSPARK_MAX_LEFT_MOTOR_ID,  MotorType.kBrushless);

    m_rightMotor.setInverted(false);
    m_leftMotor.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
/**
 * sets the speed for both motors
 * @param speed is a value between -1 and 1 depanding on the the position of the arms
 */
  public void setSpeed(double speed) {
    m_rightMotor.set(speed);
    m_leftMotor.set(speed);
  }
/**
 * sets the speed for the right motor
 * @param speed is a value between -1 and 1 depanding on the the position of the arms
 */
  public void setRightSpeed(double speed) {
    m_rightMotor.set(speed);
  }
/**
 * sets the speed for the left motor
 * @param speed is a value between -1 and 1 depanding on the the position of the arms
 */
  public void setLeftSpeed(double speed) {
    m_leftMotor.set(speed);
  }
}
