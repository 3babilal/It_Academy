package Sprint3.Tasca1.Nivel3.Command;

import Sprint3.Tasca1.Nivel3.Vehicle.Vehicle;

public class Accelerate implements Command {
    private Vehicle vehicle;

    public Accelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
