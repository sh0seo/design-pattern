package io.zoo.animal.lion.creational.singleton;

/**
 * enum을 이용한 singleton
 */
public enum SingletonByEnum {
    INSTANCE;

    public static SingletonByEnum getInstance() {
        return INSTANCE;
    }

}
