/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.hibernatefx.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author kmhasan
 */
@Entity(name = "phone")
public class Phone {
    @Id
    @GeneratedValue
    private int phoneId;
    private int countryCode;
    private int areaCode;
    private String phoneNumber;
    //@ManyToOne
    //private Student student;
    
    public Phone() {
    }

    public Phone(int countryCode, int areaCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    
    public Phone(int phoneId, int countryCode, int areaCode, String phoneNumber) {
        this.phoneId = phoneId;
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" + "phoneId=" + phoneId + ", countryCode=" + countryCode + ", areaCode=" + areaCode + ", phoneNumber=" + phoneNumber + '}';
    }
}
