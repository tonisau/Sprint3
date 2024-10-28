package Tasca1.Nivell3;

import Tasca1.Nivell3.Commands.AccelerateCommand;
import Tasca1.Nivell3.Commands.BrakingCommand;
import Tasca1.Nivell3.Commands.Command;
import Tasca1.Nivell3.Commands.StartingCommand;
import Tasca1.Nivell3.Invoker.Invoker;
import Tasca1.Nivell3.Vehicles.*;

public class Parking {

    public static void start(){
        Invoker commands = new Invoker();

        executeOrders(commands, new Car());
        executeOrders(commands, new Bike());
        executeOrders(commands, new Plane());
        executeOrders(commands, new Ship());
    }

    public static void executeOrders(Invoker commands, Vehicle vehicle) {
        commands.setStart(new StartingCommand(vehicle));
        commands.setAccelerate(new AccelerateCommand(vehicle));
        commands.setBrake(new BrakingCommand(vehicle));

        commands.executeCommands();
    }

}
