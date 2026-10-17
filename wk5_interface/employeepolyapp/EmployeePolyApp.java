public class EmployeePolyApp {
    public static void main(String[] args) {
        Manager m= new Manager( "John", "123", "12/12/2000", 100000);
        System.out.println(m.getDetails());
        System.out.println("Pay: " + m.computePay());
        m.attendedTraining("Health and Saftey");

        Casual c = new Casual("Joan","456", "11/11/2000", 20, 14.15);
        System.out.println(c.getDetails());
        System.out.println("Pay: " + c.computePay());
        c.attendedTraining("AWS Cert");

        Volunteer v = new Volunteer("David","789", "10/10/2000", 10);
        System.out.println(v.getDetails());
        //System.out.println("Pay: " + v.computePay());  //computePay() is N/A to Volunteer class
        v.attendedTraining("Manual Handling");
    }
}
