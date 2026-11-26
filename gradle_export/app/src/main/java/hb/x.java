package hb;

import a1.r0;
import com.google.android.gms.internal.measurement.x5;
import h1.v0;
import java.util.Iterator;
import java.util.List;
import za.g0;

public final class x {

    public final ca.t f7028a;

    public final b f7029b = new b(5);

    public final w f7030c = new w(0);

    public x(ca.t tVar) {
        this.f7028a = tVar;
    }

    public final void a(ma.a aVar, u.e eVar) {
        u.b bVar = (u.b) eVar.keySet();
        u.e eVar2 = bVar.A;
        if (eVar2.isEmpty()) {
            return;
        }
        if (eVar.C > 999) {
            va.a.a0(eVar, new v(this, aVar, 0));
            return;
        }
        StringBuilder sbQ = x5.q("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        ze.d.h(eVar2.C, sbQ);
        sbQ.append(")");
        String string = sbQ.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        ma.c cVarK0 = aVar.k0(string);
        Iterator it = bVar.iterator();
        int i10 = 1;
        while (true) {
            u.a aVar2 = (u.a) it;
            if (!aVar2.hasNext()) {
                try {
                    break;
                } catch (Throwable th2) {
                    cVarK0.close();
                    throw th2;
                }
            }
            cVarK0.y(i10, (String) aVar2.next());
            i10++;
        }
        kotlin.jvm.internal.m.e(cVarK0, "stmt");
        int iP = w50.c.p(cVarK0, "work_spec_id");
        if (iP == -1) {
            cVarK0.close();
            return;
        }
        while (cVarK0.d0()) {
            List list = (List) eVar.get(cVarK0.R(iP));
            if (list != null) {
                byte[] blob = cVarK0.getBlob(0);
                za.g gVar = za.g.f17367b;
                list.add(kh.n.D(blob));
            }
        }
        cVarK0.close();
    }

    public final void b(ma.a aVar, u.e eVar) {
        u.b bVar = (u.b) eVar.keySet();
        u.e eVar2 = bVar.A;
        if (eVar2.isEmpty()) {
            return;
        }
        if (eVar.C > 999) {
            va.a.a0(eVar, new v(this, aVar, 1));
            return;
        }
        StringBuilder sbQ = x5.q("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        ze.d.h(eVar2.C, sbQ);
        sbQ.append(")");
        String string = sbQ.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        ma.c cVarK0 = aVar.k0(string);
        Iterator it = bVar.iterator();
        int i10 = 1;
        while (true) {
            u.a aVar2 = (u.a) it;
            if (!aVar2.hasNext()) {
                try {
                    break;
                } catch (Throwable th2) {
                    cVarK0.close();
                    throw th2;
                }
            }
            cVarK0.y(i10, (String) aVar2.next());
            i10++;
        }
        kotlin.jvm.internal.m.e(cVarK0, "stmt");
        int iP = w50.c.p(cVarK0, "work_spec_id");
        if (iP == -1) {
            cVarK0.close();
            return;
        }
        while (cVarK0.d0()) {
            List list = (List) eVar.get(cVarK0.R(iP));
            if (list != null) {
                list.add(cVarK0.R(0));
            }
        }
        cVarK0.close();
    }

    public final void c(String str) {
        kotlin.jvm.internal.m.e(str, "id");
        rd.a.M(this.f7028a, false, true, new u(str, 4));
    }

    public final g0 d(String str) {
        kotlin.jvm.internal.m.e(str, "id");
        return (g0) rd.a.M(this.f7028a, true, false, new b6.o(str, 26));
    }

    public final p e(String str) {
        kotlin.jvm.internal.m.e(str, "id");
        return (p) rd.a.M(this.f7028a, true, false, new b6.o(str, 25));
    }

    public final List f(String str) {
        kotlin.jvm.internal.m.e(str, "name");
        return (List) rd.a.M(this.f7028a, true, false, new u(str, 5));
    }

    public final int g(long j9, String str) {
        kotlin.jvm.internal.m.e(str, "id");
        return ((Number) rd.a.M(this.f7028a, false, true, new r(str, j9, 0))).intValue();
    }

    public final void h(int i10, String str) {
        kotlin.jvm.internal.m.e(str, "id");
        rd.a.M(this.f7028a, false, true, new r0(str, i10, 2));
    }

    public final void i(long j9, String str) {
        kotlin.jvm.internal.m.e(str, "id");
        rd.a.M(this.f7028a, false, true, new r(str, j9, 1));
    }

    public final int j(g0 g0Var, String str) {
        kotlin.jvm.internal.m.e(str, "id");
        return ((Number) rd.a.M(this.f7028a, false, true, new v0(g0Var, str, 6))).intValue();
    }

    public final void k(int i10, String str) {
        kotlin.jvm.internal.m.e(str, "id");
        rd.a.M(this.f7028a, false, true, new r0(i10, str, 3));
    }
}
