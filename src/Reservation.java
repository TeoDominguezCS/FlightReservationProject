public class Reservation {
    private int flightID;
    private int classID;
    private String firstName;
    private String lastName;
    private String dob;
    private int cellNum;
    private String address;
    private String email;

    public void setFlightID(int flightID){
        this.flightID = flightID;
    }
    public int getFlightID(){
        return flightID;
    }
    public void setClassID(int classID){
        this.classID = classID;
    }
    public int getClassID(){
        return classID;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getDob(){
        return dob;
    }
    public void setCellNum(int cellNum){
        this.cellNum = cellNum;
    }
    public int getCellNum(){
        return cellNum;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
}
