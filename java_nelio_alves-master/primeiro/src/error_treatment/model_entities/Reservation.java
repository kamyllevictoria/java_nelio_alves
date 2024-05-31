package error_treatment.model_entities;

import error_treatment.model_exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

<<<<<<< HEAD
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut)  throws DomainException{
        if(!checkOut.after(checkIn)){
            throw new DomainException("Check-out must be after check-in date.");
        }
=======
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
>>>>>>> 559f346fd1cc2b317827fa176462f3fb5257e6f3
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString(){
        return "Room number: "
                + roomNumber
                + "\nCheckIn: "
                + sdf.format(checkIn)
                + "\nCheckOut: "
                + sdf.format(checkOut)
                + "\n"
                + duration()
                + " nigths: ";
<<<<<<< HEAD
=======
    }

    public void updateDates(Date checkIn, Date checkOut) {
        this.checkOut = checkOut;
        this.checkIn = checkIn;
>>>>>>> 559f346fd1cc2b317827fa176462f3fb5257e6f3
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be future dates.");
        }
        if(!checkOut.after(checkIn)){
            throw new DomainException("Check-out must be after check-in date.");
        }
        this.checkOut = checkOut;
        this.checkIn = checkIn;

    }

}
