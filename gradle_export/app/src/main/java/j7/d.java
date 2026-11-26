package j7;

import e7.m;
import e7.u;
import java.util.HashMap;
import java.util.List;
import k9.a2;
import k9.l3;
import k9.n3;
import k9.p0;
import k9.p3;
import k9.s1;
import k9.t0;
import k9.v3;
import s7.a0;
import ta.c0;
import tf.y;
import x8.l;

public final class d implements m, p0, l3, n3, e7.h {
    public final int A;
    public final long B;
    public final Object C;

    public d(long j9, int i10, Object obj) {
        this.C = obj;
        this.A = i10;
        this.B = j9;
    }

    public d(a aVar, int i10, long j9, long j10) {
        this.C = aVar;
        this.A = i10;
        this.B = j9;
    }

    public d(l lVar, long j9, int i10) {
        this.C = lVar;
        this.B = j9;
        this.A = i10;
    }

    @Override
    public void accept(Object obj) {
        l lVar = (l) this.C;
        x8.a aVar = (x8.a) obj;
        lVar.f16501h.getClass();
        byte[] bArrK = y.k(aVar.f16476a, aVar.f16478c);
        u uVar = lVar.f16496c;
        uVar.getClass();
        uVar.L(bArrK.length, bArrK);
        lVar.f16494a.g(bArrK.length, uVar);
        long j9 = aVar.f16477b;
        long j10 = this.B;
        if (j9 == -9223372036854775807L) {
            c0.A(lVar.f16501h.f1599s == Long.MAX_VALUE);
        } else {
            long j11 = lVar.f16501h.f1599s;
            j10 = j11 == Long.MAX_VALUE ? j10 + j9 : j9 + j11;
        }
        lVar.f16494a.d(j10, this.A | 1, bArrK.length, 0, null);
    }

    @Override
    public void b(k9.m mVar, int i10) {
        t0 t0Var = (t0) this.C;
        mVar.o1(t0Var.f9440c, i10, this.A, this.B);
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        List list = (List) this.C;
        int i11 = this.A;
        return s1Var.B(a2Var, list, i11 == -1 ? s1Var.f9430t.getCurrentMediaItemIndex() : i11, i11 == -1 ? s1Var.f9430t.getCurrentPosition() : this.B);
    }

    @Override
    public void f(v3 v3Var, a2 a2Var) {
        p3 p3Var = (p3) this.C;
        v3Var.seekTo(p3Var.i2(a2Var, v3Var, this.A), this.B);
    }

    @Override
    public void invoke(Object obj) {
        a aVar = (a) this.C;
        i iVar = (i) obj;
        HashMap map = iVar.f8231h;
        HashMap map2 = iVar.f8232i;
        a0 a0Var = aVar.f8201d;
        if (a0Var != null) {
            String strC = iVar.f8226c.c(aVar.f8199b, a0Var);
            Long l = (Long) map2.get(strC);
            Long l10 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + this.B));
            map.put(strC, Long.valueOf((l10 != null ? l10.longValue() : 0L) + ((long) this.A)));
        }
    }
}
