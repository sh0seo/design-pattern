package io.zoo.animal.lion.creational.singleton;

/**
 * 늦은 초기화를 이용한 singleton
 */
public class SingletonByLazyInitialize {

    private static SingletonByLazyInitialize INSTANCE;

    private SingletonByLazyInitialize() {}

    public static SingletonByLazyInitialize getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonByLazyInitialize();
        }
        return INSTANCE;
    }

}
