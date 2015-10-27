package dao;

import exception.StationNotFoundException;
import model.Flight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightDAOJavaImpl implements FlightDAO {
  @Override
  public List<Flight> getAllFlights() {
    return null;
  }

  @Override
  public List<Flight> getAvailableFlights(String from, String to, Date departureDate) throws StationNotFoundException {
    List<Flight> flightList = new ArrayList<Flight>();

    if (!from.equals("Kiev")) {
      throw new StationNotFoundException(from);
    }
    //fill logic
    flightList.add(new Flight("Kiev", "Odessa", new Date()));
    flightList.add(new Flight("Kiev", "Lviv", new Date()));
    return flightList;
  }
}
