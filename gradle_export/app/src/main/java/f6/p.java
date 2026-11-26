package f6;

import androidx.glance.appwidget.protobuf.b0;

public enum p implements b0 {
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);

    public final int A;

    p(int i10) {
        this.A = i10;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.A;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
