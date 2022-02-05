package io.zoo.animal.lion.creational;

/**
 * Builder Pattern
 */
public class BuilderApplication {

    public static void main(String[] args) {
        Coffee coffee = Coffee.builder()
            .setBeans("Beans")
            .setWater(10)
            .build();

        System.out.println(coffee.toString());
    }

    static class Coffee {

        private final String beans;

        private final int water;

        private Coffee(String beans, int water) {
            this.beans = beans;
            this.water = water;
        }

        public static Builder builder() {
            return new Builder();
        }

        @Override
        public String toString() {
            return "Coffee{" +
                "beans='" + beans + '\'' +
                ", water=" + water +
                '}';
        }

        public static class Builder {

            private String beans;

            private int water;

            public Builder setBeans(String beans) {
                this.beans = beans;
                return this;
            }

            public Builder setWater(int water) {
                this.water = water;
                return this;
            }

            public Coffee build() {
                return new Coffee(beans, water);
            }
        }
    }
}
