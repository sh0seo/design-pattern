package io.zoo.animal.lion.creational.singleton;

/**
 * public static을 이용한 singleton
 */
public class SingletonByPublicStaticVariable {

    public static final SingletonByPublicStaticVariable INSTANCE = new SingletonByPublicStaticVariable();

    private SingletonByPublicStaticVariable() {}

}
