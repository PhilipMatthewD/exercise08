package com.killoran;

/**
 * Created by MK on 3/2/2020.
 */
public class CPU {
    private String brand;
    private int numCores;
    private int speed;

    public CPU(String intel, int i, int i1) {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumCores() {
        return numCores;
    }

    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "brand='" + brand + '\'' +
                ", numCores=" + numCores +
                ", speed=" + speed +
                '}';
    }
}
