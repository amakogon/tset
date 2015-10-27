package model;

import dao.FlightDAO;
import dao.FlightDAOJavaImpl;
import exception.StationNotFoundException;

import java.util.Date;
import java.util.List;

public class Kassa {

  private FlightDAO flightDAO = new FlightDAOJavaImpl();

  public List<Flight> getAvailableFlights(String from, String to, Date departureDate) throws StationNotFoundException {
    return flightDAO.getAvailableFlights(from, to, departureDate) ;
  }
}
