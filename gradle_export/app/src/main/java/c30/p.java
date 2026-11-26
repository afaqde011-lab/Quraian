package c30;

import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.play_billing.q1;
import h00.d0;
import i20.j0;
import i20.w0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;

public final class p {
    public static final a10.w[] j;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final d30.e d;
    public final d30.e e;
    public final d30.j f;
    public final d30.i g;
    public final d30.i h;
    public final q i;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(p.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        b0 b0Var = a0.a;
        j = new a10.w[]{b0Var.h(sVar), a1.b.h(p.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, b0Var)};
    }

    public p(q qVar, List functionList, List propertyList, List typeAliasList) {
        kotlin.jvm.internal.m.e(functionList, "functionList");
        kotlin.jvm.internal.m.e(propertyList, "propertyList");
        kotlin.jvm.internal.m.e(typeAliasList, "typeAliasList");
        this.i = qVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : functionList) {
            n20.e eVarA = z3.A((k20.g) qVar.b.b, ((i20.b0) ((o20.b) obj)).F);
            Object arrayList = linkedHashMap.get(eVarA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarA, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = c(linkedHashMap);
        q qVar2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : propertyList) {
            n20.e eVarA2 = z3.A((k20.g) qVar2.b.b, ((j0) ((o20.b) obj2)).F);
            Object arrayList2 = linkedHashMap2.get(eVarA2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(eVarA2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.b = c(linkedHashMap2);
        ((a30.i) this.i.b.a).c.getClass();
        q qVar3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : typeAliasList) {
            n20.e eVarA3 = z3.A((k20.g) qVar3.b.b, ((w0) ((o20.b) obj3)).E);
            Object arrayList3 = linkedHashMap3.get(eVarA3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(eVarA3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.c = c(linkedHashMap3);
        this.d = ((a30.i) this.i.b.a).a.b(new n(this, 0));
        this.e = ((a30.i) this.i.b.a).a.b(new n(this, 1));
        this.f = ((a30.i) this.i.b.a).a.c(new n(this, 2));
        q qVar4 = this.i;
        d30.l lVar = ((a30.i) qVar4.b.a).a;
        o oVar = new o(this, qVar4, 0);
        lVar.getClass();
        this.g = new d30.i(lVar, oVar);
        q qVar5 = this.i;
        d30.l lVar2 = ((a30.i) qVar5.b.a).a;
        o oVar2 = new o(this, qVar5, 1);
        lVar2.getClass();
        this.h = new d30.i(lVar2, oVar2);
    }

    public static LinkedHashMap c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d0.P(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<o20.b> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
            for (o20.b bVar : iterable) {
                int iA = bVar.a();
                int iR = q1.r(iA) + iA;
                if (iR > 4096) {
                    iR = 4096;
                }
                q1 q1VarJ = q1.J(byteArrayOutputStream, iR);
                q1VarJ.n0(iA);
                bVar.d(q1VarJ);
                q1VarJ.A();
                arrayList.add(g00.b0.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    public final Collection a(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return !((Set) ze.d.A(this.g, j[0])).contains(name) ? h00.x.A : (Collection) this.d.invoke(name);
    }

    public final Collection b(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return !((Set) ze.d.A(this.h, j[1])).contains(name) ? h00.x.A : (Collection) this.e.invoke(name);
    }
}
