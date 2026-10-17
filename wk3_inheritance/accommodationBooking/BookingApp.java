import javax.swing.*;

public class BookingApp {
    public static void main(String[] args) {
        String name, startDate, userChoiceBooking, breakfastInput, finalBooking = "", eventTitle, clientName, startTime;
        int duration;
        boolean wantBreakfast;
        double durationHours;

        //check for the hotel or cottage
        userChoiceBooking = JOptionPane.showInputDialog(null, "Do you want to book for Hotel (H), Cottage (C) oor Event Booking(E)? ");

        switch (userChoiceBooking){
            case "H":
                //basic information
                name = JOptionPane.showInputDialog(null, "Welcome to Thales's Booking System!\n To start I need your name: ");
                startDate = JOptionPane.showInputDialog(null, "Enter the desired start date(DD-MM-YYYY): ");
                duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of days: "));

                //check for breakfast
                breakfastInput = JOptionPane.showInputDialog(null, "Do you want breakfast? (Y/N)");
                wantBreakfast = breakfastInput.equals("Y");

                //call constructor
                Hotel h = new Hotel(name, startDate, duration, wantBreakfast);
                h.computeFee();
                finalBooking = h.getFinalBooking();
                break;
            case "C":
                //basic information
                name = JOptionPane.showInputDialog(null, "Welcome to Thales's Booking System!\n To start I need your name: ");
                startDate = JOptionPane.showInputDialog(null, "Enter the desired start date(DD-MM-YYYY): ");
                duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of days: "));

                //call constructor
                Cottage c = new Cottage(name, startDate, duration);
                c.computeFee();
                finalBooking = c.getFinalBooking();
                break;
            case "E":
                eventTitle = JOptionPane.showInputDialog(null, "Enter the event title: ");
                clientName = JOptionPane.showInputDialog(null, "Enter the client name: ");
                startTime = JOptionPane.showInputDialog(null, "Enter the start time (HH:MM): ");
                durationHours = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the duration in hours: "));

                Events e = new Events(eventTitle, clientName, startTime, durationHours);
                e.computeFee();
                finalBooking = e.getFinalBooking();

        }
        if(!finalBooking.isEmpty()) {
            JOptionPane.showMessageDialog(null, finalBooking);
        }else{
            JOptionPane.showMessageDialog(null, "Unexpected error");
        }
    }
}
