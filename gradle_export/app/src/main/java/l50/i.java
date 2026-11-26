package l50;

import b2.o;
import b2.r;
import g00.b0;
import java.io.IOException;
import k50.c0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import l1.g0;
import l1.j;
import l1.p2;
import u00.k;
import w.w1;
import x.m1;
import x.n1;
import x.r1;
import x.y;
import z1.q;
import z2.w0;

public final class i extends n implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public i(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws IOException {
        Object objJ0;
        switch (this.A) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                c0 c0Var = (c0) this.B;
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte b = c0Var.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        ((z) this.C).A = Long.valueOf(((long) c0Var.l()) * 1000);
                    }
                    if (z2) {
                        ((z) this.D).A = Long.valueOf(((long) c0Var.l()) * 1000);
                    }
                    if (z3) {
                        ((z) this.E).A = Long.valueOf(((long) c0Var.l()) * 1000);
                    }
                }
                return b0.a;
            default:
                g0 g0Var = (j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    n1 n1Var = (n1) this.B;
                    w1 w1Var = new w1((y) this.C, 2);
                    r1 r1Var = x.c.k;
                    boolean zG = n1Var.g();
                    f5.c cVar = n1Var.a;
                    l1.c cVar2 = l1.i.a;
                    if (zG) {
                        g0Var2.c0(1666827533);
                        g0Var2.r(false);
                        objJ0 = cVar.J0();
                    } else {
                        g0Var2.c0(1666573488);
                        boolean zG2 = g0Var2.g(n1Var);
                        objJ0 = g0Var2.N();
                        if (zG2 || objJ0 == cVar2) {
                            z1.f fVarF = q.f();
                            k kVarE = fVarF != null ? fVarF.e() : null;
                            z1.f fVarK = q.k(fVarF);
                            try {
                                Object objJ1 = cVar.J0();
                                q.n(fVarF, fVarK, kVarE);
                                g0Var2.n0(objJ1);
                                objJ0 = objJ1;
                            } catch (Throwable th) {
                                q.n(fVarF, fVarK, kVarE);
                                throw th;
                            }
                        }
                        g0Var2.r(false);
                    }
                    g0Var2.c0(1378811975);
                    Object obj3 = this.D;
                    float f = m.a(objJ0, obj3) ? 1.0f : 0.0f;
                    g0Var2.r(false);
                    Float fValueOf = Float.valueOf(f);
                    boolean zG3 = g0Var2.g(n1Var);
                    Object objN = g0Var2.N();
                    if (zG3 || objN == cVar2) {
                        objN = l1.q.r(new al.f(n1Var, 12));
                        g0Var2.n0(objN);
                    }
                    Object value = ((p2) objN).getValue();
                    g0Var2.c0(1378811975);
                    float f2 = m.a(value, obj3) ? 1.0f : 0.0f;
                    g0Var2.r(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    boolean zG4 = g0Var2.g(n1Var);
                    Object objN2 = g0Var2.N();
                    if (zG4 || objN2 == cVar2) {
                        objN2 = l1.q.r(new al.f(n1Var, 13));
                        g0Var2.n0(objN2);
                    }
                    m1 m1VarO = x.c.o(n1Var, fValueOf, fValueOf2, (y) w1Var.invoke(((p2) objN2).getValue(), g0Var, 0), r1Var, g0Var, 0);
                    boolean zG5 = g0Var2.g(m1VarO);
                    Object objN3 = g0Var2.N();
                    if (zG5 || objN3 == cVar2) {
                        objN3 = new w.g(m1VarO, 5);
                        g0Var2.n0(objN3);
                    }
                    r rVarP = i2.b0.p(o.A, (k) objN3);
                    v1.c cVar3 = (v1.c) this.E;
                    w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    l1.m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarP, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.v(g0Var, Integer.valueOf(iHashCode), b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    cVar3.invoke(obj3, g0Var, 0);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                return b0.a;
        }
    }
}
