package org.example.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SaidaEntrada{
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date checkIn;
    private Date checkOut;

    public SaidaEntrada(){
    }

    public SaidaEntrada(Date checkIn, Date checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;

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

    @Override
    public String toString() {
        return "CheckIn: "
                + checkIn
                + " - CheckOut: "
                + checkOut;
    }
}
