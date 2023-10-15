import java.sql.*;
public class Main {
    public static void main(String[] args){
        //testing class/method
        FlightSearcher a = new FlightSearcher();
        String departure = "Los Angeles (LAX)";
        String arrival = "New York (JFK)";
        try {
            ResultSet testSet = null;
            testSet = a.searchAllFlights(arrival, departure, 0);
            //testing ResultSet returned correctly by printing (didn't print the whole row btw)
            //EXPECTED: 104 New York (JFK) Los Angeles (LAX)
            //          105 New York (JFK) Los Angeles (LAX)
            while (testSet.next()) {
                System.out.println(testSet.getInt("flightID") + " " + testSet.getString("departureLocation") + " " + testSet.getString("arrivalLocation"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}