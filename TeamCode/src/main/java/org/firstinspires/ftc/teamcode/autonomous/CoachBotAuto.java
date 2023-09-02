package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.hardware.CoachBot;

public class CoachBotAuto extends LinearOpMode {
    CoachBot robot;
    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(this.hardwareMap);
        double wheelCircumferenceInches = 2*Math.PI* robot.WHEEL_RADIUS;
        double targetDistanceInches = 10*12;
        double targetTicks = targetDistanceInches* robot.TICKS_PER_REV_WHEEL/wheelCircumferenceInches;
        robot.goldMotor.setTargetPosition((int) targetTicks);
        robot.greenMotor.setTargetPosition((int) targetTicks);
        robot.goldMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.greenMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.goldMotor.setPower(0.5);
        robot.greenMotor.setPower(0.5);
    }
}
