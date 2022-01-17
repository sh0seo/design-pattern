package io.zoo.animal.lion;

import io.zoo.animal.lion.creational.builder.ComplexBuilder;
import io.zoo.animal.lion.creational.singleton.SingletonByFactory;
import java.lang.reflect.Constructor;

public class Main {

//    public static void main(String[] args) {
//        SingletonByFactory instanceA = SingletonByFactory.getInstance();
//        SingletonByFactory instanceB = null;
//
//        Constructor[] constructors = SingletonByFactory.class.getDeclaredConstructors();
//        for (Constructor constructor : constructors) {
//            constructor.setAccessible(true);
//            try {
//                instanceB = (SingletonByFactory)constructor.newInstance();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(instanceA.hashCode());
//        System.out.println(instanceB.hashCode());
//    }

    public static void main(String[] args) {
        ComplexBuilder complexBuilder = new ComplexBuilder.Builder(10)
            .build();
        System.out.println(complexBuilder.hashCode());
    }

}
