package view;

import action.Action;
import model.Flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ConsoleView implements View {

  private static Scanner scanner = new Scanner(System.in);
  private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("DD-MM");
  private Action action;

  public void setAction(Action action) {
    this.action = action;
  }

  public void showAvailableFlights(List<Flight> flights) {
    if (flights.isEmpty()) {
      System.out.println("Flights not found");
    }
    for (Flight flight : flights) {
      System.out.println(flight);
    }
  }

  public String getDepartureStation() {
    System.out.println("Enter from station");
    return scanner.next();
  }

  public String getDestinationStation() {
    System.out.println("Enter target station");
    return scanner.next();
  }

  public Date getDepartureDate() throws ParseException {
    System.out.println("Enter date in format (DD-MM)");
    return DATE_FORMAT.parse(scanner.next());
  }

  public void displayErrorMessage(String error) {
    System.err.println(error);
  }

  //start my view
  @Override
  public void display() {
    while (true) {
      action.perform();
    }
  }
}
