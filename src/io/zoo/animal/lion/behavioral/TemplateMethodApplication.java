package io.zoo.animal.lion.behavioral;

/**
 * Template Method Pattern example.
 */
public class TemplateMethodApplication {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }

    static abstract class AbstractClass {

        public void templateMethod() {
            hook1();
            hook2();
        }

        protected abstract void hook1();

        protected abstract void hook2();
    }

    static class ConcreteClass extends AbstractClass {

        @Override
        protected void hook1() {
            System.out.println("hook1");
        }

        @Override
        protected void hook2() {
            System.out.println("hook2");
        }
    }
}


