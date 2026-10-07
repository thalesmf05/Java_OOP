public class Cottage extends Booking {
    private String bookingCode;
    final private String address;
    private int price;

    public Cottage(String name, String start_date, int duration) {
        super(name, start_date, duration);
        address = "56 doctor street, main avenue, Dublin";
    }

    //compute methods
    public void generateBookingCode() {
        bookingCode = "C" + name.charAt(0) + name.charAt(name.length() - 1) + duration;
    }

    @Override
    public String getFinalBooking(){
        generateBookingCode();
        calculatePrice();
        return super.getFinalBooking() +
                "\n Address: " + address +
                "\nBooking Code: " + bookingCode +
                "\nPrice : " + price;
    }

    @Override
    public void calculatePrice() {
        price = 60 * duration + 50;
    }
}
