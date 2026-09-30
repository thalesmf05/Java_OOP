public class cottage extends booking{
    private String address, bookingCode, finalBooking;

    public cottage(String name, String start_date, int duration) {
        super(name, start_date, duration);
        address = "56 doctor street, main avenue, Dublin";
    }

    public String getAddress() {
        return address;
    }

    //compute methods
    public String generateBookingCode() {
        bookingCode = "C" + String.valueOf(name.charAt(0)) + String.valueOf(name.charAt(name.length() - 1)) + duration;
        return bookingCode;
    }

    public String finalBooking(){
        finalBooking = "Hotel Room Booking Information" +
                "\nName: " + name +
                "\nStart date: " + start_date +
                "\nDuration: " + duration +
                "\n Adress: " + address +
                "\nBooking Code: " + bookingCode;
        return finalBooking;
    }
}
