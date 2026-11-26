package gv;

import c3.t2;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import l1.p2;

public final class u1 implements u00.o {
    public final int A = 0;
    public final u00.k B;
    public final boolean C;
    public final p2 D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;

    public u1(bv.o1 o1Var, u00.k kVar, kk.c cVar, d00.x0 x0Var, o0 o0Var, boolean z, p2 p2Var) {
        this.E = o1Var;
        this.B = kVar;
        this.F = cVar;
        this.G = x0Var;
        this.H = o0Var;
        this.C = z;
        this.D = p2Var;
    }

    public u1(jp.x xVar, String str, u00.k kVar, boolean z, p2 p2Var, t2 t2Var, g2.t tVar) {
        this.E = xVar;
        this.F = str;
        this.B = kVar;
        this.C = z;
        this.D = p2Var;
        this.G = t2Var;
        this.H = tVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                bv.o1 o1Var = (bv.o1) this.E;
                kk.c cVar = (kk.c) this.F;
                d00.x0 x0Var = (d00.x0) this.G;
                o0 o0Var = (o0) this.H;
                h0.r CollapsibleSidePanel = (h0.r) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(CollapsibleSidePanel, "$this$CollapsibleSidePanel");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    v1.a(o1Var, this.B, cVar, x0Var, ((i2.t) this.D.getValue()).a, o0Var, this.C, h0.z1.d(b2.o.A, 1.0f), g0Var, 12779520);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                jp.x xVar = (jp.x) this.E;
                String str = (String) this.F;
                t2 t2Var = (t2) this.G;
                g2.t tVar = (g2.t) this.H;
                h0.w AuthScreenScaffold = (h0.w) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(AuthScreenScaffold, "$this$AuthScreenScaffold");
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z6.b(z3.U(g0Var3, 2131886168), (b2.r) null, dl.a.n, ((Boolean) g0Var4.k(tp.h.a)).booleanValue() ? kh.o.z(28) : kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var3, 1572864, 48, 260010);
                    String strU = z3.U(g0Var3, 2131886167);
                    long jB = i2.t.b(0.5f, dl.a.k);
                    long jZ = kh.o.z(15);
                    long jZ2 = kh.o.z(20);
                    q3.u uVar = q3.u.B;
                    z6.b(strU, (b2.r) null, jB, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var3, 1597440, 48, 260010);
                    b2.o oVar = b2.o.A;
                    h0.c.h(h0.z1.e(oVar, 8), g0Var3);
                    b2.r rVarD = h0.z1.d(oVar, 1.0f);
                    String str2 = xVar.c;
                    boolean z = str != null;
                    p2 p2Var = this.D;
                    boolean zBooleanValue = ((Boolean) p2Var.getValue()).booleanValue();
                    u00.k kVar = this.B;
                    boolean zG = g0Var4.g(kVar);
                    Object objN = g0Var4.N();
                    Object obj4 = l1.i.a;
                    if (zG || objN == obj4) {
                        objN = new hv.j(22, kVar);
                        g0Var4.n0(objN);
                    }
                    u00.k kVar2 = (u00.k) objN;
                    boolean zG2 = g0Var4.g(kVar);
                    Object objN2 = g0Var4.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new jz.t(11, kVar);
                        g0Var4.n0(objN2);
                    }
                    u00.a aVar = (u00.a) objN2;
                    boolean z2 = this.C;
                    boolean zH = g0Var4.h(z2) | g0Var4.g(p2Var) | g0Var4.g(t2Var) | g0Var4.g(kVar);
                    Object objN3 = g0Var4.N();
                    if (zH || objN3 == obj4) {
                        objN3 = new cz.l(t2Var, kVar, p2Var, z2, 1);
                        g0Var4.n0(objN3);
                    }
                    qp.a.a(str2, z, kVar2, aVar, (u00.a) objN3, rVarD, zBooleanValue, tVar, g0Var3, 12779520);
                    if (str == null) {
                        g0Var4.c0(-153210654);
                        g0Var4.r(false);
                    } else {
                        g0Var4.c0(-153210653);
                        z6.b(str, (b2.r) null, dl.a.U, kh.o.z(12), uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var3, 1597440, 0, 262058);
                        g0Var4.r(false);
                    }
                } else {
                    g0Var4.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
