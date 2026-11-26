package p30;

import a10.a0;
import a10.x;
import a10.z;
import d10.e2;
import e30.w;
import h00.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qd.s0;

public final class l {
    public static final l b = new l(y.A);
    public final Map a;

    public l(Map map) {
        this.a = map;
    }

    public final z a(x type) {
        a jVar;
        a aVarA;
        a aVarX;
        kotlin.jvm.internal.m.e(type, "type");
        boolean z = type instanceof a;
        a aVar = z ? (a) type : null;
        a aVarX2 = aVar != null ? aVar.x() : null;
        a aVar2 = z ? (a) type : null;
        a aVarA2 = aVar2 != null ? aVar2.A() : null;
        boolean z2 = false;
        if (aVarX2 != null && aVarA2 != null) {
            z zVarA = a(aVarX2);
            x xVar = zVarA.b;
            a aVar3 = xVar instanceof a ? (a) xVar : null;
            if (aVar3 != null && (aVarX = aVar3.x()) != null) {
                zVarA = new z(zVarA.a, aVarX);
            }
            z zVarA2 = a(aVarA2);
            x xVar2 = zVarA2.b;
            a aVar4 = xVar2 instanceof a ? (a) xVar2 : null;
            if (aVar4 != null && (aVarA = aVar4.A()) != null) {
                zVarA2 = new z(zVarA2.a, aVarA);
            }
            a0 a0Var = zVarA.a;
            x xVar3 = zVarA.b;
            kotlin.jvm.internal.m.b(xVar3);
            x xVar4 = zVarA2.b;
            kotlin.jvm.internal.m.b(xVar4);
            if (e2.a) {
                w wVar = ((i) xVar3).B;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
                w wVar2 = ((i) xVar4).B;
                kotlin.jvm.internal.m.c(wVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
                jVar = new i(e30.c.f((e30.a0) wVar, (e30.a0) wVar2), null);
            } else {
                a aVar5 = (a) xVar3;
                a aVar6 = (a) xVar4;
                jVar = aVar5.equals(aVar6) ? aVar5 : new j(aVar5, aVar6, false, null);
            }
            return new z(a0Var, jVar);
        }
        a10.e eVarS = type.s();
        if (eVarS == null) {
            z zVar = z.c;
            return a.a.I(type);
        }
        z zVar2 = (z) this.a.get(eVarS);
        if (zVar2 == null) {
            z zVar3 = z.c;
            if (!type.r().isEmpty()) {
                List listR = type.r();
                ArrayList arrayList = new ArrayList(h00.r.q0(listR, 10));
                Iterator it = listR.iterator();
                while (it.hasNext()) {
                    x xVar5 = ((z) it.next()).b;
                    arrayList.add(xVar5 != null ? a(xVar5) : z.c);
                }
                boolean zF = type.f();
                List annotations = type.getAnnotations();
                a aVar7 = z ? (a) type : null;
                type = s0.b0(eVarS, arrayList, zF, annotations, aVar7 != null ? aVar7.g() : null);
            }
            return a.a.I(type);
        }
        a0 a0Var2 = zVar2.a;
        x xVar6 = zVar2.b;
        if (xVar6 == null) {
            return zVar2;
        }
        h30.h hVar = (h30.h) xVar6;
        a aVarZ = ((a) hVar).z(type.f() || xVar6.f());
        a aVar8 = z ? (a) type : null;
        if (aVar8 == null || !aVar8.o()) {
            a aVar9 = hVar instanceof a ? (a) hVar : null;
            if (aVar9 != null && aVar9.o() && !type.f()) {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        return new z(a0Var2, aVarZ.y(z2));
    }
}
