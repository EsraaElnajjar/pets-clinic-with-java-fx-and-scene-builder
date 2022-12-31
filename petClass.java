/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets2;

/**
 *
 * @author HP
 */
public class petClass {

   String animalname, doctorname, appdate, apptime;

    public petClass(String animalname, String doctorname, String appdate, String apptime) {
        this.animalname = animalname;
        this.doctorname = doctorname;
        this.appdate = appdate;
        this.apptime = apptime;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public void setAppdate(String appdate) {
        this.appdate = appdate;
    }

    public void setApptime(String apptime) {
        this.apptime = apptime;
    }

    public String getAnimalname() {
        return animalname;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public String getAppdate() {
        return appdate;
    }

    public String getApptime() {
        return apptime;
    }
   

   
}
