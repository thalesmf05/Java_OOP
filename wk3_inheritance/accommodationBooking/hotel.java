import java.util.ArrayList;
import java.util.List;

public class hotel extends booking{
    private boolean wantBreakfast;
    private String bookingCode, finalBooking;
    private ArrayList<Integer> avaliableRooms;
    private int selectedRoom;

    public hotel(String name, String start_date, int duration, boolean wantBreakfast) {
        super(name, start_date, duration);
        this.wantBreakfast = wantBreakfast;
        avaliableRooms = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    }

    public boolean isWantBreakfast() {
        return wantBreakfast;
    }

    public void setWantBreakfast(boolean wantBreakfast) {
        this.wantBreakfast = wantBreakfast;
    }

    //compute methods
    public int selectRoom(){
        for(int i = 0; i < avaliableRooms.toArray().length; i++){
            if(avaliableRooms.contains(i)){
                selectedRoom = i;
            }else{
                continue;
            }
        }
        return selectedRoom;
    }
    public String generateBookingCode(){
        bookingCode = "H" + String.valueOf(name.charAt(0)) + selectedRoom + String.valueOf(name.charAt(name.length() - 1));
        return bookingCode;
    }
    public String finalBooking(){
        finalBooking = "Hotel Room Booking Information" +
                "\nName: " + name +
                "\nStart date: " + start_date +
                "\nDuration: " + duration +
                "\nBreakfast: " + wantBreakfast +
                "\nHotel Room: " + selectedRoom +
                "\nBooking Code: " + bookingCode;
        return finalBooking;
    }
}
