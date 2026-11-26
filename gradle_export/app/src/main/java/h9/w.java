package h9;

import a8.h0;
import e7.i0;

public final class w implements h0 {
    public final int A = 0;
    public int B;
    public long C;
    public int D;

    public w() {
    }

    public w(int i10, long j9, int i11) {
        this.B = i10;
        this.C = j9;
        this.D = i11;
    }

    public String toString() {
        switch (this.A) {
            case 1:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(i0.U(this.B));
                sb2.append(", size=");
                sb2.append(this.C);
                sb2.append(", minHeaderSize=");
                return g4.c.g(this.D, "}", sb2);
            default:
                return super.toString();
        }
    }
}
