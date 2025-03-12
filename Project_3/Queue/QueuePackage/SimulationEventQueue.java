package QueuePackage;

import java.util.PriorityQueue;
import java.util.Queue;

public class SimulationEventQueue implements SimulationEventQueueInterface {

    private double simulationTime;
    private PriorityQueue<SimulationEvent> queue;

    public SimulationEventQueue() {
        queue = new PriorityQueue<>((e1,e2) -> Double.compare(e1.getTime(), e2.getTime()));
        simulationTime = 0.0;
    }
    @Override
    public void add(SimulationEvent event) {
        if (event.getTime() < simulationTime) {
            System.out.println("ERROR: Trying to add an event in the past!");
            return;
        }

        queue.add(event);
        System.out.println("Added event: " + event.getDescription() + " at time " + event.getTime());
    }

    @Override
    public SimulationEvent remove() {
        if (queue.isEmpty()) {
            System.out.println("ERROR: Tried to remove event, but queue is empty!");
            return null;
        }

        SimulationEvent event = queue.poll(); // Use queue.remove() if poll() isn't available
        System.out.println("Removed event: " + event.getDescription() + " at time " + event.getTime());

        return event;
    }

    @Override
    public SimulationEvent peek() {
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int getSize() {
        return queue.size();
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public double getCurrentTime() {
        return simulationTime;
    }
}
