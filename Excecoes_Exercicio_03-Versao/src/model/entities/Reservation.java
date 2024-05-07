package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainExceptions;

public class Reservation {
    
    // Atributos
    private Integer roomNumber; // Número do quarto
    private Date checkIn; // Data de check-in
    private Date checkOut; // Data de check-out
    
    // Formato de data para exibição
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    // Construtor padrão
    public Reservation() {
        // Construtor padrão vazio
    }

    // Construtor com argumentos
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainExceptions {
        // Lança uma exceção se a data de check-out não for após a data de check-in
        if  (!checkOut.after(checkIn)) {
            throw new DomainExceptions("Check-out date must be after check-in date");
        }
        
        // Inicializa os atributos da reserva
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
    public void updateDates(Date checkIn, Date checkOut) throws DomainExceptions {
        // Lança uma exceção se as datas de reserva não forem futuras
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)) {
            throw new DomainExceptions("Reservation dates for updates must be future dates ");
        }
        
        // Lança uma exceção se a data de check-out não for após a data de check-in
        if  (!checkOut.after(checkIn)) {
            throw new DomainExceptions("Check-out date must be after check-in date");
        }
        
        // Atualiza as datas de check-in e check-out
        this.checkIn = checkIn;
        this.checkOut = checkOut;
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
