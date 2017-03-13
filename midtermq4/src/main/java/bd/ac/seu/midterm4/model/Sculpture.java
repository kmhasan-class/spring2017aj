/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.midterm4.model;

import java.util.Arrays;

/**
 * Model class to hold information about a sculpture.
 * <p>
 * We can store id, name, price, tags, dimension and warehouse location of a 
 * sculpture. The {@link Dimension} stores height, width and length in cm.
 * @author kmhasan
 */
public class Sculpture {
    private int id;
    private String name;
    private double price;
    private String[] tags;
    private Dimension dimensions;
    private WarehouseLocation warehouseLocation;

    /**
     * Default constructor.
     */
    public Sculpture() {
    }

    /**
     *
     * @param id
     * @param name
     * @param price
     * @param tags
     * @param dimensions
     * @param warehouseLocation
     */
    public Sculpture(int id, String name, double price, String[] tags, Dimension dimensions, WarehouseLocation warehouseLocation) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tags = tags;
        this.dimensions = dimensions;
        this.warehouseLocation = warehouseLocation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     *
     * @return Returns a {@link String} array of tags for this sculpture.
     */
    public String[] getTags() {
        return tags;
    }

    /**
     *
     * @return
     */
    public Dimension getDimensions() {
        return dimensions;
    }

    /**
     *
     * @return
     */
    public WarehouseLocation getWarehouseLocation() {
        return warehouseLocation;
    }

    @Override
    public String toString() {
        return "Sculpture{" + "id=" + id + ", name=" + name + ", price=" + price + ", tags=" + Arrays.toString(tags) + ", dimension=" + dimensions + ", warehouseLocation=" + warehouseLocation + '}';
    }
    
}
