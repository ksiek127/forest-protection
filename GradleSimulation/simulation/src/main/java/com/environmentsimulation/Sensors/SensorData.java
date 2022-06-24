package com.environmentsimulation.Sensors;


import com.environmentsimulation.Simulation.Engine.SimulationDirection;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SensorData {

    private Double value;
    private final SensorType type;
    private SimulationDirection direction = null;

    public SensorData(
            @JsonProperty("type") SensorType type,
            @JsonProperty("value")Double value,
            @JsonProperty("direction") SimulationDirection direction){
        this.type = type;
        this.value = value;
        this.direction = direction;
    }

    public SensorData(SensorType type,Double value){
        this.type = type;
        this.value = value;
    }

    public Double getValue(){
        return this.value;
    }

    public void setValue(double value){
        this.value = value;
    }

    public SensorType getType(){
        return type;
    }

    public void setDirection(SimulationDirection direction) {
        this.direction = direction;
    }

    public SimulationDirection getDirection() {
        return direction;
    }
}
