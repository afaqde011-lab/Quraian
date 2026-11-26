package mu;

import a10.h0;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.Constants;
import g1.s1;
import g1.z6;
import h0.c1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.b0;
import java.util.Arrays;
import java.util.Locale;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.z0;
import m3.r0;
import oo.s0;
import oo.t0;
import w.c0;
import w.x0;
import w.y0;
import x.q1;
import z2.w0;

public final class h implements u00.o {
    public final int A = 0;
    public final boolean B;
    public final int C;
    public final float D;
    public final z0 E;
    public final u00.k F;
    public final Object G;
    public final Object H;
    public final Object I;

    public h(float f, boolean z, int i, u00.k kVar, z0 z0Var, z0 z0Var2, z0 z0Var3, r0 r0Var) {
        this.D = f;
        this.B = z;
        this.C = i;
        this.F = kVar;
        this.E = z0Var;
        this.G = z0Var2;
        this.H = z0Var3;
        this.I = r0Var;
    }

    public h(p1 p1Var, oo.z0 z0Var, boolean z, int i, p2 p2Var, float f, z0 z0Var2, u00.k kVar) {
        this.G = p1Var;
        this.H = z0Var;
        this.B = z;
        this.C = i;
        this.I = p2Var;
        this.D = f;
        this.E = z0Var2;
        this.F = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object eVar;
        u00.n nVar;
        l1.c cVar;
        float f;
        z0 z0Var;
        z0 z0Var2;
        ?? r3;
        g0 g0Var;
        x0 x0VarA;
        switch (this.A) {
            case 0:
                z0 z0Var3 = (z0) this.G;
                z0 z0Var4 = (z0) this.H;
                r0 r0Var = (r0) this.I;
                u00.n innerTextField = (u00.n) obj;
                g0 g0Var2 = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(innerTextField, "innerTextField");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= g0Var2.i(innerTextField) ? 4 : 2;
                }
                int i = iIntValue;
                boolean z = (i & 19) != 18;
                g0 g0Var3 = g0Var2;
                a30.x xVar = g0Var3.a;
                if (g0Var3.S(i & 1, z)) {
                    b2.r rVarD = z1.d(b2.o.A, 1.0f);
                    v1 v1VarA = t1.a(h0.i.h, b2.b.K, g0Var2, 54);
                    int iHashCode = Long.hashCode(g0Var3.T);
                    m1 m1VarM = g0Var3.m();
                    b2.r rVarC = b2.a.c(rVarD, g0Var2);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    u00.n nVar2 = b3.h.f;
                    l1.q.I(v1VarA, g0Var2, nVar2);
                    b3.f fVar = b3.h.e;
                    l1.q.I(m1VarM, g0Var2, fVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar2 = b3.h.g;
                    l1.q.I(numValueOf, g0Var2, fVar2);
                    b3.e eVar2 = b3.h.h;
                    l1.q.E(g0Var2, eVar2);
                    b3.f fVar3 = b3.h.d;
                    l1.q.I(rVarC, g0Var2, fVar3);
                    long j = dl.a.i;
                    long j2 = dl.a.r;
                    boolean z2 = this.B;
                    boolean zH = g0Var3.h(z2);
                    int i2 = this.C;
                    boolean zE = zH | g0Var3.e(i2);
                    u00.k kVar = this.F;
                    boolean zG = zE | g0Var3.g(kVar);
                    Object objN = g0Var3.N();
                    z0 z0Var5 = this.E;
                    l1.c cVar2 = l1.i.a;
                    if (zG || objN == cVar2) {
                        nVar = nVar2;
                        cVar = cVar2;
                        f = 1.0f;
                        eVar = new e(z2, i2, kVar, z0Var5, z0Var3, z0Var4, 2);
                        g0Var3.n0(eVar);
                    } else {
                        nVar = nVar2;
                        eVar = objN;
                        cVar = cVar2;
                        f = 1.0f;
                    }
                    float f2 = this.D;
                    d.t(2131231207, j, j2, f2, (u00.a) eVar, g0Var2, 0);
                    if (f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    b2.r rVarC2 = z1.c(new c1(f, true), f);
                    w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode2 = Long.hashCode(g0Var3.T);
                    m1 m1VarM2 = g0Var3.m();
                    b2.r rVarC3 = b2.a.c(rVarC2, g0Var2);
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    u00.n nVar3 = nVar;
                    l1.q.I(w0VarD, g0Var2, nVar3);
                    l1.q.I(m1VarM2, g0Var2, fVar);
                    x5.u(iHashCode2, g0Var2, fVar2, g0Var2, eVar2);
                    l1.q.I(rVarC3, g0Var2, fVar3);
                    String str = "00:00";
                    if (((Boolean) z0Var5.getValue()).booleanValue()) {
                        int[] iArr = (int[]) z0Var3.getValue();
                        if (iArr.length == 4) {
                            int i3 = (iArr[0] * 10) + iArr[1];
                            if (i3 > 99) {
                                i3 = 99;
                            }
                            int i4 = (iArr[2] * 10) + iArr[3];
                            str = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4 > 59 ? 59 : i4)}, 2));
                        }
                        z0Var = z0Var3;
                        z0Var2 = z0Var4;
                    } else {
                        int iY = ab.a0.y(i2, 0, 5999);
                        z0Var = z0Var3;
                        int iY2 = ab.a0.y(iY / 60, 0, 99);
                        int iY3 = ab.a0.y(iY % 60, 0, 59);
                        z0Var2 = z0Var4;
                        StringBuilder sb = new StringBuilder();
                        sb.append(iY2 / 10);
                        sb.append(iY2 % 10);
                        sb.append(iY3 / 10);
                        sb.append(iY3 % 10);
                        String string = sb.toString();
                        if (string.length() == 4) {
                            str = string.charAt(0) + string.charAt(1) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + string.charAt(2) + string.charAt(3);
                        }
                    }
                    z6.b(str, (b2.r) null, 0L, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, r0Var, g0Var2, 0, 0, 130046);
                    b2.r rVarB = h0.s.a.b();
                    w0 w0VarD2 = h0.o.d(b2.b.A, false);
                    int iHashCode3 = Long.hashCode(g0Var3.T);
                    m1 m1VarM3 = g0Var3.m();
                    b2.r rVarC4 = b2.a.c(rVarB, g0Var2);
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    l1.q.I(w0VarD2, g0Var2, nVar3);
                    l1.q.I(m1VarM3, g0Var2, fVar);
                    x5.u(iHashCode3, g0Var2, fVar2, g0Var2, eVar2);
                    l1.q.I(rVarC4, g0Var2, fVar3);
                    innerTextField.invoke(g0Var2, Integer.valueOf(i & 14));
                    g0Var3.r(true);
                    g0Var3.r(true);
                    long j3 = dl.a.L;
                    boolean zH2 = g0Var3.h(z2) | g0Var3.e(i2) | g0Var3.g(kVar);
                    Object objN2 = g0Var3.N();
                    if (zH2 || objN2 == cVar) {
                        objN2 = new e(z2, i2, kVar, z0Var5, z0Var, z0Var2, 3);
                        g0Var3.n0(objN2);
                    }
                    d.t(2131231361, j3, j, f2, (u00.a) objN2, g0Var2, 0);
                    g0Var3.r(true);
                } else {
                    g0Var3.V();
                }
                break;
            default:
                p1 p1Var = (p1) this.G;
                oo.z0 z0Var6 = (oo.z0) this.H;
                p2 p2Var = (p2) this.I;
                h0.t BoxWithConstraints = (h0.t) obj;
                g0 g0Var4 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= g0Var4.g(BoxWithConstraints) ? 4 : 2;
                }
                g0 g0Var5 = g0Var4;
                if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    float f3 = p30.f.j0(new y3.f((BoxWithConstraints.b() - p1Var.b) - p1Var.d), new y3.f(BoxWithConstraints.c())).A;
                    lo.e eVar3 = z0Var6.a;
                    Object obj4 = l1.i.a;
                    if (eVar3 == null) {
                        g0Var5.c0(1864135027);
                        g0Var5.r(false);
                        g0Var = g0Var5;
                        r3 = 0;
                    } else {
                        g0Var5.c0(1864135028);
                        float f4 = 12;
                        b2.r rVarM = h0.c.m(z1.m(b2.o.A, f3), 1.0f);
                        boolean zG2 = g0Var5.g(p2Var);
                        float f5 = this.D;
                        boolean zD = zG2 | g0Var5.d(f5);
                        Object objN3 = g0Var5.N();
                        if (zD || objN3 == obj4) {
                            objN3 = new s0(f5, p2Var, 0);
                            g0Var5.n0(objN3);
                        }
                        b2.r rVarC5 = f2.h.c(b0.p(rVarM, (u00.k) objN3), p0.f.a(f4));
                        r3 = 0;
                        g0Var = g0Var5;
                        h0.a(eVar3, rVarC5, f4, false, null, false, g0Var4, 384, 56);
                        g0Var.r(false);
                    }
                    h0.a0 a0Var = z1.c;
                    z0 z0Var7 = this.E;
                    if (((Boolean) z0Var7.getValue()).booleanValue()) {
                        g0Var.c0(1864757353);
                        x0 x0VarC = w.s0.c(new q1(250, 100, x.x.a), 2);
                        q1 q1VarW = x.c.w(250, 100, (x.v) null, 4);
                        int i5 = this.C;
                        boolean zE2 = g0Var.e(i5);
                        Object objN4 = g0Var.N();
                        if (zE2 || objN4 == obj4) {
                            objN4 = new s1(i5, 12);
                            g0Var.n0(objN4);
                        }
                        x0VarA = x0VarC.a(w.s0.j((u00.k) objN4, q1VarW));
                        g0Var.r((boolean) r3);
                    } else {
                        g0Var.c0(1865031114);
                        g0Var.r((boolean) r3);
                        x0VarA = x0.b;
                    }
                    c0.c(this.B, a0Var, x0VarA, ((Boolean) z0Var7.getValue()).booleanValue() ? w.s0.d(x.c.w(200, (int) r3, x.x.a, 2), 2) : y0.b, (String) null, v1.d.d(-609880260, new t0(z0Var6, this.F, 0), g0Var4), g0Var4, 196656, 16);
                } else {
                    g0Var5.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
