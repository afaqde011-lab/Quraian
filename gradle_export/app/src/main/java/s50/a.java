package s50;

import a1.i;
import a1.u0;
import f5.c;
import h00.e0;
import h00.f0;
import h00.n;
import h00.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.ScopeAlreadyCreatedException;
import s30.d;
import s30.f;
import s30.g;
import sd.y1;
import w50.e;

public final class a {
    public c a;
    public final u0 b;
    public final c60.a c;
    public final i d;
    public final me.i e;

    public a() {
        x50.a aVar = x50.a.E;
        p50.a aVar2 = new p50.a(1);
        ((c) aVar2).B = aVar;
        this.a = aVar2;
        this.b = new u0(this);
        this.c = new c60.a(this);
        this.d = new i(this);
        new ConcurrentHashMap();
        new HashMap();
        this.e = new me.i(13);
    }

    public final void a() {
        this.a.E0("Create eager instances ...");
        long jA = f.a();
        i iVar = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) iVar.D;
        e[] eVarArr = (e[]) concurrentHashMap.values().toArray(new e[0]);
        ArrayList arrayListI = va.a.i(Arrays.copyOf(eVarArr, eVarArr.length));
        concurrentHashMap.clear();
        a aVar = (a) iVar.B;
        y1 y1Var = new y1(aVar.a, aVar.c.d, a0.a.b(w50.c.class));
        Iterator it = arrayListI.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(y1Var);
        }
        long jA2 = g.a(jA);
        c cVar = this.a;
        StringBuilder sb = new StringBuilder("Created eager instances in ");
        s30.a aVar2 = s30.b.B;
        sb.append(s30.b.i(jA2, d.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        cVar.E0(sb.toString());
    }

    public final e60.a b(String scopeId, b60.a aVar, Object obj, b60.c cVar) throws ScopeAlreadyCreatedException {
        m.e(scopeId, "scopeId");
        c60.a aVar2 = this.c;
        ConcurrentHashMap concurrentHashMap = aVar2.c;
        a aVar3 = aVar2.a;
        aVar3.a.E0("| (+) Scope - id:'" + scopeId + "' q:'" + aVar + '\'');
        Set set = aVar2.b;
        if (!set.contains(aVar)) {
            aVar3.a.E0("| Scope '" + aVar + "' not defined. Creating it ...");
            set.add(aVar);
        }
        if (concurrentHashMap.containsKey(scopeId)) {
            String s = "Scope with id '" + scopeId + "' is already created";
            m.e(s, "s");
            throw new ScopeAlreadyCreatedException(s);
        }
        e60.a aVar4 = new e60.a(aVar, scopeId, cVar, aVar3, 4);
        if (obj != null) {
            aVar3.a.E0("|- Scope source set id:'" + scopeId + "' -> " + obj);
            aVar4.g = obj;
        }
        e60.a[] aVarArr = {aVar2.d};
        if (aVar4.c) {
            throw new IllegalStateException("Can't add scope link to a root scope");
        }
        aVar4.f.addAll(0, n.V0(aVarArr));
        concurrentHashMap.put(scopeId, aVar4);
        return aVar4;
    }

    public final e60.a c(String str, b60.a aVar) {
        e60.a aVar2 = (e60.a) this.c.c.get(str);
        return aVar2 == null ? b(str, aVar, null, null) : aVar2;
    }

    public final void d(List modules, boolean z) throws DefinitionOverrideException {
        LinkedHashSet linkedHashSet;
        Object next;
        m.e(modules, "modules");
        LinkedHashSet<y50.a> linkedHashSet2 = new LinkedHashSet();
        h00.m mVar = new h00.m(q.C0(modules));
        while (!mVar.isEmpty()) {
            y50.a aVar = (y50.a) mVar.removeLast();
            if (linkedHashSet2.add(aVar)) {
                ArrayList arrayList = aVar.e;
                m.e(arrayList, "<this>");
                Iterator it = new f0(arrayList).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((e0) it).B;
                    if (listIterator.hasPrevious()) {
                        y50.a aVar2 = (y50.a) listIterator.previous();
                        if (!linkedHashSet2.contains(aVar2)) {
                            mVar.addLast(aVar2);
                        }
                    }
                }
            }
        }
        i iVar = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) iVar.D;
        for (y50.a aVar3 : linkedHashSet2) {
            for (Map.Entry entry : aVar3.c.entrySet()) {
                String mapping = (String) entry.getKey();
                w50.b bVar = (w50.b) entry.getValue();
                v50.a aVar4 = bVar.a;
                a aVar5 = (a) iVar.B;
                m.e(mapping, "mapping");
                v50.a aVar6 = bVar.a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) iVar.C;
                if (((w50.b) concurrentHashMap2.get(mapping)) == null) {
                    linkedHashSet = linkedHashSet2;
                } else {
                    if (!z) {
                        String msg = "Already existing definition for " + aVar6 + " at " + mapping;
                        m.e(msg, "msg");
                        throw new DefinitionOverrideException(msg);
                    }
                    c cVar = aVar5.a;
                    linkedHashSet = linkedHashSet2;
                    String msg2 = "(+) override index '" + mapping + "' -> '" + aVar6 + '\'';
                    cVar.getClass();
                    m.e(msg2, "msg");
                    cVar.N0(x50.a.C, msg2);
                    Iterator it2 = concurrentHashMap.values().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!((e) next).a.equals(aVar6));
                    if (((e) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(aVar6.hashCode()));
                    }
                }
                aVar5.a.E0("(+) index '" + mapping + "' -> '" + aVar6 + '\'');
                concurrentHashMap2.put(mapping, bVar);
                linkedHashSet2 = linkedHashSet;
            }
            LinkedHashSet linkedHashSet3 = linkedHashSet2;
            for (e eVar : aVar3.b) {
                concurrentHashMap.put(Integer.valueOf(eVar.a.hashCode()), eVar);
            }
            linkedHashSet2 = linkedHashSet3;
        }
        c60.a aVar7 = this.c;
        aVar7.getClass();
        Iterator it3 = linkedHashSet2.iterator();
        while (it3.hasNext()) {
            aVar7.b.addAll(((y50.a) it3.next()).d);
        }
    }
}
