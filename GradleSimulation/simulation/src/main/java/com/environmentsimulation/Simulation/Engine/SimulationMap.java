package com.environmentsimulation.Simulation.Engine;

import com.environmentsimulation.Simulation.Engine.Sectors.SectorType;

import java.util.Arrays;

public class SimulationMap {
    private static SimulationMap instance;
    private int width;
    private int height;
    private int scale;
    private SimulationSector[][] sectors;

    private SimulationMap(int x,int y,int scale) {
        this.width = x;
        this.height = y;
        this.scale = scale;
        sectors = new SimulationSector[x][y];
        generateSectors();
        setUnused();
        setNeighborhoods();
    }

    public static SimulationMap getInstance(int width, int height, int scale) {
        if (instance == null) {
            instance = new SimulationMap(width,height,scale);
        }
        return instance;
    }
    public static SimulationMap getInstance() {
        if (instance == null) {
            return null;
        }
        return instance;
    }

    private void generateSectors(){
        Arrays.stream(this.sectors).
                forEach(x -> Arrays.stream(x).
                        forEach(y -> y = new SimulationSector()));
    }

    private void setUnused(){
        //todo
    }

    private void setNeighborhoods(){
        for(int x=0;x < this.width;x+=1){
            for(int y=0;y < this.height;y+=1){
                setNeighborhood(this.sectors[x][y],x-1,y-1,x,y);
            }

        }
    }

    private void setNeighborhood(SimulationSector sector,int x,int y,int sectorX,int sectorY){
        for(int i=x;i < x+2;i+=1){
            for(int j=y;j<y+2;j+=1){
                if(!outOfMap(i,j) &&
                        !sectors[i][j].getType().equals(SectorType.FALLOW)
                        && !(i == sectorX && j == sectorY)){
                    sector.
                            addNeighbour(SimulationDirection.
                                    getDirectionTo(sectorX,sectorY,i,j),sectors[i][j]);
                }
            }
        }
    }

    private boolean outOfMap(int x,int y){
        if(x >= 0 && x < this.width && y >= 0 && y <= this.height){
            return true;
        }
        return false;
    }

    public void solveStates() {
        Arrays.stream(this.sectors).forEach(x -> Arrays.stream(x).forEach(y -> y.getNextState()));
    }

    public void goToNextEpoch() {
        Arrays.stream(this.sectors).forEach(x -> Arrays.stream(x).forEach(y -> y.goToNextEpoch()));
    }

    public int getScale() {
        return scale;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
