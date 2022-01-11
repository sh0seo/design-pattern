package io.zoo.animal.lion.singleton;

/**
 * static block을 이용한 singleton
 */
public class SingletonByStaticBlock {

    private static SingletonByStaticBlock INSTANCE;

    static {
        try {
            INSTANCE = new SingletonByStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static SingletonByStaticBlock getInstance() {
        return INSTANCE;
    }

    private SingletonByStaticBlock() {}

}
