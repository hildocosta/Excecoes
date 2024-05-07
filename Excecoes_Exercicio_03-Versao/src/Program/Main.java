package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainExceptions;

public class Main {

    public static void main(String[] args) {

        // Configura o idioma padr�o para entrada de dados como US para suporte ao
        // formato de n�meros com ponto decimal
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para capturar entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Define o formato de data esperado para entrada
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = scanner.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scanner.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(scanner.next());

            // Cria uma nova reserva e a imprime
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            // Solicita ao usu�rio a entrada para atualizar a reserva
            System.out.println("");
            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scanner.next());

            // Atualiza as datas da reserva e verifica se h� algum erro
            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            
        } catch (ParseException e) {
            // Captura a exce��o se o formato da data de entrada for inv�lido
            System.out.println("Invalid date format");
        } catch (DomainExceptions e) {
            // Captura a exce��o se houver erro na reserva
            System.out.println("Error in reservation: " + e.getMessage());
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }

}
