import tech.tablesaw.api.IntColumn;

public class RoutingSolverSetup {
    private RoutingDataProcessed routingDataProcessed;

    public RoutingSolverSetup(RoutingDataProcessed routingDataProcessed) {
        this.routingDataProcessed = routingDataProcessed;
    }

    public void setup() {
        //TODO: unique doesnt keep the order -> is order needed?
        IntColumn centralBusStop = routingDataProcessed.getLocationInfo().intColumn("ORT_REF_ORT").unique();
        IntColumn stoppingPointNode = routingDataProcessed.getLineCourses().intColumn("ORT_NR").unique();

        //all nodes
        IntColumn allNodes = centralBusStop.append(stoppingPointNode);
        System.out.println(routingDataProcessed.getLocationInfo().intColumn("ORT_REF_ORT").unique().print());
    }


}
