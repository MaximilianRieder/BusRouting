import tech.tablesaw.api.Table;

public class RoutingData {
    private Table locationInfo; //REC_ORT
    private Table scheduleData; //REC_FRT
    private Table lineCourses; //LID_VERLAUF
    private Table drivingTimes; //SEL_FZT_FELD


    public RoutingData(Table locationInfo, Table scheduleData, Table lineCourses, Table drivingTimes) {
        this.locationInfo = locationInfo;
        this.scheduleData = scheduleData;
        this.lineCourses = lineCourses;
        this.drivingTimes = drivingTimes;
    }


    public Table getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(Table locationInfo) {
        this.locationInfo = locationInfo;
    }

    public Table getScheduleData() {
        return scheduleData;
    }

    public void setScheduleData(Table scheduleData) {
        this.scheduleData = scheduleData;
    }

    public Table getLineCourses() {
        return lineCourses;
    }

    public void setLineCourses(Table lineCourses) {
        this.lineCourses = lineCourses;
    }

    public Table getDrivingTimes() {
        return drivingTimes;
    }

    public void setDrivingTimes(Table drivingTimes) {
        this.drivingTimes = drivingTimes;
    }
}
