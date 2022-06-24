package com.environmentsimulation.Simulation.Engine.Tasks;

import java.util.LinkedList;
import java.util.List;

public class SimulationTaskQueue {
    private static SimulationTaskQueue instance;
    private List<SimulationTask> taskList;

    private SimulationTaskQueue() {
    this.taskList = new LinkedList<>();
    }

    public static SimulationTaskQueue getInstance() {
        if (instance == null) {
            instance = new SimulationTaskQueue();
        }
        return instance;
    }

    public void addTask(SimulationTask task){
        taskList.add(task);
    }

    public List<SimulationTask> transferList(){
        //todo
        return null;
    }
}
