package io.zoo.animal.lion.behavioral;

/**
 * Decorator Pattern example
 * 이해를 위해 class 들을 파일 분리 없이 main에 작성.
 */
public class DecoratorApplication {

    public static void main(String[] args) {
        Display line = new RoadDisplay();
        line.draw();

        line = new LineDecorator(line);
        line.draw();

        line = new CrossLineDecorator(line);
        line.draw();
//        Beverage beverage = new Espresso();
//        beverage = new Shot(beverage);
//        beverage = new Whip(beverage);
//
//        System.out.println(beverage.getDescription() + ": " + beverage.cost());
//
//        beverage = new Americano();
//        System.out.println(beverage.getDescription() + ": " + beverage.cost());
    }

    static abstract class Display {
        public abstract void draw();
    }

    static class RoadDisplay extends Display {

        @Override
        public void draw() {
            System.out.println("Default Line");
        }
    }

    static class DisplayDecorator extends Display {

        private final Display display;

        public DisplayDecorator(Display display) {
            this.display = display;
        }

        @Override
        public void draw() {
            display.draw();
        }
    }

    static class LineDecorator extends DisplayDecorator {

        public LineDecorator(Display display) {
            super(display);
        }

        @Override
        public void draw() {
            super.draw();
            System.out.print("\t차선 표시");
        }
    }

    static class CrossLineDecorator extends DisplayDecorator {

        public CrossLineDecorator(Display display) {
            super(display);
        }

        @Override
        public void draw() {
            super.draw();
            System.out.println("\t교차로 표시");
        }
    }

    /// 여기부터 커피만드는 방법을 이용한 예시
    static abstract class Beverage {

        String description = "Menu name is No title";

        public abstract int cost();

        public String getDescription() {
            return description;
        }
    }

    static class Espresso extends Beverage {

        public Espresso() {
            super();
            description = "에스프레소";
        }

        @Override
        public int cost() {
            return 2500;
        }
    }

    static class Americano extends Beverage {

        public Americano() {
            super();
            description = "아메리카노";
        }

        @Override
        public int cost() {
            return 3000;
        }
    }

    /**
     * 추가 옵션들은 CondimentDecorator를 상속.
     */
    static abstract class CondimentDecorator extends Beverage {

        public abstract String getDescription();
    }

    static class Whip extends CondimentDecorator {

        Beverage beverage;

        public Whip(Beverage beverage) {
            super();
            this.beverage = beverage;
        }

        @Override
        public int cost() {
            return beverage.cost() + 1000;
        }

        @Override
        public String getDescription() {
            return beverage.getDescription() + ",휘핑크림";
        }
    }

    static class Shot extends CondimentDecorator {

        Beverage beverage;

        public Shot(Beverage beverage) {
            super();
            this.beverage = beverage;
        }

        @Override
        public int cost() {
            return beverage.cost() + 500;
        }

        @Override
        public String getDescription() {
            return beverage.getDescription() + ",샷";
        }
    }
}
