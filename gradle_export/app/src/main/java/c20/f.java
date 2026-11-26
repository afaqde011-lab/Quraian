package c20;

import d10.r1;
import e30.a0;
import e30.w;
import h00.r;
import j10.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import u00.k;

public final class f implements k {
    public final int A;
    public final j10.e B;

    public f(j10.e eVar, int i) {
        this.A = i;
        this.B = eVar;
    }

    public f(j10.e eVar, g gVar, a0 a0Var, a aVar) {
        this.A = 0;
        this.B = eVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                f30.f kotlinTypeRefiner = (f30.f) obj;
                m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
                u20.d.f(this.B);
                return null;
            case 1:
                p30.m container = (p30.m) obj;
                m.e(container, "container");
                List<r0> listP = this.B.p();
                m.d(listP, "getDeclaredTypeParameters(...)");
                ArrayList arrayList = new ArrayList(r.q0(listP, 10));
                for (r0 r0Var : listP) {
                    m.b(r0Var);
                    arrayList.add(new r1(container, r0Var));
                }
                return arrayList;
            default:
                p30.m it = (p30.m) obj;
                m.e(it, "it");
                Collection collectionL = this.B.f().l();
                m.d(collectionL, "getSupertypes(...)");
                Collection collection = collectionL;
                ArrayList arrayList2 = new ArrayList(r.q0(collection, 10));
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new p30.i((w) it2.next(), null));
                }
                return arrayList2;
        }
    }
}
