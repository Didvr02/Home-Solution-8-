package Part2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ControlTower implements TowerMediator {
    private Queue<Aircraft> landingQueue = new LinkedList<>();
    private Queue<Aircraft> takeOffQueue = new LinkedList<>();
    private boolean runwayAvailable = true;

    public void broadcast(String msg, Aircraft sender) {
        System.out.println(sender.getId() + " sends: " + msg);
        if (msg.equals("MAYDAY")) {
            emergencyLanding(sender);
        }
    }

    public boolean requestRunway(Aircraft a) {
        if (a instanceof PassengerPlane) {
            landingQueue.offer(a);
        } else if (a instanceof CargoPlane) {
            takeOffQueue.offer(a);
        }
        return true;
    }

    public void emergencyLanding(Aircraft a) {
        System.out.println("Emergency landing for: " + a.getId());
        landingQueue.clear();
        runwayAvailable = true;
    }

    public void simulate() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> {
            if (!landingQueue.isEmpty() && runwayAvailable) {
                Aircraft aircraft = landingQueue.poll();
                System.out.println(aircraft.getId() + " landing...");
            }
            if (!takeOffQueue.isEmpty() && runwayAvailable) {
                Aircraft aircraft = takeOffQueue.poll();
                System.out.println(aircraft.getId() + " taking off...");
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
}
