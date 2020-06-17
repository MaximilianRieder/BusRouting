import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        DataPreProcessor dataPreProcessor = new DataPreProcessor();
        RoutingData rawRoutingData = dataPreProcessor.getRawRoutingData();
        RoutingDataProcessed routingDataProcessed = dataPreProcessor.preProcess(rawRoutingData);
        RoutingSolverSetup routingSolverSetup = new RoutingSolverSetup(routingDataProcessed);
        routingSolverSetup.setup();
    }
}
