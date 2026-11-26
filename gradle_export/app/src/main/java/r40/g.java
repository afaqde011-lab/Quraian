package r40;

import qd.j0;

public final class g extends androidx.media3.common.q {
    public final boolean D;

    public g(j0 j0Var, boolean z) {
        super(j0Var, 10, false);
        this.D = z;
    }

    public final void k(byte b) {
        if (this.D) {
            q(String.valueOf(b & 255));
        } else {
            o(String.valueOf(b & 255));
        }
    }

    public final void m(int i) {
        boolean z = this.D;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            q(unsignedString);
        } else {
            o(unsignedString);
        }
    }

    public final void n(long j) {
        boolean z = this.D;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            q(unsignedString);
        } else {
            o(unsignedString);
        }
    }

    public final void p(short s) {
        if (this.D) {
            q(String.valueOf(s & 65535));
        } else {
            o(String.valueOf(s & 65535));
        }
    }
}
