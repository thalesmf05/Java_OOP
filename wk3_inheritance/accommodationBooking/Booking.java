public class Booking {
    protected String name, startDate;
    protected int duration;

    public Booking(String name, String start_date, int duration) {
        this.name = name;
        this.startDate = start_date;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFinalBooking(){
        return "Booking Information" +
                "\nName: " + name +
                "\nStart date: " + startDate +
                "\nDuration: " + duration;
    }

    public void calculatePrice(){
    }

}
