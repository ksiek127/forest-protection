package com.environmentsimulation.Sensors;


import com.environmentsimulation.Simulation.Engine.SimulationMap;

public class Sensor extends Thread {

    private SensorData data;
    private final int x;
    private final int y;
    private final SensorType type;
    private final String key;

    private boolean isRunning = true;

    private SensorsMap sensorsMap = SensorsMap.getInstance();
    private SimulationMap simulationMap = SimulationMap.getInstance();

    public Sensor(int x, int y,SensorData data){
        this.data = data;
        this.x = x;
        this.y = y;
        this.type = data.getType();
        this.key = x + "/" + y + "/" + type;
    }
    public Sensor(int x, int y){
        this.x = x;
        this.y = y;
        this.type = data.getType();
        this.key = x + "/" + y + "/" + type;
        updateData();
    }

    private void killSensor(){
        this.isRunning = false;
    }

    private void updateData(){
        //this.data = this.simulationMap.(this.x,this.y,this.type);
    }

    @Override
    public void run() {
        while(this.isRunning){
            sensorsMap.uploadRecord(this.key,this.data);
            try {
                sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            updateData();
        }
    }

}
