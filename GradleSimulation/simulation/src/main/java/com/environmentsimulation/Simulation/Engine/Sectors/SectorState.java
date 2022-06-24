package com.environmentsimulation.Simulation.Engine.Sectors;


import com.environmentsimulation.Simulation.Engine.SimulationDirection;
import com.environmentsimulation.Simulation.Engine.SimulationSector;

public class SectorState {
    //todo setting accurate parameters levels
    // (we are doing form 0 to 100 or natural parameters)
    private int temperatureLevel = 0;
    private int smokeLevel = 0;
    private int airHumidityLevel = 50;
    private int litterHumidityLevel = 50;
    private SimulationDirection windDirection = SimulationDirection.N;
    private int CO2level = 0;
    private int aerosolsLevel = 0;

    public SectorState(int temperatureLevel,int smokeLevel,int airHumidityLevel,int litterHumidityLevel,String windDirection,int CO2level,int aerosolsLevel){
        this.temperatureLevel = temperatureLevel;
        this.smokeLevel = smokeLevel;
        this.airHumidityLevel = airHumidityLevel;
        this.litterHumidityLevel = litterHumidityLevel;
        //todo check
        this.windDirection = SimulationDirection.valueOf(windDirection);
        //todo check
        this.CO2level = CO2level;
        this.aerosolsLevel = aerosolsLevel;
    }
    public SectorState(SectorState firstState) {
        this.temperatureLevel = firstState.getTemperatureLevel();
        this.smokeLevel = firstState.getSmokeLevel();
        this.airHumidityLevel = firstState.getAirHumidityLevel();
        this.litterHumidityLevel = firstState.getLitterHumidityLevel();
        this.windDirection = firstState.getWindDirection();
        this.CO2level = firstState.getCO2level();
        this.aerosolsLevel = firstState.getAerosolsLevel();
    }
    public SectorState() {

    }



    public int getSmokeLevel() {
        return smokeLevel;
    }

    public void setSmokeLevel(int smokeLevel) {
        this.smokeLevel = smokeLevel;
    }

    public int getAirHumidityLevel() {
        return airHumidityLevel;
    }

    public void setAirHumidityLevel(int airHumidityLevel) {
        this.airHumidityLevel = airHumidityLevel;
    }

    public int getLitterHumidityLevel() {
        return litterHumidityLevel;
    }

    public void setLitterHumidityLevel(int litterHumidityLevel) {
        this.litterHumidityLevel = litterHumidityLevel;
    }

    public int getTemperatureLevel() {
        return temperatureLevel;
    }

    public void setTemperatureLevel(int temperatureLevel) {
        this.temperatureLevel = temperatureLevel;
    }

    public SimulationDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(SimulationDirection windDirection) {
        this.windDirection = windDirection;
    }

    public int getCO2level() {
        return CO2level;
    }

    public void setCO2level(int CO2level) {
        this.CO2level = CO2level;
    }

    public int getAerosolsLevel() {
        return aerosolsLevel;
    }

    public void setAerosolsLevel(int aerosolsLevel) {
        this.aerosolsLevel = aerosolsLevel;
    }

    public void resolve(SimulationSector neighbour, SimulationDirection direction, int neighboursSize, double typeMultiplayer) {
    //todo resolving this state do to parameters
    }
}
