package Tasca1.Nivell3.Commands;

import Tasca1.Nivell3.Vehicles.Vehicle;

public class AccelerateCommand implements Command {
    private Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }


}
