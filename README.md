# Homework 8

1. **Streaming‑Service Binge Mode** (Iterator Pattern)
2. **Airport Tower Simulator** (Mediator Pattern)



## 📦 Part 1 – Iterator Pattern: "Streaming‑Service Binge Mode"

### ✅ Project Goal

Simulate a simplified Netflix-like streaming platform where:

- A series contains multiple seasons.
- Each season stores episodes differently (e.g., `ArrayList`, `LinkedList`, or custom storage).
- The UI should iterate over all episodes without knowing how they're stored.

### 🔧 Features

- Custom `EpisodeIterator` interface with:
  - `boolean hasNext()`
  - `Episode next()`
- Three concrete iterators:
  - `SeasonIterator` – normal order
  - `ReverseSeasonIterator` – reverse order
  - `ShuffleSeasonIterator` – random order with fixed seed
- `Season` implements `Iterable<Episode>`, enabling:
  ```java
  for (Episode e : season) {
      System.out.println(e.getTitle());
  }

🛫 Part 2 – Mediator Pattern: "Airport Tower Simulator"
✅ Project Goal
Simulate a real-world airport environment where multiple aircraft (passenger planes, cargo planes, helicopters) coordinate takeoffs and landings via a centralized Control Tower, rather than communicating directly.

🔧 Features
TowerMediator interface for communication control

Abstract class Aircraft with:

send() — broadcasts messages through the tower

receive() — processes incoming messages

Aircraft types:

PassengerPlane

CargoPlane

Helicopter

ControlTower (concrete mediator):

Maintains landing and takeoff queues

Prioritizes emergency aircraft (e.g., MAYDAY, low fuel)

Sends broadcast messages like "hold", "cleared for landing", etc.

Simulation.java:

Spawns 10 random aircraft with varying fuel levels

Sends requests every second using ScheduledExecutorService

Demonstrates normal traffic and emergency behavior in real time

🧠 Why Use Mediator Instead of Direct Communication
Advantages:

Decouples aircraft from each other

Centralizes coordination logic in a single place (ControlTower)

Easily handles complex rules (e.g., emergency handling)


