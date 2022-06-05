package Simulation.Engine;

public enum SimulationDirection {
    N, NE, E, SE, S, SW, W, NW;

    public static SimulationDirection getOppositeDirection(SimulationDirection direction){
        SimulationDirection result;
        switch(direction){
            case N -> result = S;
            case NE-> result = SW;
            case E-> result = W;
            case SE-> result = NW;
            case S-> result = N;
            case SW-> result = NE;
            case W-> result = E;
            case NW -> result = SE;
            default -> {
                System.out.println("BAD SIMULATIONDIRE4CTION!!!! SETTING TO N");
                result = N;
            }
        }
        return result;
    }
}
