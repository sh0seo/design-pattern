package io.zoo.animal.lion.structoral.command;

public class CommandClient {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        Command lampOn = new LampOnCommand(lamp);
        Command lampOff = new LampOffCommand(lamp);

        Button button = new Button(lampOff);
        button.pressed();

        button.setCommand(lampOn);
        button.pressed();
    }
}
