package com.environmentsimulation.ConfigurationTranslator;

import com.environmentsimulation.Simulation.Engine.SimulationMap;

public class ConfigurationSpecification {
    private static ConfigurationSpecification instance;
    private final int width;
    private final int height;
    private final int scale;

    private ConfigurationSpecification(int x,int y,int scale) {
        this.width = x;
        this.height = y;
        this.scale = scale;
    }

    public static ConfigurationSpecification getInstance() {
        if (instance == null) {
            return null;
        }
        return instance;
    }
    public static ConfigurationSpecification getInstance(int x,int y,int scale) {
        if (instance == null) {
            instance = new ConfigurationSpecification(x,y,scale);
            return null;
        }
        return instance;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getScale() {
        return scale;
    }

}
