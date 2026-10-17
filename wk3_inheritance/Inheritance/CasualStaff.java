public class CasualStaff extends Employee {
        private double hours, rate;

        public CasualStaff(String name, String id, String dob, double hours, double rate){
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

        

    }
