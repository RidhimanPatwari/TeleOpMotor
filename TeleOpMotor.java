package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "TeleOpMotor 1 (Java)")
public class TeleOpMotor extends LinearOpMode {

  private DcMotor Motor0;
  private DcMotor Motor1;
  private DcMotor Motor2;
  private DcMotor Motor3;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    Motor0 = hardwareMap.get(DcMotor.class, "Motor  0");
    Motor1 = hardwareMap.get(DcMotor.class, "Motor 1");
    Motor2 = hardwareMap.get(DcMotor.class, "Motor 2");
    Motor3 = hardwareMap.get(DcMotor.class, "Motor 3");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        //forward... backward... (weird voice)
        Motor0.setDirection(DcMotorSimple.Direction.FORWARD);
        Motor0.setPower(gamepad1.left_stick_y/2);
        Motor1.setDirection(DcMotorSimple.Direction.FORWARD);
        Motor1.setPower(gamepad1.left_stick_y/2);
        Motor2.setDirection(DcMotorSimple.Direction.REVERSE);
        Motor2.setPower(gamepad1.left_stick_y/2);
        Motor3.setDirection(DcMotorSimple.Direction.REVERSE);
        Motor3.setPower(gamepad1.left_stick_y/2);
        
        
        //right... left... (also weird voice)
        Motor0.setDirection(DcMotorSimple.Direction.FORWARD);
        Motor0.setPower(gamepad1.right_stick_x/2);
        Motor1.setDirection(DcMotorSimple.Direction.REVERSE);
        Motor1.setPower(gamepad1.right_stick_x/2);
        Motor2.setDirection(DcMotorSimple.Direction.REVERSE);
        Motor2.setPower(gamepad1.right_stick_x/2);
        Motor3.setDirection(DcMotorSimple.Direction.FORWARD);
        Motor3.setPower(gamepad1.right_stick_x/2);
        
        telemetry.update();
      }
    }
  }
}
