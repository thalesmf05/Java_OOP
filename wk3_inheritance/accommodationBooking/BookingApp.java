import javax.swing.*;

public class BookingApp {
    public static void main(String[] args) {
        String name, startDate, userChoiceBooking, breakfastInput, finalBooking = "";
        int duration;
        boolean wantBreakfast;

        //general input
        name = JOptionPane.showInputDialog(null, "Welcome to Thales's Booking System!\n To start I need your name: ");
        startDate = JOptionPane.showInputDialog(null, "Enter the desired start date(DD-MM-YYYY): ");
        duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of days: "));

        //check for the hotel or cottage
        userChoiceBooking = JOptionPane.showInputDialog(null, "Do you want to book for Hotel (H) or Cottage (C)? ");

        switch (userChoiceBooking){
            case "H":
                //check for breakfast
                breakfastInput = JOptionPane.showInputDialog(null, "Do you want breakfast? (Y/N)");
                wantBreakfast = breakfastInput.equals("Y");

                //call constructor
                Hotel h = new Hotel(name, startDate, duration, wantBreakfast);
                finalBooking = h.getFinalBooking();
                break;
            case "C":
                Cottage c = new Cottage(name, startDate, duration);
                finalBooking = c.getFinalBooking();
                break;
        }
        JOptionPane.showMessageDialog(null, finalBooking);
    }
}
