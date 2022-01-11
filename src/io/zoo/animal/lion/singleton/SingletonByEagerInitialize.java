package io.zoo.animal.lion.singleton;

/**
 * 빠른 초기화를 이용한 singleton
 */
public class SingletonByEagerInitialize {

    private static SingletonByEagerInitialize INSTANCE = new SingletonByEagerInitialize();

    private SingletonByEagerInitialize() {}

    public static SingletonByEagerInitialize getInstance() {
        return INSTANCE;
    }

}
