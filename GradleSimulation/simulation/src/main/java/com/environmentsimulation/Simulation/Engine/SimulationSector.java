package com.environmentsimulation.Simulation.Engine;



import com.environmentsimulation.Simulation.Engine.Sectors.SectorState;
import com.environmentsimulation.Simulation.Engine.Sectors.SectorType;

import java.util.HashMap;

public class SimulationSector {

    private SectorState currentState;
    private SectorState nextState;
    private HashMap<SimulationDirection,SimulationSector> neighbours = new HashMap<>();
    private int neighboursSize = 0;
    private final SectorType type;
    private final double typeMultiplayer;


    public SimulationSector(SectorState firstState, SectorType type){
        this.currentState = new SectorState(firstState);
        this.nextState = firstState;
        this.type = type;
        this.typeMultiplayer = SectorType.getFlammability(type);
    }
    public SimulationSector(){
        this.currentState = new SectorState();
        this.nextState = new SectorState();
        this.type = SectorType.CONIFEROUS;
        this.typeMultiplayer = SectorType.getFlammability(type);
    }

    public void addNeighbour(SimulationDirection direction,SimulationSector sector){
        this.neighbours.put(direction,sector);
        neighboursSize += 1;
    }


    public void getNextState(){
        for (SimulationDirection direction: neighbours.keySet()) {
            neighbours.get(direction);
        }
    }

    public void goToNextEpoch(){
        //todo check
        this.currentState = new SectorState(nextState);
    }

    private void resolveNeighbour(SimulationSector neighbour, SimulationDirection direction){
        this.nextState.resolve(neighbour,direction,this.neighboursSize,this.typeMultiplayer);
    }

    public SectorState getCurrentState() {
        return currentState;
    }

    public SectorType getType() {
        return type;
    }
}
