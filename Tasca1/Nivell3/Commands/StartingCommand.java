package Tasca1.Nivell3.Commands;

import Tasca1.Nivell3.Vehicles.Vehicle;

public class StartingCommand implements Command {
    private Vehicle vehicle;

    public StartingCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void execute() {
        vehicle.start();
    }
}
