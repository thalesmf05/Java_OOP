public class Employee {
    protected String name, id, dob;

    public Employee(String name, String id, String dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDetails(){
        return "Name: " + name + "\nId: " + id + "\nDOB: " + dob + "%";
    }

    public double computeWeeklySalary(){
        return 0;
    }
}
