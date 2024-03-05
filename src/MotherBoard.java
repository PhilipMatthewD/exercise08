package com.killoran;

/**
 * Created by MK on 3/2/2020.
 */
public class MotherBoard {
    private int size;
    private String cpuSlot;
    private String name;

    public MotherBoard(int size, String cpuSlot, String name) {
        this.size = size;
        this.cpuSlot = cpuSlot;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "size=" + size +
                ", cpuSlot='" + cpuSlot + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
