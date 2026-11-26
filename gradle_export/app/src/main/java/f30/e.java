package f30;

import a40.g1;
import e30.a0;
import e30.a1;
import e30.m0;
import e30.p0;
import e30.v;
import e30.w;
import e30.z0;
import j10.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

public final class e {
    public static final e a = new e();

    public static a0 b(a0 a0Var) {
        w wVarB;
        m0 m0VarM0 = a0Var.m0();
        ?? r3 = 0;
        if (m0VarM0 instanceof r20.c) {
            r20.c cVar = (r20.c) m0VarM0;
            p0 p0Var = cVar.A;
            p0 p0Var2 = p0Var.a() == a1.D ? p0Var : null;
            z0 z0VarY0 = (p0Var2 == null || (wVarB = p0Var2.b()) == null) ? null : wVarB.y0();
            if (cVar.B == null) {
                Collection collectionL = cVar.l();
                ArrayList arrayList = new ArrayList(h00.r.q0(collectionL, 10));
                Iterator it = collectionL.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w) it.next()).y0());
                }
                cVar.B = new i(p0Var, new c30.e(1, arrayList), (r0) r3, 8);
            }
            h30.b bVar = h30.b.A;
            i iVar = cVar.B;
            kotlin.jvm.internal.m.b(iVar);
            return new h(bVar, iVar, z0VarY0, a0Var.k0(), a0Var.t0(), 32);
        }
        if (!(m0VarM0 instanceof v) || !a0Var.t0()) {
            return a0Var;
        }
        ?? r0 = (v) m0VarM0;
        LinkedHashSet linkedHashSet = r0.B;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            arrayList2.add(ab.a0.n0((w) it2.next()));
            z = true;
        }
        if (z) {
            w wVar = r0.A;
            z0 z0VarN0 = wVar != null ? ab.a0.n0(wVar) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            v vVar = new v(linkedHashSet2);
            vVar.A = z0VarN0;
            r3 = vVar;
        }
        if (r3 != 0) {
            r0 = r3;
        }
        return r0.a();
    }

    public final z0 a(h30.g type) {
        z0 z0VarF;
        kotlin.jvm.internal.m.e(type, "type");
        if (!(type instanceof w)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        z0 z0VarY0 = ((w) type).y0();
        if (z0VarY0 instanceof a0) {
            z0VarF = b((a0) z0VarY0);
        } else {
            if (!(z0VarY0 instanceof e30.q)) {
                throw new NoWhenBranchMatchedException();
            }
            e30.q qVar = (e30.q) z0VarY0;
            a0 a0Var = qVar.C;
            a0 a0Var2 = qVar.B;
            a0 a0VarB = b(a0Var2);
            a0 a0VarB2 = b(a0Var);
            z0VarF = (a0VarB == a0Var2 && a0VarB2 == a0Var) ? z0VarY0 : e30.c.f(a0VarB, a0VarB2);
        }
        g1 g1Var = new g1(1, this, e.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0, 25);
        w wVarG = e30.c.g(z0VarY0);
        return e30.c.I(z0VarF, wVarG != null ? (w) g1Var.invoke(wVarG) : null);
    }
}
