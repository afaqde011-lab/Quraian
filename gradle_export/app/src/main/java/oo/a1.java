package oo;

import com.google.android.gms.internal.measurement.g4;
import d40.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a1 implements d40.j {
    public final int A;
    public final g1 B;

    public a1(g1 g1Var, int i) {
        this.A = i;
        this.B = g1Var;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        lo.e eVarX;
        Long lValueOf;
        boolean z;
        ArrayList arrayList;
        lo.i iVarX;
        Iterator it;
        lo.e eVar;
        boolean z2;
        Iterator it2;
        z0 z0Var;
        switch (this.A) {
            case 0:
                g00.k kVar = (g00.k) obj;
                boolean zBooleanValue = ((Boolean) kVar.A).booleanValue();
                boolean zBooleanValue2 = ((Boolean) kVar.B).booleanValue();
                g1 g1Var = this.B;
                if (zBooleanValue2) {
                    ((hq.b) g1Var.p).c();
                }
                g1Var.i(z0.a((z0) g1Var.c.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, zBooleanValue && zBooleanValue2, zBooleanValue2, null, false, 54525951));
                break;
            case 1:
                ((p1) this.B.w).j((lo.t) obj);
                break;
            default:
                g00.k kVar2 = (g00.k) obj;
                ho.p pVar = (ho.p) kVar2.A;
                ho.a aVar = (ho.a) kVar2.B;
                g1 g1Var2 = this.B;
                g1Var2.x = aVar;
                ko.e eVar2 = g1Var2.r;
                ho.g gVar = pVar.b;
                z0 z0Var2 = (z0) g1Var2.c.d.getValue();
                if (aVar != null) {
                    g1Var2.n.getClass();
                    eVarX = ko.c.X(aVar);
                } else {
                    eVarX = null;
                }
                int i = gVar != null ? gVar.b : 0;
                String str = aVar != null ? aVar.c : null;
                if (str == null) {
                    str = "";
                }
                boolean z3 = pVar.c;
                if (gVar != null) {
                    lValueOf = Long.valueOf(gVar.b());
                    if (g1Var2.B) {
                        lValueOf = null;
                    }
                } else {
                    lValueOf = null;
                }
                float f = pVar.f;
                int i2 = i;
                String str2 = str;
                Long l = lValueOf;
                ru.d dVar = pVar.g;
                boolean z4 = pVar.h;
                if (gVar == null) {
                    z = false;
                } else {
                    String str3 = gVar.h;
                    if (!(str3 == null || r30.k.L0(str3))) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                boolean zL = g1Var2.l(gVar);
                List list = gVar != null ? gVar.n : null;
                List list2 = h00.x.A;
                if (list == null) {
                    list = list2;
                }
                ArrayList<ho.m> arrayList2 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    boolean z5 = z4;
                    ho.m mVar = (ho.m) next;
                    ko.e eVar3 = eVar2;
                    if (g1Var2.A) {
                        it2 = it3;
                        if (!mVar.a.equals(g1Var2.k(gVar))) {
                            List list3 = g1Var2.y;
                            if (list3 == null || !list3.isEmpty()) {
                                Iterator it4 = list3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        ho.d dVar2 = (ho.d) it4.next();
                                        Iterator it5 = it4;
                                        if (gVar != null) {
                                            z0Var = z0Var2;
                                            if (dVar2.a != gVar.a || !kotlin.jvm.internal.m.a(dVar2.b, mVar.a)) {
                                            }
                                        } else {
                                            z0Var = z0Var2;
                                        }
                                        it4 = it5;
                                        z0Var2 = z0Var;
                                    }
                                }
                            }
                            z0Var = z0Var2;
                            eVar2 = eVar3;
                            it3 = it2;
                            z0Var2 = z0Var;
                            z4 = z5;
                        }
                        arrayList2.add(next);
                        eVar2 = eVar3;
                        it3 = it2;
                        z0Var2 = z0Var;
                        z4 = z5;
                    } else {
                        it2 = it3;
                    }
                    z0Var = z0Var2;
                    arrayList2.add(next);
                    eVar2 = eVar3;
                    it3 = it2;
                    z0Var2 = z0Var;
                    z4 = z5;
                }
                boolean z6 = z4;
                ko.e eVar4 = eVar2;
                z0 z0Var3 = z0Var2;
                ArrayList arrayList3 = new ArrayList(h00.r.q0(arrayList2, 10));
                for (ho.m mVar2 : arrayList2) {
                    String str4 = mVar2.a;
                    arrayList3.add(new lo.r(str4, mVar2.b, str4.equals(g1Var2.k(gVar))));
                }
                u30.b bVarD0 = g4.d0(arrayList3);
                if (aVar != null) {
                    List list4 = aVar.g;
                    arrayList = new ArrayList(h00.r.q0(list4, 10));
                    Iterator it6 = list4.iterator();
                    while (it6.hasNext()) {
                        ho.g gVar2 = (ho.g) it6.next();
                        ko.j jVar = g1Var2.o;
                        List list5 = list4;
                        ko.f fVar = new ko.f(aVar.a, list5, Integer.valueOf(gVar2.a), g1Var2.y, g1Var2.z);
                        eVar4.getClass();
                        lo.i iVarX2 = ko.e.X(fVar);
                        if (g1Var2.A) {
                            List list6 = g1Var2.y;
                            if (list6 == null || !list6.isEmpty()) {
                                Iterator it7 = list6.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        it = it6;
                                        eVar = eVarX;
                                        if (((ho.d) it7.next()).a != gVar2.a) {
                                            it6 = it;
                                            eVarX = eVar;
                                        }
                                    }
                                }
                            }
                            it = it6;
                            eVar = eVarX;
                            z2 = false;
                            ko.i iVar = new ko.i(aVar, gVar2, iVarX2, z2);
                            jVar.getClass();
                            arrayList.add(ko.j.X(iVar));
                            it6 = it;
                            eVarX = eVar;
                            list4 = list5;
                        } else {
                            it = it6;
                            eVar = eVarX;
                        }
                        z2 = true;
                        ko.i iVar2 = new ko.i(aVar, gVar2, iVarX2, z2);
                        jVar.getClass();
                        arrayList.add(ko.j.X(iVar2));
                        it6 = it;
                        eVarX = eVar;
                        list4 = list5;
                    }
                } else {
                    arrayList = null;
                }
                lo.e eVar5 = eVarX;
                if (arrayList != null) {
                    list2 = arrayList;
                }
                u30.b bVarD1 = g4.d0(list2);
                if (aVar == null || gVar == null) {
                    iVarX = lo.h.a;
                } else {
                    ko.f fVar2 = new ko.f(aVar.a, aVar.g, Integer.valueOf(gVar.a), g1Var2.y, g1Var2.z);
                    eVar4.getClass();
                    iVarX = ko.e.X(fVar2);
                }
                g1Var2.i(z0.a(z0Var3, eVar5, i2, str2, z3, l, f, dVar, bVarD1, false, false, false, false, bVarD0, false, false, null, false, z, zL, null, false, false, false, iVarX, z6, 15982096));
                g1Var2.m(false);
                break;
        }
        return g00.b0.a;
    }
}
