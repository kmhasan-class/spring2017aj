/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.midterm4.model;

/**
 * This is a model class to hold the length, width and height of a sculpture.
 * <p>
 * We need to store the dimension for each of the sculptures. The length, width 
 * and height are all stored in cm units.
 * 
 * @version 2.0
 * @since 1.2
 * 
 * @author Monirul Hasan
 * @author Md. Rakibul Hasan
 */
public class Dimension {
    private double length;
    private double width;
    private double height;

    /**
     * Default constructor.
     */
    public Dimension() {
    }

    /**
     * Overloaded constructor.
     * <p>
     * We can use this constructor when we know the length, width and height of 
     * a sculpture.
     * @param length The length of the sculpture given in cm.
     * @param width The width of the sculpture given in cm.
     * @param height The height of the sculpture given in cm.
     */
    public Dimension(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * Get method for length property.
     * 
     * @return Returns the length of the sculpture in cm.
     */
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Dimension{" + "length=" + length + ", width=" + width + ", height=" + height + '}';
    }
    
}
