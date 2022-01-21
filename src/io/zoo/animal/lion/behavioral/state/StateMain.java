package io.zoo.animal.lion.behavioral.state;

public class StateMain {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        LaptopState sleep = new Sleep();
        LaptopState on = new On();
        LaptopState off = new Off();

        laptop.pushPower();

        laptop.setLaptopState(on);
        laptop.pushPower();

        laptop.setLaptopState(sleep);
        laptop.pushPower();

        laptop.setLaptopState(off);
        laptop.pushPower();
    }
}
