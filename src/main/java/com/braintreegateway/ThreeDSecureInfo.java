package com.braintreegateway;

import com.braintreegateway.util.NodeWrapper;

public class ThreeDSecureInfo {

    private boolean liabilityShifted;
    private boolean liabilityShiftPossible;
    private String enrolled;
    private String status;
    private String xid;
    private String cavv;

    public ThreeDSecureInfo(NodeWrapper node) {
        liabilityShifted = node.findBoolean("liability-shifted");
        liabilityShiftPossible = node.findBoolean("liability-shift-possible");
        enrolled = node.findString("enrolled");
        status = node.findString("status");
        xid = node.findString("xid");
        cavv = node.findString("cavv");
    }

    public String getStatus() {
        return status;
    }

    public String getXID() {
        return xid;
    }

    public String getCAVV() {
        return cavv;
    }

    public String getEnrolled() {
        return enrolled;
    }

    public boolean isLiabilityShifted() {
        return liabilityShifted;
    }

    public boolean isLiabilityShiftPossible() {
        return liabilityShiftPossible;
    }
}
