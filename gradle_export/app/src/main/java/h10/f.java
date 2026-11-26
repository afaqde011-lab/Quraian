package h10;

import e30.u0;
import e30.w;
import h00.q;
import j10.n0;
import j10.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.r;
import m10.l0;
import m10.r0;
import m10.s;
import m10.t;

public final class f extends l0 {
    public f(j10.k kVar, f fVar, int i, boolean z) {
        super(kVar, fVar, k10.g.a, r.g, i, n0.n);
        this.N = true;
        this.V = z;
        this.W = false;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final t a1(int i, j10.k newOwner, u uVar, n0 n0Var, k10.h annotations, n20.e eVar) {
        kotlin.jvm.internal.m.e(newOwner, "newOwner");
        g4.c.q(i, "kind");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        return new f(newOwner, (f) uVar, i, this.V);
    }

    @Override
    public final t b1(s sVar) {
        n20.e eVar;
        f fVar = (f) super.b1(sVar);
        if (fVar == null) {
            return null;
        }
        List listO = fVar.O();
        kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
        if (listO.isEmpty()) {
            return fVar;
        }
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            w type = ((r0) it.next()).getType();
            kotlin.jvm.internal.m.d(type, "getType(...)");
            if (w50.c.F(type) != null) {
                List listO2 = fVar.O();
                kotlin.jvm.internal.m.d(listO2, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList(h00.r.q0(listO2, 10));
                Iterator it2 = listO2.iterator();
                while (it2.hasNext()) {
                    w type2 = ((r0) it2.next()).getType();
                    kotlin.jvm.internal.m.d(type2, "getType(...)");
                    arrayList.add(w50.c.F(type2));
                }
                int size = fVar.O().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listO3 = fVar.O();
                    kotlin.jvm.internal.m.d(listO3, "getValueParameters(...)");
                    ArrayList<g00.k> arrayListT1 = q.t1(arrayList, listO3);
                    if (arrayListT1.isEmpty()) {
                        return fVar;
                    }
                    for (g00.k kVar : arrayListT1) {
                        if (!kotlin.jvm.internal.m.a((n20.e) kVar.A, ((r0) kVar.B).getName())) {
                        }
                    }
                    return fVar;
                }
                List<r0> listO4 = fVar.O();
                kotlin.jvm.internal.m.d(listO4, "getValueParameters(...)");
                ArrayList arrayList2 = new ArrayList(h00.r.q0(listO4, 10));
                for (r0 r0Var : listO4) {
                    n20.e name = r0Var.getName();
                    kotlin.jvm.internal.m.d(name, "getName(...)");
                    int i = r0Var.G;
                    int i2 = i - size;
                    if (i2 >= 0 && (eVar = (n20.e) arrayList.get(i2)) != null) {
                        name = eVar;
                    }
                    arrayList2.add(r0Var.Y0(fVar, name, i));
                }
                s sVarE1 = fVar.e1(u0.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((n20.e) it3.next()) == null) {
                        }
                    }
                    z = false;
                }
                sVarE1.V = Boolean.valueOf(z);
                sVarE1.G = arrayList2;
                sVarE1.E = fVar.a();
                t tVarB1 = super.b1(sVarE1);
                kotlin.jvm.internal.m.b(tVarB1);
                return tVarB1;
            }
        }
        return fVar;
    }

    @Override
    public final boolean isExternal() {
        return false;
    }

    @Override
    public final boolean isInline() {
        return false;
    }
}
