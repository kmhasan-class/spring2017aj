/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.hibernatefx.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author kmhasan
 */
@Embeddable
public class Address {
    private String houseNumber;
    private String streetAddress;
    private String city;

    public Address() {
    }

    public Address(String houseNumber, String streetAddress, String city) {
        this.houseNumber = houseNumber;
        this.streetAddress = streetAddress;
        this.city = city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNumber=" + houseNumber + ", streetAddress=" + streetAddress + ", city=" + city + '}';
    }
    
    
}
