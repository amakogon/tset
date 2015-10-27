package dao;

import exception.StationNotFoundException;
import model.Flight;

import java.util.Date;
import java.util.List;

public interface FlightDAO {

  List<Flight> getAllFlights();

  List<Flight> getAvailableFlights(String from, String to, Date departureDate) throws StationNotFoundException;
}
