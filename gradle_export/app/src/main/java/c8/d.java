package c8;

public final class d implements a {

    public final int f2993a;

    public final int f2994b;

    public final int f2995c;

    public final int f2996d;

    public final int f2997e;

    public final int f2998f;

    public d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f2993a = i10;
        this.f2994b = i11;
        this.f2995c = i12;
        this.f2996d = i13;
        this.f2997e = i14;
        this.f2998f = i15;
    }

    public final int a() {
        int i10 = this.f2993a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        e7.a.m("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i10));
        return -1;
    }

    @Override
    public final int getType() {
        return 1752331379;
    }
}
