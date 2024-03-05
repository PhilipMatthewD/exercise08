package com.killoran;

/**
 * Created by MK on 3/2/2020.
 */
public class GPU {
    private int vram;
    private String model;

    public GPU(int vram, String model) {
        this.vram = vram;
        this.model = model;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "vram=" + vram +
                ", model='" + model + '\'' +
                '}';
    }
}
