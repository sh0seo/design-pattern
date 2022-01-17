package io.zoo.animal.lion.creational.protyotype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigDataDeepCopyPrototype implements Cloneable {

    private List<String> pairingIds;

    private int index;

    public BigDataDeepCopyPrototype(int index, List<String> pairingIds) {
        this.index = index;
        this.pairingIds = pairingIds;
    }

    public List<String> getPairingIds() {
        return pairingIds;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> newList = new ArrayList<>();
        for (String pairingId : pairingIds) {
            pairingIds.add(pairingId);
        }
        return new BigDataDeepCopyPrototype(index, newList);
    }

}
