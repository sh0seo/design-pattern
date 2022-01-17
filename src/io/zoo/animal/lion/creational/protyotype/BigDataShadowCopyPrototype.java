package io.zoo.animal.lion.creational.protyotype;

import java.util.List;

public class BigDataShadowCopyPrototype implements Cloneable {

    private List<String> pairingIds;

    private int index;

    public BigDataShadowCopyPrototype(List<String> pairingIds) {
        this.pairingIds = pairingIds;
    }

    public List<String> getPairingIds() {
        return pairingIds;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
