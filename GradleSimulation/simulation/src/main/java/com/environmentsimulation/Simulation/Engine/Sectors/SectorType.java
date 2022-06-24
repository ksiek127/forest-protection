package com.environmentsimulation.Simulation.Engine.Sectors;

public enum SectorType {
    DECIDUOUS, MIXED, CONIFEROUS, FIELD, FALLOW;

    public static double getFlammability(SectorType type) {
        double result;
        switch (type){
            case FIELD -> result = 1;
            case MIXED -> result = 0.7;
            case CONIFEROUS -> result = 0.8;
            case DECIDUOUS -> result = 0.6;
            default -> result = 0;
        }
        return result;
    }

    public static SectorType getType(String typeName){
        SectorType result;
        switch (typeName){
            case "filed" -> result = FIELD;
            case "mixed" -> result = MIXED;
            case "coniferous" -> result = CONIFEROUS;
            case "deciduous" -> result = DECIDUOUS;
            case "fallow" -> result = FALLOW;
            default -> {
                System.out.println("BAD TYPE NAME!!!! SETTING TYPE TO FALLOW");
                result = FALLOW;
            }
        }
        return result;
    }
}

