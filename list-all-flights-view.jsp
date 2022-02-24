<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.* , airwayapp.*"%>
<%
	ArrayList<Flight> flights = (ArrayList<Flight>)request.getAttribute("flights"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of All Flights</title>
</head>
<body>
	<h2><font color="green",size="30">List of All Flights</font></h2>
	<table width="100%" cellspacing="0" cellpadding="10"
		border="2" bordercolor="blue",background-color="pink">
		<tr>	
			<td><b>Airline Name</b></td>
			<td><b>Flight Number</b></td>
			<td><b>Source</b></td>
			<td><b>Destination</b></td>
			<td><b>Travel Date</b></td>
			<td><b>Departure Time</b></td>
			<td><b>Arrival Time</b></td>
			<td><b>Flight Capacity</b></td>
			<td><b>Fare</b></td>
		</tr>
		<% for(int I = 0; I < flights.size(); I++){ %>
		<tr>	
			<td><%= flights.get(I).getAirlineName() %></td>
			<td><%= flights.get(I).getFlightNumber() %></td>
			<td><%= flights.get(I).getSource() %></td>
			<td><%= flights.get(I).getDestination() %></td>
			<td><%= flights.get(I).getTravelDate() %></td>
			<td><%= flights.get(I).getDepartureTime() %></td>
			<td><%= flights.get(I).getArrivalTime() %></td>
			<td><%= flights.get(I).getFlightCapacity() %></td>
			<td><%= flights.get(I).getTicketFare() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html> 
