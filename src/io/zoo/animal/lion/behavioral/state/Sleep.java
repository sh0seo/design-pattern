package io.zoo.animal.lion.behavioral.state;

public class Sleep implements LaptopState {

    @Override
    public void pushPower() {
        System.out.println("==> SLEEP");
    }
}
