package controller;

import action.Action;
import exception.StationNotFoundException;
import model.Flight;
import model.Kassa;
import view.ConsoleView;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class KassaController {
  private Kassa kassa;
  private ConsoleView view;

  public KassaController(Kassa kassa, ConsoleView view) {
    this.kassa = kassa;
    this.view = view;
    view.setAction(new StartAction());
  }


  private class StartAction implements Action {
    @Override
    public void perform() {
      try {
        String departureStation = view.getDepartureStation();
        String destinationStation = view.getDestinationStation();
        Date departureDate = view.getDepartureDate();

        List<Flight> availableFlights = kassa.getAvailableFlights(departureStation, destinationStation, departureDate);
        view.showAvailableFlights(availableFlights);
      } catch (ParseException pe) {
        view.displayErrorMessage(pe.getMessage());
      } catch (StationNotFoundException snfe) {
        view.displayErrorMessage("Station not found: " + snfe.getMessage());
      }
    }
  }


}
