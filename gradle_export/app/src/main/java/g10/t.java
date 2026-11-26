package g10;

import e30.w;
import e30.x0;
import h00.d0;
import j10.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import m10.c0;

public abstract class t {
    public static final Set a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        s[] sVarArrValues = s.values();
        ArrayList arrayList = new ArrayList(sVarArrValues.length);
        for (s sVar : sVarArrValues) {
            arrayList.add(sVar.B);
        }
        a = h00.q.r1(arrayList);
        r[] rVarArrValues = r.values();
        ArrayList arrayList2 = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList2.add(rVar.A);
        }
        h00.q.r1(arrayList2);
        b = new HashMap();
        c = new HashMap();
        d0.W(new HashMap(d0.P(4)), new g00.k[]{new g00.k(r.UBYTEARRAY, n20.e.e("ubyteArrayOf")), new g00.k(r.USHORTARRAY, n20.e.e("ushortArrayOf")), new g00.k(r.UINTARRAY, n20.e.e("uintArrayOf")), new g00.k(r.ULONGARRAY, n20.e.e("ulongArrayOf"))});
        s[] sVarArrValues2 = s.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (s sVar2 : sVarArrValues2) {
            linkedHashSet.add(sVar2.C.f());
        }
        d = linkedHashSet;
        for (s sVar3 : s.values()) {
            HashMap map = b;
            n20.b bVar = sVar3.C;
            n20.b bVar2 = sVar3.A;
            map.put(bVar, bVar2);
            c.put(bVar2, sVar3.C);
        }
    }

    public static final boolean a(w wVar) {
        j10.h hVarG;
        if (x0.l(wVar) || (hVarG = wVar.m0().g()) == null) {
            return false;
        }
        j10.k kVarL = hVarG.l();
        return (kVarL instanceof e0) && kotlin.jvm.internal.m.a(((c0) ((e0) kVarL)).F, p.l) && a.contains(hVarG.getName());
    }
}
