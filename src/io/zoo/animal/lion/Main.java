package io.zoo.animal.lion;

import io.zoo.animal.lion.singleton.SingletonByFactory;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
        SingletonByFactory instanceA = SingletonByFactory.getInstance();
        SingletonByFactory instanceB = null;

        Constructor[] constructors = SingletonByFactory.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instanceB = (SingletonByFactory)constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(instanceA.hashCode());
        System.out.println(instanceB.hashCode());

    }

}
