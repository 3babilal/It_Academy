package Sprint3.Tasca1.Nivel3.Command;

import Sprint3.Tasca1.Nivel3.Vehicle.Vehicle;

public class Stop implements Command{
    Vehicle vehicle;

    public Stop(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.stop();
    }
}
