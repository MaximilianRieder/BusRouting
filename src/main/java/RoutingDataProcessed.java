import tech.tablesaw.api.Table;

public class RoutingDataProcessed extends RoutingData{
    private Table rideTimetable;
    private Table rideEvents;

    public RoutingDataProcessed(Table locationInfo, Table scheduleData, Table lineCourses, Table drivingTimes, Table rideTimetable, Table rideEvents) {
        super(locationInfo, scheduleData, lineCourses, drivingTimes);
        this.rideTimetable = rideTimetable;
        this.rideEvents = rideEvents;
    }

    public Table getRideTimetable() {
        return rideTimetable;
    }

    public void setRideTimetable(Table rideTimetable) {
        this.rideTimetable = rideTimetable;
    }

    public Table getRideEvents() {
        return rideEvents;
    }

    public void setRideEvents(Table rideEvents) {
        this.rideEvents = rideEvents;
    }
}
