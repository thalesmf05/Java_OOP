public class Hotel extends Booking {
    final private boolean wantBreakfast;
    private String bookingCode;
    private int selectedRoom;
    private int price;

    public Hotel(String name, String start_date, int duration, boolean wantBreakfast) {
        super(name, start_date, duration);
        this.wantBreakfast = wantBreakfast;
    }

    //compute methods
    public void selectRoom(){
        selectedRoom = (int) (Math.random() * 5) + 1;
    }
    public void generateBookingCode(){
        bookingCode = "H" + name.charAt(0) + selectedRoom + name.charAt(name.length() - 1);
    }

    @Override
    public String getFinalBooking(){
        calculatePrice();
        selectRoom();
        generateBookingCode();

        if(wantBreakfast){
            return super.getFinalBooking() + "\nHotel Room: " + selectedRoom
                    + "\nBooking Code: " + bookingCode
                    + "\nBreakfast: Yes"
                    + "\nTotal Price: " + price;
        }else{
            return super.getFinalBooking() + "\nHotel Room: " + selectedRoom
                    + "\nBooking Code: " + bookingCode
                    + "\nBreakfast: No"
                    + "\nTotal Price: " + price;
        }

    }

    @Override
    public void calculatePrice() {
        price = 130 * duration;
        if(wantBreakfast){
            price = price + 10;
        }
    }
}
