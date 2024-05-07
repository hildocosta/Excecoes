package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    
    // Atributos
    private Integer roomNumber; // N�mero do quarto
    private Date checkIn; // Data de check-in
    private Date checkOut; // Data de check-out
    
    // Formato de data para exibi��o
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    // Construtor padr�o
    public Reservation() {
        
    }

    // Construtor com argumentos
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // Getters e Setters
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    // M�todo para calcular a dura��o da reserva em noites
    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    // M�todo para atualizar as datas de check-in e check-out
    public String updateDates(Date checkIn, Date checkOut) {
    	
        // Verifica se as datas de reserva para atualiza��o s�o futuras
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)) {
           return "Reservation dates for updates must be future dates ";
        }
        // Verifica se a data de check-out � ap�s a data de check-in
        if  (!checkOut.after(checkIn)) {
            return "Check-out date must be after check-in date";
        }
    	    	
    	
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        
        return null;
    }
    
    

    // M�todo toString para representa��o em String da reserva
    @Override
    public String toString() {
        return  " Quarto "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " noites";        
    }
}
