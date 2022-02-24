package airwayapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FlightDAO {
	public static String url = "jdbc:sqlite:C:\\4VV20CS104\\airwayapp\\src\\main\\webapp\\WEB-INF\\lib\\airwayapp.db";
	public static ArrayList<Flight> readAllFlights(){
		String query = "SELECT flight_id, airline_name, flight_number, "
				+ "source, destination, travel_date, "
				+ "departure_time, arrival_time, "
				+ "flight_capacity, ticket_fare FROM flight";
		ArrayList<Flight> flights = new ArrayList<Flight>();
		
		try {
			Class.forName("org.sqlite.JDBC"); // 1. Register/Load Driver
			Connection con = DriverManager.getConnection(url); // 2. Create connection object
			PreparedStatement st = con.prepareStatement(query); // 3. Create statement object with query
			ResultSet rs = st.executeQuery(); // 4. Run the query and if SELECT query, assign into ResultSet
			while(rs.next()) { // 5. Read the data 
				Flight flight = new Flight(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getInt(9), rs.getDouble(10));
				
				flights.add(flight);
			}
			con.close(); // 6.Close the Connection
		} catch (ClassNotFoundException e) {
			System.out.println("Error in Registering the JDBC Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error in connecting database");
			e.printStackTrace();
		}
		return flights;
	}
}
