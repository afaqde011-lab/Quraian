package c60;

import a1.i;
import b60.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import w50.d;

public final class a {
    public static final b e = new b("_root_");
    public final s50.a a;
    public final Set b;
    public final ConcurrentHashMap c;
    public final e60.a d;

    public a(s50.a aVar) {
        this.a = aVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        m.d(setNewSetFromMap, "newSetFromMap(...)");
        this.b = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        b bVar = e;
        e60.a aVar2 = new e60.a(bVar, "_root_", null, aVar, 8);
        this.d = aVar2;
        setNewSetFromMap.add(bVar);
        concurrentHashMap.put("_root_", aVar2);
    }

    public final void a(e60.a scope) {
        m.e(scope, "scope");
        i iVar = this.a.d;
        iVar.getClass();
        w50.b[] bVarArr = (w50.b[]) ((ConcurrentHashMap) iVar.C).values().toArray(new w50.b[0]);
        ArrayList<d> arrayList = new ArrayList();
        for (w50.b bVar : bVarArr) {
            if (bVar instanceof d) {
                arrayList.add(bVar);
            }
        }
        for (d dVar : arrayList) {
            dVar.getClass();
            synchronized (dVar) {
                dVar.c.remove(scope.b);
            }
        }
        this.c.remove(scope.b);
    }
}
