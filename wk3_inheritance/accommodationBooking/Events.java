public class Events implements Payable{
    private String eventTitle, clientName, startTime;
    private double durationHours, bookingPrice;
    final int hourlyChargeBooking = 125;

    public Events(String eventTitle, String clientName, String startTime, double durationHours) {
        this.eventTitle = eventTitle;
        this.clientName = clientName;
        this.startTime = startTime;
        this.durationHours = durationHours;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public double getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(double durationHours) {
        this.durationHours = durationHours;
    }

    public String getFinalBooking(){
        return "Title: " + eventTitle +
                "\nClient Name: " + clientName +
                "\nStart Time: " + startTime +
                "\nDuration: " + durationHours + " hours" +
                "\nBooking Price: " + bookingPrice;
    }

    @Override
    public void computeFee() {
        bookingPrice =  durationHours * hourlyChargeBooking;
    }
}
