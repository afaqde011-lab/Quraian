package p40;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class g0 extends a {
    public final l40.a a;
    public final l40.a b;
    public final f0 c;

    public g0(l40.a kSerializer, l40.a vSerializer) {
        kotlin.jvm.internal.m.e(kSerializer, "kSerializer");
        kotlin.jvm.internal.m.e(vSerializer, "vSerializer");
        this.a = kSerializer;
        this.b = vSerializer;
        this.c = new f0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.m.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.m.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override
    public final int d(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.m.e(map, "<this>");
        return map.size();
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        Map builder = (Map) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        l40.a aVar2 = this.a;
        f0 f0Var = this.c;
        Object objS = aVar.s(f0Var, i, aVar2, null);
        int iL = aVar.l(f0Var);
        if (iL != i + 1) {
            throw new IllegalArgumentException(w.c.h(i, iL, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objS);
        l40.a aVar3 = this.b;
        builder.put(objS, (!zContainsKey || (aVar3.getDescriptor().getKind() instanceof n40.d)) ? aVar.s(f0Var, iL, aVar3, null) : aVar.s(f0Var, iL, aVar3, h00.d0.O(builder, objS)));
    }

    @Override
    public final Object g(Object obj) {
        kotlin.jvm.internal.m.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override
    public final n40.e getDescriptor() {
        return this.c;
    }

    @Override
    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.m.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        int iD = d(obj);
        f0 f0Var = this.c;
        o40.b bVarA = encoder.A(f0Var, iD);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            bVarA.C(f0Var, i, this.a, key);
            i += 2;
            bVarA.C(f0Var, i2, this.b, value);
        }
        bVarA.a(f0Var);
    }
}
