package ct;

import android.content.Context;
import com.google.android.gms.internal.measurement.z3;
import g1.v5;
import g1.z6;
import h0.w1;
import h0.z1;
import l1.m1;
import m3.r0;
import z2.w0;

public final class e0 implements u00.o {
    public final int A;
    public final boolean B;
    public final Object C;

    public e0(Object obj, boolean z, int i) {
        this.A = i;
        this.C = obj;
        this.B = z;
    }

    public e0(boolean z, Object obj, int i) {
        this.A = i;
        this.B = z;
        this.C = obj;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                u30.b bVar = (u30.b) this.C;
                h0.t BoxWithConstraints = (h0.t) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                }
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    z3.g(bVar, BoxWithConstraints.c(), BoxWithConstraints.b(), this.B, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                Context context = (Context) this.C;
                j6.q Row = (j6.q) obj;
                l1.j jVar = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(Row, "$this$Row");
                boolean z = this.B;
                b6.a aVar = new b6.a(z ? 2131231429 : 2131231428);
                o6.g gVar = dn.d.a;
                w50.c.d(aVar, null, ze.d.R(10), 0, new b6.e(new b6.u(gVar)), jVar, 32816, 8);
                a.a.f(ze.d.U(5), jVar, 0);
                String string = context.getString(z ? 2131887380 : 2131887368);
                kotlin.jvm.internal.m.d(string, "getString(...)");
                ze.d.e(string, (b6.m) null, new n6.e(gVar, new y3.o(kh.o.z(13)), new n6.b(500), (n6.c) null, 120), 1, jVar, 3072, 2);
                break;
            case 2:
                String str = (String) this.C;
                w1 Button = (w1) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(Button, "$this$Button");
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode = Long.hashCode(g0Var4.T);
                    m1 m1VarM = g0Var4.m();
                    b2.o oVar = b2.o.A;
                    b2.r rVarC = b2.a.c(oVar, g0Var3);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar2);
                    } else {
                        g0Var4.q0();
                    }
                    l1.q.I(w0VarD, g0Var3, b3.h.f);
                    l1.q.I(m1VarM, g0Var3, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var3, b3.h.g);
                    l1.q.E(g0Var3, b3.h.h);
                    l1.q.I(rVarC, g0Var3, b3.h.d);
                    boolean z2 = this.B;
                    z6.b(str, f2.h.a(oVar, z2 ? 0.0f : 1.0f), 0L, kh.o.z(16), q3.u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 48, 260012);
                    if (z2) {
                        g0Var4.c0(-1623780670);
                        v5.a(z1.m(oVar, 16), dl.a.i, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                        g0Var4.r(false);
                    } else {
                        g0Var4.c0(-1623468345);
                        g0Var4.r(false);
                    }
                    g0Var4.r(true);
                } else {
                    g0Var4.V();
                }
                break;
            default:
                b2.r rVar = (b2.r) this.C;
                j0.b item = (j0.b) obj;
                l1.g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    kz.a.b(h0.c.G(rVar, 0.0f, this.B ? 0 : 12, 0.0f, 0.0f, 13), g0Var5, 0);
                } else {
                    g0Var6.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
