package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    
    // Atributos
    private Integer roomNumber; // Número do quarto
    private Date checkIn; // Data de check-in
    private Date checkOut; // Data de check-out
    
    // Formato de data para exibição
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    // Construtor padrão
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

    // Método para calcular a duração da reserva em noites
    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    // Método para atualizar as datas de check-in e check-out
    public String updateDates(Date checkIn, Date checkOut) {
    	
        // Verifica se as datas de reserva para atualização são futuras
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)) {
           return "Reservation dates for updates must be future dates ";
        }
        // Verifica se a data de check-out é após a data de check-in
        if  (!checkOut.after(checkIn)) {
            return "Check-out date must be after check-in date";
        }
    	    	
    	
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        
        return null;
    }
    
    

    // Método toString para representação em String da reserva
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
