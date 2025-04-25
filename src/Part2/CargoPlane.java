package Part2;

class CargoPlane extends Aircraft {
    public CargoPlane(String id) {
        super(id);
    }

    public void receive(String msg) {
        System.out.println("CargoPlane " + getId() + " received: " + msg);
    }
}
