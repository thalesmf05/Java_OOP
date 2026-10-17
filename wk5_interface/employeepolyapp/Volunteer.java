public class Volunteer extends Employee implements Trainable{
    private double hoursDonate;

    public Volunteer(String name, String id, String dob, double hoursDonate) {
        super(name, id, dob);
        this.hoursDonate = hoursDonate;
    }

    public double getHoursDonate() {
        return hoursDonate;
    }

    public void setHoursDonate(double hoursDonate) {
        this.hoursDonate = hoursDonate;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + "\nHours Donated: " + hoursDonate;
    }

    @Override
    public void attendedTraining(String name) {

    }
}
