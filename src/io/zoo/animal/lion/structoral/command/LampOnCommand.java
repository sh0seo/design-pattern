package io.zoo.animal.lion.structoral.command;

public class LampOnCommand implements Command {

    private Lamp lamp;

    LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}
