package io.zoo.animal.lion.creational.builder;

/**
 * Creational Builder 패턴.
 */
public class ComplexBuilder {

    private int id;

    private String name;

    private ComplexBuilder(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static class Builder {

        private int id;

        private String name;

        public Builder(int id) {
            this.id = id;
        }

        public ComplexBuilder build() {
            return new ComplexBuilder(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

    }

}
