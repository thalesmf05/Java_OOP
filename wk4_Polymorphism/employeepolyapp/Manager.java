public class Manager extends Employee{
    private double salary;

    public Manager(String name, String id, String dob, double salary) {
        super(name, id, dob);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + "\nSalary: " + salary;
    }

    @Override
    public double computeWeeklySalary() {
        return salary/52;
    }
}
