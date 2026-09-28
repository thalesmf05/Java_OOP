
import javax.swing.JOptionPane;

public class EmployeeApp{
    public static void main(String[] args) {
        String name, id, dob, option;
        Double salary, hours, rate;

        name = JOptionPane.showInputDialog(null, "Enter Name:");
        id = JOptionPane.showInputDialog(null, "Enter ID:");
        dob = JOptionPane.showInputDialog(null, "Enter DOB:");

        option = JOptionPane.showInputDialog("Enter Employee Type:  \n(G) general\n(M) manager\n(S) staff");

        switch (option){
            case "G":
                Employee e = new Employee(name, id, dob);
                JOptionPane.showMessageDialog(null, "General Information details: " +
                                "\nName: " + e.getName() +
                                "\nid: " + e.getId() +
                                "\ndob: " + e.getDob());
                break;
            case "M":
                salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your salary: "));
                Manager m = new Manager(name, id, dob, salary);
                JOptionPane.showMessageDialog(null, "Manager details: " +
                        "\nName: " + m.getName() +
                        "\nid: " + m.getId() +
                        "\ndob: " + m.getDob() +
                        "\nSalary: " + m.getSalary());
                break;
            case "S":
                hours = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your hours: "));
                rate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your rate: "));
                CasualStaff casualStaff = new CasualStaff(name, id, dob, hours, rate);
                JOptionPane.showMessageDialog(null, "Manager details: " +
                        "\nName: " + casualStaff.getName() +
                        "\nid: " + casualStaff.getId() +
                        "\ndob: " + casualStaff.getDob() +
                        "\nHours: " + casualStaff.getHours() +
                        "\nRate: " + casualStaff.getRate());
                break;
        }


    }
}