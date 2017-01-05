package org.pantherbotics.frc;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.pantherbotics.frc.commands.BaseCommand;

/**
 * Created by Joshua Freedman on 1/5/2017.
 * Project: FRC Template
 */
public class Robot extends IterativeRobot {

    @Override
    public void robotInit() {
        BaseCommand.init();
    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void autonomousInit() {
    }

    @Override
    public void teleopInit() {
        super.teleopInit();
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}
