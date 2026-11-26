package k0;

import a40.c0;
import java.util.List;
import l0.f0;
import l0.p0;
import z2.k1;
import z2.l1;

public final class q implements p0 {

    public final int f8508a;

    public final Object f8509b;

    public final int f8510c;

    public final y3.m f8511d;

    public final int f8512e;

    public final int f8513f;

    public final List f8514g;

    public final long f8515h;

    public final Object f8516i;

    public final f0 f8517j;

    public final long f8518k;
    public final int l;
    public final int m;

    public final int f8519n;

    public final int f8520o;

    public int f8521p = Integer.MIN_VALUE;

    public int f8522q;

    public int f8523r;

    public final long f8524s;

    public long f8525t;

    public int f8526u;

    public int f8527v;

    public boolean f8528w;

    public q(int i10, Object obj, int i11, int i12, y3.m mVar, int i13, int i14, List list, long j9, Object obj2, f0 f0Var, long j10, int i15, int i16) {
        this.f8508a = i10;
        this.f8509b = obj;
        this.f8510c = i11;
        this.f8511d = mVar;
        this.f8512e = i13;
        this.f8513f = i14;
        this.f8514g = list;
        this.f8515h = j9;
        this.f8516i = obj2;
        this.f8517j = f0Var;
        this.f8518k = j10;
        this.l = i15;
        this.m = i16;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            iMax = Math.max(iMax, ((l1) list.get(i17)).B);
        }
        this.f8519n = iMax;
        int i18 = i12 + iMax;
        this.f8520o = i18 >= 0 ? i18 : 0;
        this.f8524s = (((long) this.f8510c) << 32) | (((long) iMax) & 4294967295L);
        this.f8525t = 0L;
        this.f8526u = -1;
        this.f8527v = -1;
    }

    @Override
    public final int a() {
        return this.f8514g.size();
    }

    @Override
    public final void b(int i10, int i11, int i12, int i13) {
        m(i10, i11, i12, i13, -1, -1);
    }

    @Override
    public final int c() {
        return this.f8520o;
    }

    @Override
    public final boolean d() {
        return this.f8528w;
    }

    @Override
    public final int e() {
        return this.m;
    }

    @Override
    public final Object f(int i10) {
        return ((l1) this.f8514g.get(i10)).U();
    }

    @Override
    public final long g() {
        return this.f8518k;
    }

    @Override
    public final int getIndex() {
        return this.f8508a;
    }

    @Override
    public final Object getKey() {
        return this.f8509b;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i() {
        this.f8528w = true;
    }

    @Override
    public final long j(int i10) {
        return this.f8525t;
    }

    @Override
    public final int k() {
        return this.l;
    }

    public final void l(k1 k1Var, boolean z10) {
        if (this.f8521p == Integer.MIN_VALUE) {
            g0.a.a("position() should be called first");
        }
        List list = this.f8514g;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l1 l1Var = (l1) list.get(i10);
            int i11 = this.f8522q - l1Var.B;
            int i12 = this.f8523r;
            long j9 = this.f8525t;
            l0.z zVarA = this.f8517j.a(i10, this.f8509b);
            l2.b bVar = null;
            if (zVarA != null) {
                if (z10) {
                    zVarA.f9823r = j9;
                } else {
                    long jD = y3.j.d(!y3.j.b(zVarA.f9823r, l0.z.f9806s) ? zVarA.f9823r : j9, ((y3.j) zVarA.f9822q.getValue()).f16590a);
                    int i13 = (int) (j9 & 4294967295L);
                    if (((i13 <= i11 && ((int) (jD & 4294967295L)) <= i11) || (i13 >= i12 && ((int) (jD & 4294967295L)) >= i12)) && ((Boolean) zVarA.f9815h.getValue()).booleanValue()) {
                        c0.y(zVarA.f9808a, (k00.i) null, (a40.a0) null, new l0.x(zVarA, bVar, 1), 3);
                    }
                    j9 = jD;
                }
                bVar = zVarA.f9819n;
            }
            long jD2 = y3.j.d(j9, this.f8515h);
            if (!z10 && zVarA != null) {
                zVarA.m = jD2;
            }
            if (bVar != null) {
                k1Var.getClass();
                k1.a(k1Var, l1Var);
                l1Var.q0(y3.j.d(jD2, l1Var.E), 0.0f, bVar);
            } else {
                k1.u(k1Var, l1Var, jD2, null, 6);
            }
        }
    }

    public final void m(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f8521p = i13;
        if (this.f8511d == y3.m.B) {
            i11 = (i12 - i11) - this.f8510c;
        }
        this.f8525t = (((long) i11) << 32) | (((long) i10) & 4294967295L);
        this.f8526u = i14;
        this.f8527v = i15;
        this.f8522q = -this.f8512e;
        this.f8523r = i13 + this.f8513f;
    }
}
