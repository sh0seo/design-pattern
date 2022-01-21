package io.zoo.animal.lion.creational.abstractfactory;

public class Server extends Computer {

    private final String cpu;
    private final String ram;
    private final String sdd;

    public Server(String cpu, String ram, String sdd) {
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
