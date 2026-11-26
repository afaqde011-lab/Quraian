package h9;

import a8.l0;

public final class r {

    public final l0 f6841a;

    public long f6842b;

    public boolean f6843c;

    public int f6844d;

    public long f6845e;

    public boolean f6846f;

    public boolean f6847g;

    public boolean f6848h;

    public boolean f6849i;

    public boolean f6850j;

    public long f6851k;
    public long l;
    public boolean m;

    public r(l0 l0Var) {
        this.f6841a = l0Var;
    }

    public final void a(int i10) {
        long j9 = this.l;
        if (j9 != -9223372036854775807L) {
            long j10 = this.f6842b;
            long j11 = this.f6851k;
            if (j10 == j11) {
                return;
            }
            int i11 = (int) (j10 - j11);
            this.f6841a.d(j9, this.m ? 1 : 0, i11, i10, null);
        }
    }
}
