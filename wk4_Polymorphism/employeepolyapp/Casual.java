public class Casual extends Employee{
    private double hours, rate;

    public Casual(String name, String id, String dob, double hours, double rate) {
        super(name, id, dob);
        this.hours = hours;
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nHours: " + hours + "\nRate: " + rate;
    }

    @Override
    public double computeWeeklySalary() {
        return hours*rate;
    }
}
