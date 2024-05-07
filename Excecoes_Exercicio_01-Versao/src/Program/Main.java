package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Main {

    public static void main(String[] args) throws ParseException {

        // Configura o idioma padrão para entrada de dados como US para suporte ao formato de números com ponto decimal
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para capturar entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Define o formato de data esperado para entrada
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scanner.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scanner.next());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scanner.next());

        // Verifica se a data de check-out é após a data de check-in
        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            // Cria uma nova reserva e a imprime
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            
            // Solicita ao usuário a entrada para atualizar a reserva
            System.out.println("");
            System.out.println("Enter data to update the reservation: ");
            
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scanner.next());
            
            // Verifica se as datas de reserva para atualização são futuras
            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Error in reservation: Reservation dates for updates must be future dates ");
            }
            // Verifica se a data de check-out é após a data de check-in
            else if  (!checkOut.after(checkIn)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
            // Atualiza as datas da reserva e imprime a reserva atualizada
            else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }

}
