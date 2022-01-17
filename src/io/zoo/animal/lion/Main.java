package io.zoo.animal.lion;

import io.zoo.animal.lion.creational.protyotype.BigDataDeepCopyPrototype;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Singleton Holer 방식.
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

    // builder pattern
//    public static void main(String[] args) {
//        ComplexBuilder complexBuilder = new ComplexBuilder.Builder(10)
//            .build();
//        System.out.println(complexBuilder.hashCode());
//    }

    // prototype pattern test
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> ids = new ArrayList<>();
        ids.add("1. A");
        ids.add("2. B");
        ids.add("3. C");

        BigDataDeepCopyPrototype bigDataPrototype = new BigDataDeepCopyPrototype(7, ids);

        System.out.println(bigDataPrototype.getPairingIds());

        BigDataDeepCopyPrototype bigDataPrototype1 = (BigDataDeepCopyPrototype) bigDataPrototype.clone();
        bigDataPrototype1.getPairingIds().add("4.D");

        System.out.println(bigDataPrototype1.getPairingIds());

        System.out.println(bigDataPrototype.getPairingIds());
    }

}
