package com.peerspace.design.patterns.prototype;

import java.util.Objects;

public class PriceFilter extends Filter {

    private String upToHundred;
    private String enterRange;

    public PriceFilter() {

    }

    public PriceFilter(PriceFilter target) {
        super(target);
        if (target != null) {
            this.upToHundred = target.upToHundred;
            this.enterRange = target.enterRange;
        }
    }

    public void setUpToHundred(String upToHundred) {
        this.upToHundred = upToHundred;
    }

    public void setEnterRange(String enterRange) {
        this.enterRange = enterRange;
    }

    @Override
    public Filter clone() {
        return new PriceFilter(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof PriceFilter) || !super.equals(object2)) return false;
        PriceFilter filter2 = (PriceFilter) object2;
        return  Objects.equals(filter2.upToHundred, upToHundred) && Objects.equals(filter2.enterRange, enterRange);
    }

}
