package ah;

import android.app.PendingIntent;

public final class b extends a {
    public final PendingIntent A;
    public final boolean B;

    public b(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.A = pendingIntent;
        this.B = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            b bVar = (b) ((a) obj);
            if (this.A.equals(bVar.A) && this.B == bVar.B) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.B ? 1237 : 1231) ^ ((this.A.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return g4.c.l(g4.c.n("ReviewInfo{pendingIntent=", this.A.toString(), ", isNoOp="), this.B, "}");
    }
}
