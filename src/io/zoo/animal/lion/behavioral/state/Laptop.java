package io.zoo.animal.lion.behavioral.state;

public class Laptop {

    private LaptopState laptopState;

    public Laptop() {
        laptopState = new Off();
    }

    public void setLaptopState(LaptopState laptopState) {
        this.laptopState = laptopState;
    }

    public void pushPower() {
        laptopState.pushPower();
    }
}
