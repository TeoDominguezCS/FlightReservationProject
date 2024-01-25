import java.sql.*;

public class FlightSearcher {
    //Returning a ResultSet of flights with atleast 1 open seat given a departure and arrival location
    private PreparedStatement preparedStatement = null;
   private ResultSet resultSet = null;
    public ResultSet searchAllFlights(String departure, String arrival){

        try{
            //open a database connection
            Connection connection = DriverManager.getConnection("URL", "USER", "PASSWORD");
            //sql statement to execute with prepared statement
            String sql = "SELECT * FROM flightsTable WHERE departureLocation=? AND arrivalLocation=? AND (currFirstSeats > 0 OR currBusinessSeats > 0 OR currEconomySeats > 0)";
            preparedStatement = connection.prepareStatement(sql);
            //passing parameters into the sql statement
            preparedStatement.setString(1, departure);
            preparedStatement.setString(2, arrival);
            //executing
            resultSet = preparedStatement.executeQuery();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }


}
