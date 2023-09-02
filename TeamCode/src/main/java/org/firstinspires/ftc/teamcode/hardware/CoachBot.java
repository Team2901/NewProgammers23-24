package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class CoachBot {
    public int TICKS_PER_REV_WHEEL = 1440;
    public int WHEEL_RADIUS = 0;
    public DcMotor goldMotor;
    public DcMotor greenMotor;

    public void init(HardwareMap hardwareMap) {
        goldMotor = hardwareMap.get(DcMotor.class, "gold");
        greenMotor = hardwareMap.get(DcMotor.class, "green");
        goldMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }
}
