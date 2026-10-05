public class EmployeePolyApp {
    public static void main(String[] args) {
        Employee e = new Employee("John Doe", "12345", "01/01/1990");

        Manager m = new Manager("Jane Doe", "54321", "01/01/1980", 100000);

        Casual c = new Casual("Bob Smith", "67890", "01/01/1995", 8, 15);

        //get details method with overwriting
        System.out.println(e.getDetails());
        System.out.println(m.getDetails());
        System.out.println(c.getDetails());

        //compute salary method
        System.out.println("Employee: " + m.getName() + "Wk Salary: " + m.computeWeeklySalary());
        System.out.println("Employee: " + c.getName() + "Wk Salary: " + c.computeWeeklySalary());

        //Introducing Polymorphism and objects - declared as an Employee but created as a Manager
        Employee e2 = new Manager("Jude Alkesh", "55436", "09/10/2002", 30000);
        System.out.println(e2.getDetails());
        System.out.println("Employee: " + e2.getName() + ", Wk Salary: " + e2.computeWeeklySalary());

        e2.setName("Calum"); //change e2 name
//        System.out.println(e2.getDetails());
        // e2.setSalary();doesn't work because there isn't the class setSalary on employee

        if(e2 instanceof Manager){
            Manager m2 = (Manager) e2;
            m2.setSalary(10000000);
        }

        System.out.println("Updated:" + e2.getDetails());
    }
}
