package j0;

import a40.a0;
import a40.c0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import l0.f0;
import l0.p0;
import z2.k1;
import z2.l1;

public final class o implements p0 {

    public final int f7786a;

    public final List f7787b;

    public final boolean f7788c;

    public final b2.c f7789d;

    public final b2.h f7790e;

    public final y3.m f7791f;

    public final int f7792g;

    public final int f7793h;

    public final int f7794i;

    public final long f7795j;

    public final Object f7796k;
    public final Object l;
    public final f0 m;

    public final long f7797n;

    public int f7798o;

    public final int f7799p;

    public final int f7800q;

    public final int f7801r;

    public boolean f7802s;

    public int f7803t = Integer.MIN_VALUE;

    public int f7804u;

    public int f7805v;

    public final int[] f7806w;

    public o(int i10, List list, boolean z10, b2.c cVar, b2.h hVar, y3.m mVar, int i11, int i12, int i13, long j9, Object obj, Object obj2, f0 f0Var, long j10) {
        this.f7786a = i10;
        this.f7787b = list;
        this.f7788c = z10;
        this.f7789d = cVar;
        this.f7790e = hVar;
        this.f7791f = mVar;
        this.f7792g = i11;
        this.f7793h = i12;
        this.f7794i = i13;
        this.f7795j = j9;
        this.f7796k = obj;
        this.l = obj2;
        this.m = f0Var;
        this.f7797n = j10;
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            l1 l1Var = (l1) list.get(i15);
            boolean z11 = this.f7788c;
            i14 += z11 ? l1Var.B : l1Var.A;
            iMax = Math.max(iMax, !z11 ? l1Var.B : l1Var.A);
        }
        this.f7799p = i14;
        int i16 = i14 + this.f7794i;
        this.f7800q = i16 >= 0 ? i16 : 0;
        this.f7801r = iMax;
        this.f7806w = new int[this.f7787b.size() * 2];
    }

    @Override
    public final int a() {
        return this.f7787b.size();
    }

    @Override
    public final void b(int i10, int i11, int i12, int i13) throws KotlinNothingValueException {
        n(i10, i12, i13);
    }

    @Override
    public final int c() {
        return this.f7800q;
    }

    @Override
    public final boolean d() {
        return this.f7802s;
    }

    @Override
    public final int e() {
        return 1;
    }

    @Override
    public final Object f(int i10) {
        return ((l1) this.f7787b.get(i10)).U();
    }

    @Override
    public final long g() {
        return this.f7797n;
    }

    @Override
    public final int getIndex() {
        return this.f7786a;
    }

    @Override
    public final Object getKey() {
        return this.f7796k;
    }

    @Override
    public final boolean h() {
        return this.f7788c;
    }

    @Override
    public final void i() {
        this.f7802s = true;
    }

    @Override
    public final long j(int i10) {
        if (i10 == 0 && this.f7787b.size() == 0) {
            if (!this.f7788c) {
                return (((long) this.f7798o) << 32) | (4294967295L & ((long) 0));
            }
            return (((long) this.f7798o) & 4294967295L) | (((long) 0) << 32);
        }
        int i11 = i10 * 2;
        int[] iArr = this.f7806w;
        int i12 = iArr[i11];
        return (((long) iArr[i11 + 1]) & 4294967295L) | (((long) i12) << 32);
    }

    @Override
    public final int k() {
        return 0;
    }

    public final int l(long j9) {
        return (int) (this.f7788c ? j9 & 4294967295L : j9 >> 32);
    }

    public final void m(k1 k1Var, boolean z10) {
        if (this.f7803t == Integer.MIN_VALUE) {
            g0.a.a("position() should be called first");
        }
        List list = this.f7787b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            l1 l1Var = (l1) list.get(i10);
            int i11 = this.f7804u;
            boolean z11 = this.f7788c;
            int i12 = i11 - (z11 ? l1Var.B : l1Var.A);
            int i13 = this.f7805v;
            long j9 = j(i10);
            l0.z zVarA = this.m.a(i10, this.f7796k);
            l2.b bVar = null;
            if (zVarA != null) {
                if (z10) {
                    zVarA.f9823r = j9;
                } else {
                    if (!y3.j.b(zVarA.f9823r, l0.z.f9806s)) {
                        j9 = zVarA.f9823r;
                    }
                    long jD = y3.j.d(j9, ((y3.j) zVarA.f9822q.getValue()).f16590a);
                    if (((l(j9) <= i12 && l(jD) <= i12) || (l(j9) >= i13 && l(jD) >= i13)) && ((Boolean) zVarA.f9815h.getValue()).booleanValue()) {
                        c0.y(zVarA.f9808a, (k00.i) null, (a0) null, new l0.x(zVarA, bVar, 1), 3);
                    }
                    j9 = jD;
                }
                bVar = zVarA.f9819n;
            } else {
                list = list;
                size = size;
            }
            long jD2 = y3.j.d(j9, this.f7795j);
            if (!z10 && zVarA != null) {
                zVarA.m = jD2;
            }
            if (z11) {
                if (bVar != null) {
                    k1Var.getClass();
                    k1.a(k1Var, l1Var);
                    l1Var.q0(y3.j.d(jD2, l1Var.E), 0.0f, bVar);
                } else {
                    k1.u(k1Var, l1Var, jD2, null, 6);
                }
            } else if (bVar == null) {
                k1.p(k1Var, l1Var, jD2);
            } else if (k1Var.f() == y3.m.A || k1Var.g() == 0) {
                k1.a(k1Var, l1Var);
                l1Var.q0(y3.j.d(jD2, l1Var.E), 0.0f, bVar);
            } else {
                long jG = (((long) ((k1Var.g() - l1Var.A) - ((int) (jD2 >> 32)))) << 32) | (4294967295L & ((long) ((int) (jD2 & 4294967295L))));
                k1.a(k1Var, l1Var);
                l1Var.q0(y3.j.d(jG, l1Var.E), 0.0f, bVar);
            }
            i10++;
            list = list;
            size = size;
        }
    }

    public final void n(int i10, int i11, int i12) throws KotlinNothingValueException {
        int i13;
        this.f7798o = i10;
        boolean z10 = this.f7788c;
        this.f7803t = z10 ? i12 : i11;
        List list = this.f7787b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            l1 l1Var = (l1) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f7806w;
            if (z10) {
                b2.c cVar = this.f7789d;
                if (cVar == null) {
                    throw g4.c.o("null horizontalAlignment when isVertical == true");
                }
                iArr[i15] = cVar.a(l1Var.A, i11, this.f7791f);
                iArr[i15 + 1] = i10;
                i13 = l1Var.B;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                b2.h hVar = this.f7790e;
                if (hVar == null) {
                    throw g4.c.o("null verticalAlignment when isVertical == false");
                }
                iArr[i16] = hVar.a(l1Var.B, i12);
                i13 = l1Var.A;
            }
            i10 += i13;
        }
        this.f7804u = -this.f7792g;
        this.f7805v = this.f7803t + this.f7793h;
    }
}
