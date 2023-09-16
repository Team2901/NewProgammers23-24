package org.firstinspires.ftc.teamcode.autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
@Autonomous(name = "Drew Gardner First Auto", group = "Outreach")
public class DrewGardnerFirstAuto extends AbstractAutonomous{
    /** @noinspection UnresolvedClassReferenceRepair*/
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(this.hardwareMap);
        waitForStart();
    }
}