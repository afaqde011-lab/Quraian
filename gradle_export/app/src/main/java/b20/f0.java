package b20;

import e30.a1;
import e30.v0;
import e30.x0;
import e7.l0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class f0 extends m10.c {
    public final oj.q L;
    public final p10.c0 M;

    public f0(oj.q qVar, p10.c0 javaTypeParameter, int i, j10.l lVar) {
        kotlin.jvm.internal.m.e(javaTypeParameter, "javaTypeParameter");
        a20.b bVar = (a20.b) qVar.B;
        super(bVar.a, lVar, new a20.e(qVar, javaTypeParameter, false), n20.e.e(javaTypeParameter.a.getName()), a1.C, false, i, bVar.m);
        this.L = qVar;
        this.M = javaTypeParameter;
    }

    @Override
    public final List Y0(List list) {
        f0 f0Var;
        f20.d dVar;
        e30.w wVar;
        e30.w wVarA;
        oj.q qVar = this.L;
        f20.d dVar2 = ((a20.b) qVar.B).r;
        dVar2.getClass();
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e30.w wVar2 = (e30.w) it.next();
            f20.o oVar = f20.o.D;
            kotlin.jvm.internal.m.e(wVar2, "<this>");
            if (x0.c(wVar2, oVar, null)) {
                f0Var = this;
                dVar = dVar2;
                wVar = wVar2;
            } else {
                f0Var = this;
                dVar = dVar2;
                wVar = wVar2;
                wVarA = dVar.a(new l0(f0Var, false, qVar, x10.a.TYPE_PARAMETER_BOUNDS, false), wVar, h00.x.A, null, false);
                if (wVarA == null) {
                }
                arrayList.add(wVarA);
                this = f0Var;
                dVar2 = dVar;
            }
            wVarA = wVar;
            arrayList.add(wVarA);
            this = f0Var;
            dVar2 = dVar;
        }
        return arrayList;
    }

    @Override
    public final List Z0() {
        Type[] bounds = this.M.a.getBounds();
        kotlin.jvm.internal.m.d(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new p10.q(type));
        }
        p10.q qVar = (p10.q) h00.q.f1(arrayList);
        Collection collection = arrayList;
        if (kotlin.jvm.internal.m.a(qVar != null ? qVar.a : null, Object.class)) {
            collection = h00.x.A;
        }
        boolean zIsEmpty = collection.isEmpty();
        oj.q qVar2 = this.L;
        if (zIsEmpty) {
            return va.a.R(e30.c.f(((a20.b) qVar2.B).o.d().e(), ((a20.b) qVar2.B).o.d().p()));
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a1.i) qVar2.E).G((p10.q) it.next(), p30.f.t0(v0.B, false, this, 3)));
        }
        return arrayList2;
    }
}
