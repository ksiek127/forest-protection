package com.environmentsimulation.Sensors;

import java.util.HashMap;
import java.util.Map;

public class SensorsMap {
    private static SensorsMap instance;
    private Map<String,SensorData> dataMap;

    private SensorsMap() {
        this.dataMap = new HashMap<>();
    }

    public static SensorsMap getInstance() {
        if (instance == null) {
            instance = new SensorsMap();
        }
        return instance;
    }

    public void uploadRecord(String key,SensorData data){
        if(this.dataMap.containsKey(key)){
            this.dataMap.remove(key);
        }
        this.dataMap.put(key,data);
    }
    public SensorData getRecord(String key){
        SensorData result = null;
        if(this.dataMap.containsKey(key)){
            result = this.dataMap.get(key);
        }
        return result;
    }
}
