package h10;

import e30.f0;
import e30.h0;
import g10.p;
import h00.q;
import h00.r;
import j10.o0;
import j10.r0;
import j10.w;
import j10.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m10.c0;

public final class b extends e30.b {
    public final c C;

    public b(c cVar) {
        super(cVar.E);
        this.C = cVar;
    }

    @Override
    public final Collection a() {
        List<n20.b> listS;
        c cVar = this.C;
        int i = cVar.H;
        k kVar = cVar.G;
        g gVar = g.c;
        if (kotlin.jvm.internal.m.a(kVar, gVar)) {
            listS = va.a.R(c.L);
        } else if (kotlin.jvm.internal.m.a(kVar, h.c)) {
            listS = va.a.S(new n20.b[]{c.M, new n20.b(p.l, gVar.a(i))});
        } else {
            j jVar = j.c;
            if (kotlin.jvm.internal.m.a(kVar, jVar)) {
                listS = va.a.R(c.L);
            } else {
                if (!kotlin.jvm.internal.m.a(kVar, i.c)) {
                    int i2 = o30.a.a;
                    throw new IllegalStateException("should not be called");
                }
                listS = va.a.S(new n20.b[]{c.M, new n20.b(p.f, jVar.a(i))});
            }
        }
        z zVarL = ((c0) cVar.F).l();
        ArrayList arrayList = new ArrayList(r.q0(listS, 10));
        for (n20.b bVar : listS) {
            j10.e eVarD = w.d(zVarL, bVar);
            if (eVarD == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            List listK1 = q.k1(eVarD.f().getParameters().size(), cVar.K);
            ArrayList arrayList2 = new ArrayList(r.q0(listK1, 10));
            Iterator it = listK1.iterator();
            while (it.hasNext()) {
                arrayList2.add(new f0(((r0) it.next()).n()));
            }
            h0.B.getClass();
            arrayList.add(e30.c.t(h0.C, eVarD, arrayList2));
        }
        return q.n1(arrayList);
    }

    @Override
    public final o0 c() {
        return o0.C;
    }

    @Override
    public final j10.h g() {
        return this.C;
    }

    @Override
    public final List getParameters() {
        return this.C.K;
    }

    @Override
    public final j10.e g() {
        return this.C;
    }

    @Override
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return this.C.toString();
    }
}
