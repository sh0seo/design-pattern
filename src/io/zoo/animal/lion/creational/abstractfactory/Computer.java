package io.zoo.animal.lion.creational.abstractfactory;

/**
 * Abstract Factory Method
 */
public abstract class Computer {

    public abstract String getCpu();
    public abstract String getRam();
    public abstract String getSdd();

    @Override
    public String toString() {
        return "CPU: " + getCpu() + ", RAM: " + getRam() + ", SDD: " + getSdd();
    }

}
