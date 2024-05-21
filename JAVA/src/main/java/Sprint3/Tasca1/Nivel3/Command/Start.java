package Sprint3.Tasca1.Nivel3.Command;

import Sprint3.Tasca1.Nivel3.Vehicle.Vehicle;

public class Start implements Command{
    Vehicle vehicle;

    public Start(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}
