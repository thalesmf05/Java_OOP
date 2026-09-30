public class booking {
    protected String name, start_date;
    protected int duration;

    public booking(String name, String start_date, int duration) {
        this.name = name;
        this.start_date = start_date;
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
