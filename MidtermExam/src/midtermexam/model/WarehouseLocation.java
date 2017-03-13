/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam.model;

/**
 *
 * @author kmhasan
 */
public class WarehouseLocation {
    private double latitude;
    private double longitude;

    public WarehouseLocation() {
    }

    public WarehouseLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "WarehouseLocation{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
    }
    
}
