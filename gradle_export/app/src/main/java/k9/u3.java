package k9;

public final class u3 extends androidx.media3.common.k2 {

    public static final Object f9530f = new Object();

    public final androidx.media3.common.q0 f9531a;

    public final boolean f9532b;

    public final boolean f9533c;

    public final androidx.media3.common.k0 f9534d;

    public final long f9535e;

    public u3(v3 v3Var) {
        this.f9531a = v3Var.getCurrentMediaItem();
        this.f9532b = v3Var.isCurrentMediaItemSeekable();
        this.f9533c = v3Var.isCurrentMediaItemDynamic();
        this.f9534d = v3Var.isCurrentMediaItemLive() ? androidx.media3.common.k0.f1302f : null;
        this.f9535e = e7.i0.H(v3Var.getContentDuration());
    }

    @Override
    public final int getIndexOfPeriod(Object obj) {
        return f9530f.equals(obj) ? 0 : -1;
    }

    @Override
    public final androidx.media3.common.h2 getPeriod(int i10, androidx.media3.common.h2 h2Var, boolean z10) {
        long j9 = this.f9535e;
        Object obj = f9530f;
        h2Var.i(obj, obj, 0, j9, 0L);
        h2Var.f1236f = false;
        return h2Var;
    }

    @Override
    public final int getPeriodCount() {
        return 1;
    }

    @Override
    public final Object getUidOfPeriod(int i10) {
        return f9530f;
    }

    @Override
    public final androidx.media3.common.j2 getWindow(int i10, androidx.media3.common.j2 j2Var, long j9) {
        j2Var.b(f9530f, this.f9531a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f9532b, this.f9533c, this.f9534d, 0L, this.f9535e, 0, 0, 0L);
        j2Var.f1293k = false;
        return j2Var;
    }

    @Override
    public final int getWindowCount() {
        return 1;
    }
}
