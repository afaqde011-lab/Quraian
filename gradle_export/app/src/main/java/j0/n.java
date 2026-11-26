package j0;

import d0.q1;
import java.util.List;
import java.util.Map;
import z2.x0;

public final class n implements x0 {

    public final o f7771a;

    public final int f7772b;

    public final boolean f7773c;

    public final float f7774d;

    public final x0 f7775e;

    public final float f7776f;

    public final boolean f7777g;

    public final a40.z f7778h;

    public final y3.c f7779i;

    public final long f7780j;

    public final Object f7781k;
    public final int l;
    public final int m;

    public final int f7782n;

    public final q1 f7783o;

    public final int f7784p;

    public final int f7785q;

    public n(o oVar, int i10, boolean z10, float f3, x0 x0Var, float f10, boolean z11, a40.z zVar, y3.c cVar, long j9, List list, int i11, int i12, int i13, q1 q1Var, int i14, int i15) {
        this.f7771a = oVar;
        this.f7772b = i10;
        this.f7773c = z10;
        this.f7774d = f3;
        this.f7775e = x0Var;
        this.f7776f = f10;
        this.f7777g = z11;
        this.f7778h = zVar;
        this.f7779i = cVar;
        this.f7780j = j9;
        this.f7781k = list;
        this.l = i11;
        this.m = i12;
        this.f7782n = i13;
        this.f7783o = q1Var;
        this.f7784p = i14;
        this.f7785q = i15;
    }

    @Override
    public final Map a() {
        return this.f7775e.a();
    }

    @Override
    public final void b() {
        this.f7775e.b();
    }

    @Override
    public final int c() {
        return this.f7775e.c();
    }

    @Override
    public final int d() {
        return this.f7775e.d();
    }

    @Override
    public final u00.k e() {
        return this.f7775e.e();
    }

    public final n f(int i10, boolean z10) {
        o oVar;
        int i11;
        int i12;
        if (this.f7777g) {
            return null;
        }
        ?? r15 = this.f7781k;
        if (r15.isEmpty() || (oVar = this.f7771a) == null) {
            return null;
        }
        int i13 = oVar.f7800q;
        int i14 = this.f7772b - i10;
        if (i14 < 0 || i14 >= i13) {
            return null;
        }
        o oVar2 = (o) h00.q.L0((List) r15);
        o oVar3 = (o) h00.q.T0((List) r15);
        if (oVar2.f7802s || oVar3.f7802s) {
            return null;
        }
        int i15 = this.m;
        int i16 = this.l;
        if (i10 < 0) {
            if (Math.min((oVar2.f7798o + oVar2.f7800q) - i16, (oVar3.f7798o + oVar3.f7800q) - i15) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i16 - oVar2.f7798o, i15 - oVar3.f7798o) <= i10) {
            return null;
        }
        int size = r15.size();
        int i17 = 0;
        while (i17 < size) {
            o oVar4 = (o) r15.get(i17);
            boolean z11 = oVar4.f7788c;
            int[] iArr = oVar4.f7806w;
            if (!oVar4.f7802s) {
                oVar4.f7798o += i10;
                int length = iArr.length;
                for (int i18 = 0; i18 < length; i18++) {
                    int i19 = i18 & 1;
                    if ((z11 && i19 != 0) || (!z11 && i19 == 0)) {
                        iArr[i18] = iArr[i18] + i10;
                    }
                }
                if (z10) {
                    int size2 = oVar4.f7787b.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        l0.z zVarA = oVar4.m.a(i20, oVar4.f7796k);
                        if (zVarA != null) {
                            long j9 = zVarA.l;
                            if (z11) {
                                i11 = (int) (j9 >> 32);
                                i12 = ((int) (j9 & 4294967295L)) + i10;
                            } else {
                                i11 = ((int) (j9 >> 32)) + i10;
                                i12 = (int) (j9 & 4294967295L);
                            }
                            zVarA.l = (((long) i12) & 4294967295L) | (((long) i11) << 32);
                        } else {
                            i17 = i17;
                        }
                        i20++;
                        i17 = i17;
                    }
                }
            }
            i17++;
        }
        return new n(this.f7771a, i14, this.f7773c || i10 > 0, i10, this.f7775e, this.f7776f, this.f7777g, this.f7778h, this.f7779i, this.f7780j, r15, this.l, this.m, this.f7782n, this.f7783o, this.f7784p, this.f7785q);
    }

    public final long g() {
        x0 x0Var = this.f7775e;
        return (((long) x0Var.d()) << 32) | (((long) x0Var.c()) & 4294967295L);
    }
}
