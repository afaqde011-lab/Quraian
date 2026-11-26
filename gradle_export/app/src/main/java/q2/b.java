package q2;

public final class b {

    public final int f12721a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f12721a == ((b) obj).f12721a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12721a);
    }

    public final String toString() {
        int i10 = this.f12721a;
        if (i10 == 16) {
            return "Confirm";
        }
        if (i10 == 6) {
            return "ContextClick";
        }
        if (i10 == 13) {
            return "GestureEnd";
        }
        if (i10 == 23) {
            return "GestureThresholdActivate";
        }
        if (i10 == 3) {
            return "KeyboardTap";
        }
        if (i10 == 0) {
            return "LongPress";
        }
        if (i10 == 17) {
            return "Reject";
        }
        if (i10 == 27) {
            return "SegmentFrequentTick";
        }
        if (i10 == 26) {
            return "SegmentTick";
        }
        if (i10 == 9) {
            return "TextHandleMove";
        }
        if (i10 == 22) {
            return "ToggleOff";
        }
        if (i10 == 21) {
            return "ToggleOn";
        }
        return i10 == 1 ? "VirtualKey" : "Invalid";
    }
}
