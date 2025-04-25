package Part2;

public class Main2 {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();

        Aircraft passenger1 = new PassengerPlane("Passenger1");
        Aircraft cargo1 = new CargoPlane("Cargo1");
        Aircraft helicopter1 = new Helicopter("Helicopter1");

        tower.requestRunway(passenger1);
        tower.requestRunway(cargo1);
        tower.requestRunway(helicopter1);

        tower.simulate();

        passenger1.send("MAYDAY", tower);
    }
}
