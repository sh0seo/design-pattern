package io.zoo.animal.lion.creational.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        System.out.println("Factory Method Pattern");

        Computer server = ComputerFactory.getComputer(ComputerType.Server, "1000", "1000", "1000");
        Computer desktop = ComputerFactory.getComputer(ComputerType.Desktop, "10", "10", "10");

        System.out.println(server.hashCode());
        System.out.println(desktop.hashCode());
    }
}
