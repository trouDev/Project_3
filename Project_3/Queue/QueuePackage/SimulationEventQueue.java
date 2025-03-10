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
    public void add(SimulationEvent newEntry) {
        if (newEntry.getTime() >= simulationTime) {
            queue.add(newEntry);
        }
    }

    @Override
    public SimulationEvent remove() {
        SimulationEvent next = queue.poll();
        if (next != null) {
            simulationTime = next.getTime();
        }
        return next;
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
