/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam.model;

import midtermexam.model.Dimension;
import midtermexam.model.WarehouseLocation;

/**
 *
 * @author kmhasan
 */
public class Sculpture {
    private int id;
    private String name;
    private double price;
    private String[] tags;
    private Dimension dimension;
    private WarehouseLocation warehouseLocation;

    public Sculpture() {
    }

    public Sculpture(int id, String name, double price, String[] tags, Dimension dimension, WarehouseLocation warehouseLocation) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tags = tags;
        this.dimension = dimension;
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

    public String[] getTags() {
        return tags;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public WarehouseLocation getWarehouseLocation() {
        return warehouseLocation;
    }

    @Override
    public String toString() {
        return "Sculpture{" + "id=" + id + ", name=" + name + ", price=" + price + ", tags=" + tags + ", dimension=" + dimension + ", warehouseLocation=" + warehouseLocation + '}';
    }
    
}
