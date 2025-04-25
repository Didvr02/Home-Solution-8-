package Part2;

abstract class Aircraft {
    protected String id;

    public Aircraft(String id) {
        this.id = id;
    }

    public abstract void receive(String msg);

    public void send(String msg, TowerMediator m) {
        m.broadcast(msg, this);
    }

    public String getId() {
        return id;
    }
}
