package com.killoran;

/**
 * Created by MK on 3/2/2020.
 */
public class PowerSupply {
    private String brand;
    private double price;
    private int wattage;
    private boolean isModular;
    private String certification;//gold/bronze/silver


    public PowerSupply(String brand, double price, int wattage, boolean isModular, String certification) {
        this.brand = brand;
        this.price = price;
        this.wattage = wattage;
        this.isModular = isModular;
        this.certification = certification;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public boolean isModular() {
        return isModular;
    }

    public void setModular(boolean modular) {
        isModular = modular;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }


    public void display() {
        System.out.println( "Power Supply Specs: " +
                "\n\tBrand: " + brand +
                "\n\tPrice: " + price +
                "\n\tWattage: " + wattage +
                "\n\tModular: " + isModular +
                "\n\tCertification: " + certification);
    }
}
