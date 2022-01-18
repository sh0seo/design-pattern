package io.zoo.animal.lion.creational.factorymethod;

/**
 * Computer group의 Factory Class.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu) {
        switch (type) {
            case Server:
                return new Server(ram, hdd, cpu);
            case Desktop:
                return new Desktop(ram, hdd, cpu);
            default:
                return null;
        }
    }

}
