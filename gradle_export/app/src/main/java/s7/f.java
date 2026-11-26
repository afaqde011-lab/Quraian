package s7;

import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

public final class f extends m1 {
    public final long l;
    public final long m;

    public final boolean f13670n;

    public final boolean f13671o;

    public final boolean f13672p;

    public final boolean f13673q;

    public final ArrayList f13674r;

    public final j2 f13675s;

    public e f13676t;

    public ClippingMediaSource$IllegalClippingException f13677u;

    public long f13678v;

    public long f13679w;

    public f(d dVar) {
        super(dVar.f13649a);
        this.l = dVar.f13650b;
        this.m = dVar.f13651c;
        this.f13670n = dVar.f13652d;
        this.f13671o = dVar.f13653e;
        this.f13672p = dVar.f13654f;
        this.f13673q = dVar.f13655g;
        this.f13674r = new ArrayList();
        this.f13675s = new j2();
    }

    public final void C(k2 k2Var) {
        long j9;
        long j10;
        long j11;
        j2 j2Var = this.f13675s;
        k2Var.getWindow(0, j2Var);
        long j12 = j2Var.f1296p;
        e eVar = this.f13676t;
        long j13 = this.m;
        ArrayList arrayList = this.f13674r;
        if (eVar == null || arrayList.isEmpty() || this.f13671o) {
            boolean z10 = this.f13672p;
            j9 = this.l;
            if (z10) {
                long j14 = j2Var.l;
                j9 += j14;
                j10 = j14 + j13;
            } else {
                j10 = j13;
            }
            this.f13678v = j12 + j9;
            this.f13679w = j13 != Long.MIN_VALUE ? j12 + j10 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) arrayList.get(i10);
                long j15 = this.f13678v;
                long j16 = this.f13679w;
                cVar.E = j15;
                cVar.F = j16;
            }
            j11 = j10;
        } else {
            j9 = this.f13678v - j12;
            j11 = j13 != Long.MIN_VALUE ? this.f13679w - j12 : Long.MIN_VALUE;
        }
        try {
            e eVar2 = new e(k2Var, j9, j11, this.f13673q);
            this.f13676t = eVar2;
            m(eVar2);
        } catch (ClippingMediaSource$IllegalClippingException e3) {
            this.f13677u = e3;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((c) arrayList.get(i11)).G = this.f13677u;
            }
        }
    }

    @Override
    public final boolean a(androidx.media3.common.q0 q0Var) {
        a aVar = this.f13714k;
        return aVar.h().f1417e.equals(q0Var.f1417e) && aVar.a(q0Var);
    }

    @Override
    public final y b(a0 a0Var, a1.i iVar, long j9) {
        c cVar = new c(this.f13714k.b(a0Var, iVar, j9), this.f13670n, this.f13678v, this.f13679w);
        this.f13674r.add(cVar);
        return cVar;
    }

    @Override
    public final void j() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f13677u;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.j();
    }

    @Override
    public final void n(y yVar) {
        ArrayList arrayList = this.f13674r;
        ta.c0.A(arrayList.remove(yVar));
        this.f13714k.n(((c) yVar).A);
        if (!arrayList.isEmpty() || this.f13671o) {
            return;
        }
        e eVar = this.f13676t;
        eVar.getClass();
        C(eVar.f13728a);
    }

    @Override
    public final void p() {
        super.p();
        this.f13677u = null;
        this.f13676t = null;
    }

    @Override
    public final void z(k2 k2Var) {
        if (this.f13677u != null) {
            return;
        }
        C(k2Var);
    }
}
