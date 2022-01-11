package io.zoo.animal.lion.singleton;

/**
 * 패토리 메소드를 이용한 singleton
 */
public class SingletonByFactory {

    private static final SingletonByFactory INSTANCE = new SingletonByFactory();

    public static SingletonByFactory getInstance() {
        return INSTANCE;
    }

    private SingletonByFactory() {}

}
