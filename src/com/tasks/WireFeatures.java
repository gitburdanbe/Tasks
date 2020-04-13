package com.tasks;

public class WireFeatures {

    private boolean removableness;
    private int wireImpedance;

    public void setWireImpedance(int wireImpedance) {
        this.wireImpedance = wireImpedance;
    }

    public int getWireImpedance() {
        return wireImpedance;
    }

    public boolean getRemovableness() {
        return removableness;
    }

    public void setRemovableness(boolean removableness) {
        this.removableness = removableness;
    }
}
