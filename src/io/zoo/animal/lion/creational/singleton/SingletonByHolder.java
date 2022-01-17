package io.zoo.animal.lion.creational.singleton;

/**
 * nested class holder를 이용한 singleton
 */
public class SingletonByHolder {

    private SingletonByHolder() {}

    public static SingletonByHolder getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final SingletonByHolder INSTANCE = new SingletonByHolder();
    }

}
