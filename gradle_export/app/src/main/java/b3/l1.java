package b3;

import c3.s2;
import java.util.List;

public final class l1 extends kotlin.jvm.internal.n implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;

    public l1(Object obj, Object obj2, int i10) {
        super(2);
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public l1(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.A = i11;
        this.B = obj;
        this.C = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        Object obj3 = this.C;
        Object obj4 = this.B;
        switch (i10) {
            case 0:
                i2.s sVar = (i2.s) obj;
                l2.b bVar = (l2.b) obj2;
                p1 p1Var = (p1) obj4;
                l0 l0Var = p1Var.O;
                if (!l0Var.K()) {
                    p1Var.f2106m0 = true;
                } else {
                    p1Var.f2103j0 = sVar;
                    p1Var.f2102i0 = bVar;
                    b2 snapshotObserver = ((c3.z) p0.a(l0Var)).getSnapshotObserver();
                    i2.q0 q0Var = p1.f2089p0;
                    snapshotObserver.f2003a.d(p1Var, e.D, (m1) obj3);
                    p1Var.f2106m0 = false;
                }
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                j3.s sVar2 = (j3.s) obj2;
                d2.d dVar = (d2.d) obj3;
                if (!((s2) obj4).f2761b.c(sVar2.f7970f)) {
                    dVar.i(iIntValue, sVar2);
                    dVar.H.j(b0Var);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                f50.c.g((cc.a) obj4, (b2.r) obj3, (l1.j) obj, 1572913);
                break;
            case 3:
                ((Number) obj2).intValue();
                ri.t1.c((b2.r) obj4, (List) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 4:
                ((Number) obj2).intValue();
                w.x1.a((b2.r) obj4, (v1.c) obj3, (l1.j) obj, l1.q.K(55));
                break;
            default:
                l1.j jVar = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (!g0Var.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var.V();
                } else {
                    Boolean bool = (Boolean) ((z2.j0) obj4).f17124g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    u00.n nVar = (u00.n) obj3;
                    g0Var.f0(bool);
                    boolean zH = g0Var.h(zBooleanValue);
                    if (zBooleanValue) {
                        nVar.invoke(jVar, 0);
                    } else {
                        if (g0Var.l != 0) {
                            l1.l.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!g0Var.S) {
                            if (zH) {
                                o1.g gVar = g0Var.G;
                                int i11 = gVar.f11484g;
                                int i12 = gVar.f11485h;
                                p1.b bVar2 = g0Var.M;
                                bVar2.getClass();
                                bVar2.d(false);
                                bVar2.f12247b.f12244a.m0(p1.i.f12271d);
                                l1.q.l(i11, i12, g0Var.f9858s);
                                g0Var.G.t();
                            } else {
                                g0Var.U();
                            }
                        }
                    }
                    if (g0Var.f9864y && g0Var.G.f11486i == g0Var.f9865z) {
                        g0Var.f9865z = -1;
                        g0Var.f9864y = false;
                    }
                    g0Var.r(false);
                }
                break;
        }
        return b0Var;
    }
}
