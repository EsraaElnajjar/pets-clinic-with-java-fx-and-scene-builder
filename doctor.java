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
public class doctor {
    String doctor_name;
    String day;
    String worktime;
    String casesnumber;

    public doctor(String doctor_name, String day, String worktime, String casesnumber) {
        this.doctor_name = doctor_name;
        this.day = day;
        this.worktime = worktime;
        this.casesnumber = casesnumber;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public void setCasesnumber(String casesnumber) {
        this.casesnumber = casesnumber;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public String getDay() {
        return day;
    }

    public String getWorktime() {
        return worktime;
    }

    public String getCasesnumber() {
        return casesnumber;
    }

   
    
    
}
