package io.zoo.animal.lion.structoral.command;

public class LampOffCommand implements Command {

    private Lamp lamp;

    LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }
}
