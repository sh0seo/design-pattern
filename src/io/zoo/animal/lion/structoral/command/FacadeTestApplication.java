package io.zoo.animal.lion.structoral.command;

public class FacadeTestApplication {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.On();
    }

    static class Computer {

        private Mouse mouse;

        private Keyboard keyboard;

        private Cpu cpu;

        private Memory memory;

        public Computer() {
            this.mouse = new Mouse();
            this.keyboard = new Keyboard();
            this.cpu = new Cpu();
            this.memory = new Memory();
        }

        public void On() {
            cpu.onLoad();
        }
    }

    static class Mouse {
        public void move() {}
    }

    static class Keyboard {
        public void onKey() {}
    }

    static class Cpu {

        public void onLoad() {}
    }

    static class Memory {

        public void onRead() {}
    }
}
