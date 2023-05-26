/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject1;

import java.io.Serializable;

/**
 *
 * @author maial
 */
public class bookingInformation implements Serializable{
    private String name;
    private String iD;
    private String country;
    private String stat;
    private String vaccine;

    public bookingInformation(String name, String iD, String country, String stat, String vaccine) {
        this.name = name;
        this.iD = iD;
        this.country = country;
        this.stat = stat;
        this.vaccine = vaccine;
    }

    public String getName() {
        return name;
    }

    public String getiD() {
        return iD;
    }

    public String getCountry() {
        return country;
    }

    public String getStat() {
        return stat;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }   
}
