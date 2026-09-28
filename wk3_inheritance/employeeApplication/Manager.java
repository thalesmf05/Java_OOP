package wk3_inheritance.lab;

public class Manager extends Employee{
        private double salary;

       public Manager(String name, String id, String dob, double salary){
           super(name, id, dob);
           this.salary = salary;
        }

        public void setSalary(double salary){
           this.salary = salary;
        }

        public double getSalary(){
           return salary;
        }

    }
