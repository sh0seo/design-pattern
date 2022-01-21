package io.zoo.animal.lion.behavioral.state;

public class Off implements LaptopState {

    @Override
    public void pushPower() {
        System.out.println("==> OFF");
    }
}
