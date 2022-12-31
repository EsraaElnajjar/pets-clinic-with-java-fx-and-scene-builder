package pets2;

public class AllData {

    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private String telephone;
    private String approved;
    private String doctorname;
    private String day;
    private String timeslot;
    private String casenumber;

    public AllData(String firstname, String lastname, String email, String username, String password, String telephone, String approved, String doctorname, String day, String timeslot, String casenumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.approved = approved;
        this.doctorname = doctorname;
        this.day = day;
        this.timeslot = timeslot;
        this.casenumber = casenumber;
    }
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the approved
     */
    public String getApproved() {
        return approved;
    }

    /**
     * @param approved the approved to set
     */
    public void setApproved(String approved) {
        this.approved = approved;
    }

    /**
     * @return the doctorname
     */
    public String getDoctorname() {
        return doctorname;
    }

    /**
     * @param doctorname the doctorname to set
     */
    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the timeslot
     */
    public String getTimeslot() {
        return timeslot;
    }

    /**
     * @param timeslot the timeslot to set
     */
    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    /**
     * @return the casenumber
     */
    public String getCasenumber() {
        return casenumber;
    }

    /**
     * @param casenumber the casenumber to set
     */
    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber;
    }

}
