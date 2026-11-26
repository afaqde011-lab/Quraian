package q8;

import e7.u;

public final class a extends b {

    public final int f12776a;

    public final long f12777b;

    public final long f12778c;

    public a(int i10, long j9, long j10) {
        this.f12776a = i10;
        switch (i10) {
            case 1:
                this.f12777b = j9;
                this.f12778c = j10;
                break;
            default:
                this.f12777b = j10;
                this.f12778c = j9;
                break;
        }
    }

    public static long d(long j9, u uVar) {
        long jA = uVar.A();
        if ((128 & jA) != 0) {
            return 8589934591L & ((((jA & 1) << 32) | uVar.C()) + j9);
        }
        return -9223372036854775807L;
    }

    @Override
    public final String toString() {
        switch (this.f12776a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f12777b);
                sb2.append(", identifier= ");
                return a1.b.k(this.f12778c, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f12777b);
                sb3.append(", playbackPositionUs= ");
                return a1.b.k(this.f12778c, " }", sb3);
        }
    }
}
