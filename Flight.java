package airwayapp;

import java.util.Objects;

public class Flight {
private int flightId;
private String airlineName;
private String flightNumber;
private String source;
private String destination;
private String travelDate;
private String departureTime;
private String arrivalTime;
private int flightCapacity;
private double ticketFare;
public Flight() {
	super();
}
public Flight(int flightId, String airlineName, String flightNumber, String source, String destination,
		String travelDate, String departureTime, String arrivalTime, int flightCapacity, double ticketFare) {
	super();
	this.flightId = flightId;
	this.airlineName = airlineName;
	this.flightNumber = flightNumber;
	this.source = source;
	this.destination = destination;
	this.travelDate = travelDate;
	this.departureTime = departureTime;
	this.arrivalTime = arrivalTime;
	this.flightCapacity = flightCapacity;
	this.ticketFare = ticketFare;
}
public int getFlightId() {
	return flightId;
}
public void setFlightId(int flightId) {
	this.flightId = flightId;
}
public String getAirlineName() {
	return airlineName;
}
public void setAirlineName(String airlineName) {
	this.airlineName = airlineName;
}
public String getFlightNumber() {
	return flightNumber;
}
public void setFlightNumber(String flightNumber) {
	this.flightNumber = flightNumber;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getTravelDate() {
	return travelDate;
}
public void setTravelDate(String travelDate) {
	this.travelDate = travelDate;
}
public String getDepartureTime() {
	return departureTime;
}
public void setDepartureTime(String departureTime) {
	this.departureTime = departureTime;
}
public String getArrivalTime() {
	return arrivalTime;
}
public void setArrivalTime(String arrivalTime) {
	this.arrivalTime = arrivalTime;
}
public int getFlightCapacity() {
	return flightCapacity;
}
public void setFlightCapacity(int flightCapacity) {
	this.flightCapacity = flightCapacity;
}
public double getTicketFare() {
	return ticketFare;
}
public void setTicketFare(double ticketFare) {
	this.ticketFare = ticketFare;
}
@Override
public String toString() {
	return "Flight [flightId=" + flightId + ", airlineName=" + airlineName + ", flightNumber=" + flightNumber
			+ ", source=" + source + ", destination=" + destination + ", travelDate=" + travelDate + ", departureTime="
			+ departureTime + ", arrivalTime=" + arrivalTime + ", flightCapacity=" + flightCapacity + ", ticketFare="
			+ ticketFare + ", getFlightId()=" + getFlightId() + ", getAirlineName()=" + getAirlineName()
			+ ", getFlightNumber()=" + getFlightNumber() + ", getSource()=" + getSource() + ", getDestination()="
			+ getDestination() + ", getTravelDate()=" + getTravelDate() + ", getDepartureTime()=" + getDepartureTime()
			+ ", getArrivalTime()=" + getArrivalTime() + ", getFlightCapacity()=" + getFlightCapacity()
			+ ", getTicketFare()=" + getTicketFare() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
@Override
public int hashCode() {
	return Objects.hash(airlineName, arrivalTime, departureTime, destination, flightCapacity, flightId, flightNumber,
			source, ticketFare, travelDate);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Flight other = (Flight) obj;
	return Objects.equals(airlineName, other.airlineName) && Objects.equals(arrivalTime, other.arrivalTime)
			&& Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
			&& flightCapacity == other.flightCapacity && flightId == other.flightId
			&& Objects.equals(flightNumber, other.flightNumber) && Objects.equals(source, other.source)
			&& Double.doubleToLongBits(ticketFare) == Double.doubleToLongBits(other.ticketFare)
			&& Objects.equals(travelDate, other.travelDate);
}





}
