package s9;

import d40.o;
import d40.p1;
import d40.z0;
import h00.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class i {

    public final p1 f13925a = o.c(j.f13937a);

    public final p1 f13926b;

    public final z0 f13927c;

    public final h00.m f13928d;

    public final h00.m f13929e;

    public e f13930f;

    public int f13931g;

    public h f13932h;

    public final LinkedHashSet f13933i;

    public final LinkedHashSet f13934j;

    public final LinkedHashSet f13935k;
    public boolean l;
    public boolean m;

    public boolean f13936n;

    public i() {
        p1 p1VarC = o.c(new f());
        this.f13926b = p1VarC;
        this.f13927c = new z0(p1VarC);
        this.f13928d = new h00.m();
        this.f13929e = new h00.m();
        this.f13933i = new LinkedHashSet();
        this.f13934j = new LinkedHashSet();
        this.f13935k = new LinkedHashSet();
    }

    public final void a(c cVar, h hVar, int i10) {
        LinkedHashSet linkedHashSet;
        boolean z10;
        kotlin.jvm.internal.m.e(cVar, "dispatcher");
        if (hVar.f13923a != null) {
            throw new IllegalArgumentException(("Input '" + hVar + "' is already added to dispatcher " + hVar.f13923a + '.').toString());
        }
        if (i10 != 0) {
            linkedHashSet = i10 != 1 ? this.f13933i : this.f13934j;
        } else {
            linkedHashSet = this.f13935k;
        }
        linkedHashSet.add(hVar);
        hVar.f13923a = cVar;
        kotlin.jvm.internal.m.e((f) this.f13927c.A.getValue(), "history");
        if (i10 != 0) {
            z10 = i10 != 1 ? this.f13936n : this.l;
        } else {
            z10 = this.m;
        }
        hVar.b(z10);
    }

    public final void b() {
        boolean z10;
        boolean z11;
        h00.m mVar = this.f13928d;
        if (mVar == null || !mVar.isEmpty()) {
            Iterator it = mVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f13918e || eVar.f13919f) {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = false;
        }
        h00.m mVar2 = this.f13929e;
        if (mVar2 == null || !mVar2.isEmpty()) {
            Iterator it2 = mVar2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    e eVar2 = (e) it2.next();
                    if (eVar2.f13918e || eVar2.f13919f) {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
            }
        } else {
            z11 = false;
        }
        boolean z12 = z10 || z11;
        boolean z13 = this.m != z10;
        boolean z14 = this.l != z11;
        boolean z15 = this.f13936n != z12;
        if (z13) {
            Iterator it3 = this.f13935k.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).b(z10);
            }
        }
        if (z14) {
            Iterator it4 = this.f13934j.iterator();
            while (it4.hasNext()) {
                ((h) it4.next()).b(z11);
            }
        }
        if (z15) {
            Iterator it5 = this.f13933i.iterator();
            while (it5.hasNext()) {
                ((h) it5.next()).b(z12);
            }
        }
        this.m = z10;
        this.l = z11;
        this.f13936n = z12;
        e eVarC = this.f13930f;
        if (eVarC == null) {
            eVarC = c(0);
        }
        d(eVarC);
    }

    public final e c(int i10) {
        Object next;
        Object next2;
        e eVar;
        Object next3;
        h00.m mVar = this.f13929e;
        h00.m mVar2 = this.f13928d;
        Object obj = null;
        if (i10 == -1) {
            Iterator it = mVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((e) next).f13918e);
            e eVar2 = (e) next;
            if (eVar2 != null) {
                return eVar2;
            }
            for (Object obj2 : mVar) {
                if (((e) obj2).f13918e) {
                    obj = obj2;
                    break;
                }
            }
            return (e) obj;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i10 + "'.").toString());
            }
            Iterator it2 = mVar2.iterator();
            do {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (!((e) next3).f13919f);
            e eVar3 = (e) next3;
            if (eVar3 != null) {
                return eVar3;
            }
            for (Object obj3 : mVar) {
                if (((e) obj3).f13919f) {
                    obj = obj3;
                    break;
                }
            }
            return (e) obj;
        }
        Iterator it3 = mVar2.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            eVar = (e) next2;
            if (eVar.f13918e) {
                break;
            }
        } while (!eVar.f13919f);
        e eVar4 = (e) next2;
        if (eVar4 != null) {
            return eVar4;
        }
        for (Object obj4 : mVar) {
            e eVar5 = (e) obj4;
            if (eVar5.f13918e || eVar5.f13919f) {
                obj = obj4;
                break;
            }
        }
        return (e) obj;
    }

    public final void d(e eVar) {
        f fVar;
        e eVarC = this.f13930f;
        if (eVarC == null) {
            eVarC = c(0);
        }
        if (kotlin.jvm.internal.m.a(eVarC, eVar)) {
            if (eVarC == null) {
                fVar = new f();
            } else {
                ArrayList arrayList = new ArrayList();
                for (e eVar2 : this.f13928d) {
                    if (eVar2.f13918e && !eVar2.f13915b.isEmpty()) {
                        arrayList.addAll(eVar2.f13915b);
                    }
                }
                for (e eVar3 : this.f13929e) {
                    if (eVar3.f13918e && !eVar3.f13915b.isEmpty()) {
                        arrayList.addAll(eVar3.f13915b);
                    }
                }
                g gVar = eVarC.f13914a;
                List list = eVarC.f13916c;
                kotlin.jvm.internal.m.e(gVar, "currentInfo");
                kotlin.jvm.internal.m.e(list, "forwardInfo");
                i00.b bVarS = va.a.s();
                v.u0(arrayList, bVarS);
                bVarS.add(gVar);
                v.u0(list, bVarS);
                fVar = new f(arrayList.size(), va.a.k(bVarS));
            }
            p1 p1Var = this.f13926b;
            if (kotlin.jvm.internal.m.a((f) p1Var.getValue(), fVar)) {
                return;
            }
            p1Var.getClass();
            p1Var.k((Object) null, fVar);
            Iterator it = this.f13935k.iterator();
            while (it.hasNext()) {
                ((h) it.next()).getClass();
            }
            Iterator it2 = this.f13934j.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).getClass();
            }
            Iterator it3 = this.f13933i.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).getClass();
            }
        }
    }
}
