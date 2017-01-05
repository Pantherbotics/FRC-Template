package org.pantherbotics.frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.pantherbotics.frc.OperatorInterface;

/**
 * Created by Joshua Freedman on 1/5/2017.
 * Project: FRC Template
 */
public abstract class BaseCommand extends Command {

    public static OperatorInterface OPERATOR_INTERFACE;

    public static void init() {
        OPERATOR_INTERFACE = new OperatorInterface();
    }
}
