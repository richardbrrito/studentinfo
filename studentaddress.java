package StudentSelfProject;

public class StudentAddress {

    private String address;
    private String zip_code;
    private String state;
    private String city;

    public StudentAddress(String address, String zip_code, String state, String city) {
        this.address = address;
        this.zip_code = zip_code;
        this.state = state;
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public String getZipcode() {
        return zip_code;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }


}

