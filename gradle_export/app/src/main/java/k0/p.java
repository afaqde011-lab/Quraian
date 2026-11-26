package k0;

import d0.q1;
import java.util.List;
import java.util.Map;
import z2.x0;

public final class p implements x0 {

    public final r f8491a;

    public final int f8492b;

    public final boolean f8493c;

    public final float f8494d;

    public final x0 f8495e;

    public final float f8496f;

    public final boolean f8497g;

    public final a40.z f8498h;

    public final y3.c f8499i;

    public final int f8500j;

    public final u00.k f8501k;
    public final u00.k l;
    public final Object m;

    public final int f8502n;

    public final int f8503o;

    public final int f8504p;

    public final q1 f8505q;

    public final int f8506r;

    public final int f8507s;

    public p(r rVar, int i10, boolean z10, float f3, x0 x0Var, float f10, boolean z11, a40.z zVar, y3.c cVar, int i11, u00.k kVar, u00.k kVar2, List list, int i12, int i13, int i14, q1 q1Var, int i15, int i16) {
        this.f8491a = rVar;
        this.f8492b = i10;
        this.f8493c = z10;
        this.f8494d = f3;
        this.f8495e = x0Var;
        this.f8496f = f10;
        this.f8497g = z11;
        this.f8498h = zVar;
        this.f8499i = cVar;
        this.f8500j = i11;
        this.f8501k = kVar;
        this.l = kVar2;
        this.m = list;
        this.f8502n = i12;
        this.f8503o = i13;
        this.f8504p = i14;
        this.f8505q = q1Var;
        this.f8506r = i15;
        this.f8507s = i16;
    }

    @Override
    public final Map a() {
        return this.f8495e.a();
    }

    @Override
    public final void b() {
        this.f8495e.b();
    }

    @Override
    public final int c() {
        return this.f8495e.c();
    }

    @Override
    public final int d() {
        return this.f8495e.d();
    }

    @Override
    public final u00.k e() {
        return this.f8495e.e();
    }

    public final p f(int i10, boolean z10) {
        r rVar;
        ?? r14;
        int i11;
        long j9;
        if (this.f8497g) {
            return null;
        }
        ?? r4 = this.m;
        if (r4.isEmpty() || (rVar = this.f8491a) == null) {
            return null;
        }
        int i12 = rVar.f8535g;
        int i13 = this.f8492b - i10;
        if (i13 < 0 || i13 >= i12) {
            return null;
        }
        q qVar = (q) h00.q.L0((List) r4);
        q qVar2 = (q) h00.q.T0((List) r4);
        if (qVar.f8528w || qVar2.f8528w) {
            return null;
        }
        int i14 = this.f8503o;
        int i15 = this.f8502n;
        q1 q1Var = this.f8505q;
        if (i10 < 0) {
            if (Math.min((rd.a.L(qVar, q1Var) + qVar.f8520o) - i15, (rd.a.L(qVar2, q1Var) + qVar2.f8520o) - i14) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i15 - rd.a.L(qVar, q1Var), i14 - rd.a.L(qVar2, q1Var)) <= i10) {
            return null;
        }
        int size = r4.size();
        int i16 = 0;
        ?? r7 = r4;
        while (i16 < size) {
            q qVar3 = (q) r7.get(i16);
            qVar3.getClass();
            if (qVar3.f8528w) {
                r14 = r7;
                i11 = size;
            } else {
                long j10 = qVar3.f8525t;
                long j11 = 4294967295L;
                qVar3.f8525t = (((long) ((int) (j10 >> 32))) << 32) | (((long) (((int) (j10 & 4294967295L)) + i10)) & 4294967295L);
                if (z10) {
                    int size2 = qVar3.f8514g.size();
                    int i17 = 0;
                    r7 = r7;
                    while (i17 < size2) {
                        l0.z zVarA = qVar3.f8517j.a(i17, qVar3.f8509b);
                        if (zVarA != null) {
                            long j12 = zVarA.l;
                            j9 = j11;
                            zVarA.l = (((long) (((int) (j12 & j9)) + i10)) & j9) | (((long) ((int) (j12 >> 32))) << 32);
                        } else {
                            j9 = j11;
                        }
                        i17++;
                        r7 = r7;
                        j11 = j9;
                        size = size;
                    }
                }
                r14 = r7;
                i11 = size;
            }
            i16++;
            i13 = i13;
            r7 = r14;
            size = i11;
        }
        return new p(this.f8491a, i13, this.f8493c || i10 > 0, i10, this.f8495e, this.f8496f, this.f8497g, this.f8498h, this.f8499i, this.f8500j, this.f8501k, this.l, r7, this.f8502n, this.f8503o, this.f8504p, q1Var, this.f8506r, this.f8507s);
    }

    public final long g() {
        x0 x0Var = this.f8495e;
        return (((long) x0Var.d()) << 32) | (((long) x0Var.c()) & 4294967295L);
    }
}
