package Part2;

class Helicopter extends Aircraft {
    public Helicopter(String id) {
        super(id);
    }

    public void receive(String msg) {
        System.out.println("Helicopter " + getId() + " received: " + msg);
    }
}