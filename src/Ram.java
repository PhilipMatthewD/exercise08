package com.killoran;

/**
 * Created by MK on 3/2/2020.
 */
public class Ram {
    private int amount;
    private int speed;
    private boolean RGB;

    public Ram(int amount, int speed, boolean RGB) {
        this.amount = amount;
        this.speed = speed;
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "amount=" + amount +
                ", speed=" + speed +
                ", RGB=" + RGB +
                '}';
    }
}
