package Excecao.solucao1.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer rooNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer rooNumber, Date checkin, Date checkout) {
        this.rooNumber = rooNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Date getCheckin() {
        return checkin;
    }



    public Date getCheckout() {
        return checkout;
    }



    public Integer getRooNumber() {
        return rooNumber;
    }

    public void setRooNumber(Integer rooNumber) {
        this.rooNumber = rooNumber;
    }


    public long duration(){
        long diff = checkout.getTime() - checkin.getTime();
       return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    public void upDateDates(Date checkin, Date checkout) throws DomainException{
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)) {
            throw new DomainException(" Reservation dates update must be future dates ");
        }
         if (!checkout.after(checkin)) {
            throw new DomainException(" [ERRO] check-out date must be after check-in date! ");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }
    @Override
    public String toString() {
        return " Room "
                +rooNumber
                +", Checkin "
                +sdf.format(checkin)
                +", Checkout "
                +sdf.format(checkout)
                +", "
                +duration()
                +" nights";
    }

}
