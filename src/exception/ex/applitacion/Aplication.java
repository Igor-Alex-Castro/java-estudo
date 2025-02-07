package exception.ex.applitacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exception.ex.model.entities.Reservation;
import exception.ex.model.excepetions.DomainException;

public class Aplication {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
		
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn =  sdf.parse(sc.next());
		
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut =  sdf.parse(sc.next());
		
		
		
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
	
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn =  sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut =  sdf.parse(sc.next());
			
			reservation.updateDadtes(checkIn, checkOut);
		}catch (ParseException e) {
			System.out.println("invalid date format");
		}catch (DomainException e) {
			
			System.out.println("Error in reservation: " +  e.getMessage());
		}catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("Unexpected error");
		}
	
    }
}
