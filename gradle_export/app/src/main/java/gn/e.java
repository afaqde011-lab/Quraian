package gn;

import a1.w;
import android.content.Context;
import b6.k;
import g00.b0;
import j6.q;
import kh.n;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import ta.c0;
import u00.o;

public final class e implements o {
    public final int A;
    public final hn.a B;
    public final float C;

    public e(hn.a aVar, float f, int i) {
        this.A = i;
        this.B = aVar;
        this.C = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                q Row = (q) obj;
                j jVar = (j) obj2;
                ((Integer) obj3).getClass();
                m.e(Row, "$this$Row");
                hn.a aVar = this.B;
                n.q(aVar.d, aVar.b, this.C, (b6.m) null, jVar, 0);
                float f = 12;
                a.a.f(ze.d.U(f), jVar, 0);
                w00.a.b(Row.a(), 0, 0, v1.d.d(-2050962822, new w(aVar, 6), jVar), jVar, 3072, 6);
                a.a.f(ze.d.U(f), jVar, 0);
                n.t(aVar.e, nn.c.a(aVar.a), (b6.m) null, 0.0f, jVar, 0, 12);
                break;
            case 1:
                q Row2 = (q) obj;
                j jVar2 = (j) obj2;
                ((Integer) obj3).getClass();
                m.e(Row2, "$this$Row");
                hn.a aVar2 = this.B;
                n.q(aVar2.d, aVar2.b, this.C, (b6.m) null, jVar2, 0);
                a.a.f(Row2.a(), jVar2, 0);
                n.p(20, (b6.m) null, jVar2, 6);
                break;
            default:
                j6.g Column = (j6.g) obj;
                g0 g0Var = (j) obj2;
                ((Integer) obj3).getClass();
                m.e(Column, "$this$Column");
                k kVar = k.a;
                b6.m mVarV = ze.d.v(kVar);
                hn.a aVar3 = this.B;
                c0.d(mVarV, 0, v1.d.d(746455187, new e(aVar3, this.C, 1), g0Var), g0Var, 3072, 2);
                a.a.f(ze.d.D(kVar, 6), g0Var, 0);
                a.a.f(Column.a(kVar), g0Var, 0);
                ze.d.e(aVar3.b, (b6.m) null, new n6.e(dn.d.a, new y3.o(kh.o.z(12)), new n6.b(500), (n6.c) null, 120), 1, g0Var, 3072, 2);
                String string = ((Context) g0Var.k(b6.g.b)).getString(2131887358);
                m.d(string, "getString(...)");
                ze.d.e(string, (b6.m) null, new n6.e(dn.d.b, new y3.o(kh.o.z(12)), (n6.b) null, (n6.c) null, 124), 1, g0Var, 3072, 2);
                a.a.f(ze.d.D(kVar, 8), g0Var, 0);
                a.a.f(Column.a(kVar), g0Var, 0);
                n.u(aVar3.e, nn.c.a(aVar3.a), (b6.m) null, g0Var, 0);
                break;
        }
        return b0.a;
    }
}
