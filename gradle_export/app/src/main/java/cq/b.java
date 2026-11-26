package cq;

import d40.o;
import d40.p1;
import h00.d0;
import java.util.LinkedHashMap;
import java.util.Set;
import z1.p;

public final class b {
    public final p1 a;
    public final p1 b;
    public final LinkedHashMap c;

    public b() {
        p1 p1VarC = o.c(c.b);
        this.a = p1VarC;
        this.b = p1VarC;
        g00.k[] kVarArr = {new g00.k(p1VarC.getValue(), ((i) p1VarC.getValue()).b().b())};
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.P(1));
        d0.W(linkedHashMap, kVarArr);
        this.c = linkedHashMap;
    }

    public final void a() {
        Object value;
        p1 p1Var = this.a;
        i iVar = (i) p1Var.getValue();
        if (iVar.b().b().size() > 1) {
            iVar.b().a();
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Set setKeySet = linkedHashMap.keySet();
        kotlin.jvm.internal.m.d(setKeySet, "<get-keys>(...)");
        Object obj = null;
        for (Object obj2 : setKeySet) {
            if (!kotlin.jvm.internal.m.a((i) obj2, iVar)) {
                obj = obj2;
            }
        }
        i iVar2 = (i) obj;
        if (iVar2 == null) {
            return;
        }
        linkedHashMap.remove(iVar);
        do {
            value = p1Var.getValue();
        } while (!p1Var.i(value, iVar2));
    }

    public final void b(i tab) {
        p1 p1Var;
        Object value;
        kotlin.jvm.internal.m.e(tab, "tab");
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.get(tab) == null) {
            linkedHashMap.put(tab, tab.b().b());
        } else {
            p pVar = (p) linkedHashMap.remove(tab);
            if (pVar != null) {
                linkedHashMap.put(tab, pVar);
            }
        }
        do {
            p1Var = this.a;
            value = p1Var.getValue();
        } while (!p1Var.i(value, tab));
    }
}
