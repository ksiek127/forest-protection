package com.environmentsimulation.Sensors.SpringComponents;


import com.environmentsimulation.Sensors.SensorData;
import com.environmentsimulation.Sensors.SensorsMap;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/sensor")
public class SensorsController {
    private final SensorsMap dataMap = SensorsMap.getInstance();


    @GetMapping("/{x}/{y}/{type}")
    @ResponseBody
    public SensorData getSensorData(@PathVariable String x, @PathVariable String y, @PathVariable String type){
        String key = x + "/" + y + "/" + type;
        System.out.println("Getting Sensor Data from: " + key);
        SensorData requestedData = null;
        try{
            requestedData = this.dataMap.getRecord(x + "/" + y + "/" + type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return requestedData;
    }
}

