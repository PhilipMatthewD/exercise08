package com.killoran;

/**
 * Created by MK on 3/2/2020.
 */
public class Storage {
    private String type;
    private int amount;

    public Storage(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
