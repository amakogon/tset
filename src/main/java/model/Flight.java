package model;

import java.util.Date;

public class Flight {

  private String from;
  private String to;
  private Date date;

  public Flight(String from, String to, Date date) {
    this.from = from;
    this.to = to;
    this.date = date;
  }

  @Override
  public String toString() {
    return "Flight{" +
      "from='" + from + '\'' +
      ", to='" + to + '\'' +
      ", date=" + date +
      '}';
  }
}
