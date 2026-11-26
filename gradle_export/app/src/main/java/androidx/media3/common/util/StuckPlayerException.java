package androidx.media3.common.util;

import g4.c;

public final class StuckPlayerException extends IllegalStateException {
    public final int A;
    public final int B;

    public StuckPlayerException(int i10, int i11) {
        String strI;
        if (i10 == 0) {
            strI = c.i("Player stuck buffering and not loading for ", i11, " ms");
        } else if (i10 == 1) {
            strI = c.i("Player stuck buffering with no progress for ", i11, " ms");
        } else if (i10 == 2) {
            strI = c.i("Player stuck playing with no progress for ", i11, " ms");
        } else if (i10 == 3) {
            strI = c.i("Player stuck playing without ending for ", i11, " ms");
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            strI = c.i("Player stuck suppressed for ", i11, " ms");
        }
        super(strI);
        this.A = i10;
        this.B = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StuckPlayerException.class != obj.getClass()) {
            return false;
        }
        StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
        return this.A == stuckPlayerException.A && this.B == stuckPlayerException.B;
    }

    public final int hashCode() {
        return ((527 + this.A) * 31) + this.B;
    }
}
