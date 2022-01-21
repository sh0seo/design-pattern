package io.zoo.animal.lion.creational.abstractfactory;

public class Notebook extends Computer {

    private final String cpu;
    private final String ram;
    private final String sdd;

    public Notebook(String cpu, String ram, String sdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.sdd = sdd;
    }

    @Override
    public String getCpu() {
        return cpu;
    }

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getSdd() {
        return sdd;
    }

}
