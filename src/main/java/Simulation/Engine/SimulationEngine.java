package Simulation.Engine;

public class SimulationEngine extends Thread{
    //Simulation is working as 1 agent with 2 threads -> communicator and simulation engine
    // Communicator -> collects information about sectors which are putted out by firefighters
    // and adds it to Simulation queue
    // Simulation engine -> first reads data from SimulationConfiguration
    // and creates environment -> SimulationMap, then starts a loop in which
    //todo
    // 0-> checks if should end (if not)
    // 1-> gets next environment global parameters
    // 2-> resolves next state of Sectors
    // 3-> resolves SimulationQueue -> if Firefighters done something
    // 4-> go to next Epoch
    // 5-> go to sleep (depends for how long due to map scale)

    @Override
    public void run() {
        //
    }
}
