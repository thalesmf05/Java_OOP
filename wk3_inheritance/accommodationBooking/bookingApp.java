import javax.swing.*;

public class bookingApp {
    public static void main(String[] args) {
        String name, start_date, address, userChoiceBooking, breakfastInput, bookingCode, finalBooking = "";
        String [] bookingTypes = {"Hotel", "Cottage"};
        int duration, hotelRoom;
        Boolean wantBreakfast;

        //general input
        name = JOptionPane.showInputDialog(null, "Welcome to Thales's Booking System!\n To start I need your name: ");
        start_date = JOptionPane.showInputDialog(null, "Enter the desired start date(DD-MM-YYYY): ");
        duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of days: "));

        //check for hotel or cottage
        userChoiceBooking = JOptionPane.showInputDialog(null, "Do you want to book for Hotel (H) or Cottage (C)? ");

        switch (userChoiceBooking){
            case "H":
                //check for breakfast
                breakfastInput = JOptionPane.showInputDialog(null, "Do you want breakfast? (Y/N)");
                if (breakfastInput.equals("Y")) {
                    wantBreakfast = true;
                }else{
                    wantBreakfast = false;
                }

                //call constructor
                hotel h = new hotel(name, start_date, duration, wantBreakfast);
                hotelRoom = h.selectRoom();
                bookingCode = h.generateBookingCode();

                //booking details
                finalBooking = h.finalBooking();
                break;
            case "C":
                cottage c = new cottage(name, start_date, duration);
                address = c.getAddress();
                bookingCode = c.generateBookingCode();
                finalBooking = c.finalBooking();
                break;
        }
        JOptionPane.showMessageDialog(null, finalBooking);
    }
}
