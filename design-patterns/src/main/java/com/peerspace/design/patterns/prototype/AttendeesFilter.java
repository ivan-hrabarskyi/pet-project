package com.peerspace.design.patterns.prototype;

import java.util.Objects;

public class AttendeesFilter extends Filter {

    private String oneToTen;
    private String overHundred;
    private String exactCount;

    public AttendeesFilter() {

    }

    public AttendeesFilter(AttendeesFilter target) {
        super(target);
        if (target != null) {
            this.oneToTen = target.oneToTen;
            this.overHundred = target.overHundred;
            this.exactCount = target.exactCount;
        }
    }

    public void setOneToTen(String oneToTen) {
        this.oneToTen = oneToTen;
    }

    public void setOverHundred(String overHundred) {
        this.overHundred = overHundred;
    }

    public void setExactCount(String exactCount) {
        this.exactCount = exactCount;
    }

    @Override
    public Filter clone() {
        return new AttendeesFilter(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof AttendeesFilter) || !super.equals(object2)) return false;
        AttendeesFilter filter2 = (AttendeesFilter) object2;
        return  Objects.equals(filter2.oneToTen, oneToTen) && Objects.equals(filter2.overHundred, overHundred) && Objects.equals(filter2.exactCount, exactCount);
    }

}
