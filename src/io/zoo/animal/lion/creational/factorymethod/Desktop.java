package io.zoo.animal.lion.creational.factorymethod;

/**
 * Factory method' sub class.
 */
public class Desktop extends Computer {

    private final String ram;
    private final String hdd;
    private final String cpu;

    public Desktop(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    String getRam() {
        return ram;
    }

    @Override
    String getHdd() {
        return hdd;
    }

    @Override
    String getCpu() {
        return cpu;
    }
}
