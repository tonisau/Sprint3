package Tasca1.Nivell3.Commands;

import Tasca1.Nivell3.Vehicles.Vehicle;

public class BrakingCommand implements Command {
    private Vehicle vehicle;

    public BrakingCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.brake();
    }
}
