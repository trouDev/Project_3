package QueuePackage;

public class SimulationEventQueue implements SimulationEventQueueInterface {

    private float simulationTime;
    private SimulationEvent[] queue;
    @Override
    public void add(SimulationEvent newEntry) {

    }

    @Override
    public SimulationEvent remove() {

        return null;
    }

    @Override
    public SimulationEvent peek() {

        return null;
    }

    @Override
    public boolean isEmpty() {

        return true;
    }

    @Override
    public int getSize() {

        return -1;
    }

    @Override
    public void clear() {

    }

    @Override
    public double getCurrentTime() {

        return -1.1;
    }
}
