package io.zoo.animal.lion.creational.singleton;

/**
 * 늦은 초기화를 이용한 singleton
 */
public class SingletonByThreadSafeLazyInitialize {

    private static SingletonByThreadSafeLazyInitialize INSTANCE;

    private SingletonByThreadSafeLazyInitialize() {}

    public static SingletonByThreadSafeLazyInitialize getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonByLazyInitialize.class) {
                INSTANCE = new SingletonByThreadSafeLazyInitialize();
            }
        }
        return INSTANCE;
    }

}
