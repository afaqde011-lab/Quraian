package c30;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import i20.b0;
import i20.i1;
import i20.j0;
import i20.w0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import l9.f0;

public final class n implements u00.k {
    public final int A;
    public final p B;

    public n(p pVar, int i) {
        this.A = i;
        this.B = pVar;
    }

    @Override
    public final Object invoke(Object obj) {
        n20.e it = (n20.e) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(it, "it");
                p pVar = this.B;
                LinkedHashMap linkedHashMap = pVar.a;
                i20.a PARSER = b0.Z;
                kotlin.jvm.internal.m.d(PARSER, "PARSER");
                q qVar = pVar.i;
                byte[] bArr = (byte[]) linkedHashMap.get(it);
                Collection<b0> collectionU0 = bArr != null ? q30.l.u0(q30.l.o0(new av.s(PARSER, new ByteArrayInputStream(bArr), qVar, 1))) : h00.x.A;
                ArrayList arrayList = new ArrayList(collectionU0.size());
                for (b0 b0Var : collectionU0) {
                    a30.u uVar = (a30.u) qVar.b.i;
                    kotlin.jvm.internal.m.b(b0Var);
                    t tVarF = uVar.f(b0Var);
                    if (!qVar.r(tVarF)) {
                        tVarF = null;
                    }
                    if (tVarF != null) {
                        arrayList.add(tVarF);
                    }
                }
                qVar.j(arrayList, it);
                return n30.l.d(arrayList);
            case 1:
                kotlin.jvm.internal.m.e(it, "it");
                p pVar2 = this.B;
                LinkedHashMap linkedHashMap2 = pVar2.b;
                i20.a PARSER2 = j0.f0;
                kotlin.jvm.internal.m.d(PARSER2, "PARSER");
                q qVar2 = pVar2.i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(it);
                Collection<j0> collectionU1 = bArr2 != null ? q30.l.u0(q30.l.o0(new av.s(PARSER2, new ByteArrayInputStream(bArr2), qVar2, 1))) : h00.x.A;
                ArrayList arrayList2 = new ArrayList(collectionU1.size());
                for (j0 j0Var : collectionU1) {
                    a30.u uVar2 = (a30.u) qVar2.b.i;
                    kotlin.jvm.internal.m.b(j0Var);
                    arrayList2.add(uVar2.g(j0Var, false));
                }
                qVar2.k(arrayList2, it);
                return n30.l.d(arrayList2);
            default:
                kotlin.jvm.internal.m.e(it, "it");
                p pVar3 = this.B;
                a30.k kVar = pVar3.i.b;
                byte[] bArr3 = (byte[]) pVar3.c.get(it);
                if (bArr3 != null) {
                    w0 w0Var = (w0) w0.Q.b(new ByteArrayInputStream(bArr3), ((a30.i) kVar.a).p);
                    if (w0Var != null) {
                        a30.u uVar3 = (a30.u) kVar.i;
                        a30.k kVar2 = uVar3.a;
                        k20.g gVar = (k20.g) kVar2.b;
                        h9.f fVar = (h9.f) kVar2.d;
                        List<i20.h> list = w0Var.K;
                        kotlin.jvm.internal.m.d(list, "getAnnotationList(...)");
                        ArrayList arrayList3 = new ArrayList(h00.r.q0(list, 10));
                        for (i20.h hVar : list) {
                            f0 f0Var = uVar3.b;
                            kotlin.jvm.internal.m.b(hVar);
                            arrayList3.add(f0Var.f(hVar, gVar));
                        }
                        u uVar4 = new u(((a30.i) kVar2.a).a, (j10.k) kVar2.c, arrayList3.isEmpty() ? k10.g.a : new k10.i(0, arrayList3), z3.A(gVar, w0Var.E), g4.A((i1) k20.e.d.e(w0Var.D)), w0Var, (k20.g) kVar2.b, fVar, (k20.j) kVar2.e, (k) kVar2.g);
                        List list2 = w0Var.F;
                        kotlin.jvm.internal.m.d(list2, "getTypeParameterList(...)");
                        ui.b bVar = (ui.b) kVar2.a(uVar4, list2, (k20.g) kVar2.b, (h9.f) kVar2.d, (k20.j) kVar2.e, (k20.a) kVar2.f).h;
                        uVar4.b1(bVar.o(), bVar.C(w50.c.l0(w0Var, fVar), false), bVar.C(w50.c.E(w0Var, fVar), false));
                        return uVar4;
                    }
                }
                return null;
        }
    }
}
