package com.peerspace.design.patterns.prototype;

import java.util.Objects;

public abstract class Filter {

    private String clearButton;
    private String doneButton;

    public Filter() {

    }

    public Filter(Filter target) {
        if (target != null) {
            this.clearButton = target.clearButton;
            this.doneButton = target.doneButton;
        }
    }

    public void setClearButton(String clearButton) {
        this.clearButton = clearButton;
    }

    public void setDoneButton(String doneButton) {
        this.doneButton = doneButton;
    }

    public abstract Filter clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Filter)) return false;
        Filter filter2 = (Filter) object2;
        return  Objects.equals(filter2.clearButton, clearButton) && Objects.equals(filter2.doneButton, doneButton);
    }

}
