package pn;

import android.content.Context;
import b6.k;
import b6.m;
import dn.l;
import e6.f;
import g00.b0;
import h00.q;
import l1.g0;
import l1.j;
import u00.n;
import y3.h;

public final class e implements n {
    public final int A;
    public final qn.b B;
    public final Context C;
    public final l D;
    public final long E;

    public e(l lVar, Context context, qn.b bVar, long j) {
        this.A = 0;
        this.D = lVar;
        this.C = context;
        this.B = bVar;
        this.E = j;
    }

    public e(qn.b bVar, Context context, l lVar, long j, int i) {
        this.A = i;
        this.B = bVar;
        this.C = context;
        this.D = lVar;
        this.E = j;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        u30.b bVar;
        int i = this.A;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                j jVar = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var = (g0) jVar;
                if (!g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var.V();
                } else {
                    l lVar = this.D;
                    m mVarA = lVar.a(jVar);
                    Context context = this.C;
                    va.a.b(ze.d.m(mVarA, f.a(k00.f.U(context))), (j6.c) null, v1.d.d(2027707969, new e(this.B, context, lVar, this.E, 1), jVar), jVar, 384, 2);
                }
                break;
            case 1:
                g0 g0Var2 = (j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var3 = g0Var2;
                if (!g0Var3.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var3.V();
                } else {
                    b6.a aVar = new b6.a(2131231692);
                    k kVar = k.a;
                    w50.c.d(aVar, null, ze.d.u(kVar), 2, null, g0Var2, 48, 16);
                    m mVarU = ze.d.u(kVar);
                    float f = dn.m.a;
                    va.a.b(w50.c.Y(mVarU), (j6.c) null, v1.d.d(-1674867681, new e(this.B, this.C, this.D, this.E, 2), g0Var2), g0Var2, 384, 2);
                }
                break;
            default:
                g0 g0Var4 = (j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean z = (iIntValue3 & 3) != 2;
                int i2 = 1 & iIntValue3;
                g0 g0Var5 = g0Var4;
                if (!g0Var5.S(i2, z)) {
                    g0Var5.V();
                } else {
                    qn.b bVar2 = this.B;
                    qn.a aVar2 = (bVar2 == null || (bVar = bVar2.a) == null) ? null : (qn.a) q.N0(bVar);
                    if (aVar2 != null) {
                        l lVar2 = l.A;
                        l lVar3 = this.D;
                        if (lVar3 != lVar2) {
                            l lVar4 = l.B;
                            long j = this.E;
                            if (lVar3 != lVar4) {
                                g0Var5.c0(1064917323);
                                d.a(bVar2, h.a(j) - (dn.m.b * 2), g0Var4, 0);
                                g0Var5.r(false);
                            } else {
                                g0Var5.c0(1064910983);
                                a.a(aVar2, h.a(j) - (dn.m.b * 2), g0Var4, 0);
                                g0Var5.r(false);
                            }
                        } else {
                            g0Var5.c0(1064907751);
                            a.b(aVar2, g0Var4, 0);
                            g0Var5.r(false);
                        }
                    } else {
                        g0Var5.c0(1064898572);
                        Context context2 = this.C;
                        String string = context2.getString(2131887376);
                        kotlin.jvm.internal.m.d(string, "getString(...)");
                        String string2 = context2.getString(2131887375);
                        kotlin.jvm.internal.m.d(string2, "getString(...)");
                        kh.n.s(string, string2, (m) null, g0Var4, 0);
                        g0Var5.r(false);
                    }
                }
                break;
        }
        return b0Var;
    }
}
