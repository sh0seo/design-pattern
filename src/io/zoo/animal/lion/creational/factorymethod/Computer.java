package io.zoo.animal.lion.creational.factorymethod;

/**
 * Factory Method Design Pattern' Super Class.
 */
public abstract class Computer {

    abstract String getRam();
    abstract String getHdd();
    abstract String getCpu();

    @Override
    public String toString() {
        return "Cpu: " + getRam() + ", Ram: " + getCpu() + ", Hdd: " + getHdd();
    }
}
