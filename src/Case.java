package com.killoran;

/**
 * Created by MK on 3/2/2020.
 */
public class Case {
    private String brand;
    //do not worry about other features of case although you could most certainly add more.
    //see if you can calculate total price after you have built entire PC> will take most of class time.
    private PowerSupply psu;
    private CPU cpu;
    private MotherBoard mb;
    private Ram ram;
    private Storage storage;
    private GPU gpu;
    static double totalPrice;

    public Case(String brand, PowerSupply psu, CPU cpu, MotherBoard mb, Ram ram, Storage storage, GPU gpu) {
        this.brand = brand;
        this.psu = psu;
        this.cpu = cpu;
        this.mb = mb;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
    }
}
