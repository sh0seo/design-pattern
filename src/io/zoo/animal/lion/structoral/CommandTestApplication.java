package io.zoo.animal.lion.structoral;

public class CommandTestApplication {

    public static void main(String[] args) {
        Command command = new LightCommand(new Light());
        Command command1 = new AlarmCommand(new Alarm());

        Button button = new Button(command);
        button.pressed();

        button.setCommand(command1);
        button.pressed();
    }

    // Invoke
    static class Button {

        private Command command;

        public Button(Command command) {
            this.command = command;
        }

        public void setCommand(Command command) {
            this.command = command;
        }

        public void pressed() {
            command.execute();
        }
    }

    static class LightCommand implements Command {

        private final Light light;

        public LightCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.onLight();
        }
    }

    // Receiver
    static class Light {

        public void onLight() {
            System.out.println("Light On");
        }

        public void offLight() {
            System.out.println("Light off");
        }
    }

    // Receiver
    static class Alarm {

        public void start() {
           System.out.println("Alarm Start");
        }

        public void end() {
           System.out.println("Alarm end");
        }
    }

    static class AlarmCommand implements Command {

        private final Alarm alarm;

        public AlarmCommand(Alarm alarm) {
            this.alarm = alarm;
        }

        @Override
        public void execute() {
            alarm.start();
        }
    }

    // command
    interface Command {
        void execute();
    }
}
